package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.EmployeeService;
import com.demo.model.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("")
	public ModelAndView getEmp() {
		List <Employee> elist = es.getEmployee();
		return new ModelAndView("display", "elist", elist);
	}
	
	@GetMapping("/addemp")
	public String addemp() {
		return "addemp";
	}
	
	@PostMapping("/insertEmployee")
	public ModelAndView addEmp(@RequestParam int empid, @RequestParam String ename, @RequestParam Double sal, @RequestParam String desg, @RequestParam String department) {
		Employee e = new Employee(empid, ename, sal, desg, department);
		es.addemp(e);
		return new ModelAndView("redirect:/employee");
	}
	
	@GetMapping("/editemp/{empid}")
	public ModelAndView findByID(@PathVariable int empid) {
		Employee e = es.find(empid);
		System.out.println("Employee");
		System.out.println(e.getEmpid());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		System.out.println(e.getDepartment());
		System.out.println(e.getDesg());
		return new ModelAndView("editEmployee", "e", e);
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView updateEmp(@RequestParam int empid, @RequestParam String ename, @RequestParam Double sal, @RequestParam String desg, @RequestParam String department) {
		Employee e = new Employee(empid, ename, sal, desg, department);
		es.updateemp(e);
		return new ModelAndView("redirect:/employee");
	}
	
	@GetMapping("/deleteemp/{empid}")
	public ModelAndView deleteByID(@PathVariable int empid) {
		es.delete(empid);
		return new ModelAndView("redirect:/employee");
	}

}
