package com.demo.dao;

import java.util.List;

import org.hibernate.Query;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.Myuser;


public class UserDaoImpl implements UserDao{
	static SessionFactory sf;
	static
	{
		sf=HibernateUtil.getMySessionFactory();
	}

	@Override
	public void save(Myuser u) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
		
		
	}

	@Override
	public List<Myuser> findAll() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from Myuser");
		List<Myuser> ulist=query.list();
		tr.commit();
		session.close();
		return ulist;
		
		
		
	}

	@Override
	public Myuser findById(int uid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class,uid);
		tr.commit();
		session.close();
		return u;
		
	
	}

	@Override
	public boolean deleteById(int uid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class,uid);
		if(u!=null)
		{
		session.delete(u);
		tr.commit();
		session.close();
		return true;
	}
	
	session.close();
		return false;
		
	}


	@Override
	public boolean updateById(int uid, String unm, String street) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class,uid);
		
		if(u!=null)
		{
			u.setUname(unm);
			u.getAddr().setStreet(street);
			session.update(u);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	@Override
	public List<Myuser> sortById() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from user u order by u.uid desc");
		List<Myuser> ulist=query.list();
		tr.commit();
		session.close();
		return ulist;
		
	}

	@Override
	public void closeMyServiceFactory() {
		HibernateUtil.closeMySessionFactory();
		
	}

}
