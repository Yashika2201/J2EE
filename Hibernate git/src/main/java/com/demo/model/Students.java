package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.Entity;

@Entity
@Table(name = "Students")
public class Students {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private int sid;
	@Column(name = "Student_Name", nullable=false)
	private String sname;
	@Column(name = "Grade", nullable=false)
	private char grade;
	
	public Students(String sname, char grade) {
		super();
//		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", grade=" + grade + "]";
	}
	
	
}
