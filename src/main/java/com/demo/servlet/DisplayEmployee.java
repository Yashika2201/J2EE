package com.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;
import com.demo.beans.*;

@WebServlet("/display")
public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eservice = new EmpServiceImpl();
		List<Employee> elist = eservice.getAllEmployees();
		request.setAttribute("elist", elist);
		RequestDispatcher rd = request.getRequestDispatcher("displayemp.jsp");
		rd.forward(request, response);
	}

}
