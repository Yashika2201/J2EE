package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Products;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addProduct(Products p) {
		jdbcTemplate.update("insert into products values(?, ?, ?, ?, ?)", new Object[] {p.getPid(), p.getName(), p.getPrice(), p.getQuantity(), p.getDescription()});
	}
	@Override
	public List<Products> getprod() {
		return jdbcTemplate.query("select * from products",((rs, num)->{
			Products p = new Products();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQuantity(rs.getInt(4));
			p.setDescription(rs.getString(5));
			return p;
		}));
		
	}

	@Override
	public Products getById(int id) {
		return jdbcTemplate.queryForObject("select * from products where id = ?",new Object[] {id}, ((rs, num)->{
			Products p = new Products();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQuantity(rs.getInt(4));
			p.setDescription(rs.getString(5));
			return p;
		}));
	}
	@Override
	public int updateProduct(Products p) {
		return jdbcTemplate.update("update products set name=?, price=?, quantity=?, description=? where id=?", new Object[] {p.getName(), p.getPrice(), p.getQuantity(), p.getDescription(), p.getPid()});
	}
	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from products where id = ?", new Object[] {id});
	}

}
