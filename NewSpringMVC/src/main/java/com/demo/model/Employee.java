package com.demo.model;

public class Employee {
	private int empid;
	private String ename; 
	private double sal;
	private String desg;
	private String department;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double sal, String desg, String department) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", desg=" + desg + ", department="
				+ department + "]";
	}
	
	
}
