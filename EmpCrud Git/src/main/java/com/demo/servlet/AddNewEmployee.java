package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Employee;
import com.demo.service.*;

@WebServlet("/addemp")
public class AddNewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double sal=Double.parseDouble(request.getParameter("sal"));
		EmpService eservice=new EmpServiceImpl();
		Employee e=new Employee(id,name,sal);
		eservice.addnewemp(e);
		RequestDispatcher rd=request.getRequestDispatcher("display");
		rd.forward(request, response);
	}

}
