package com.demo.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;
import com.demo.beans.*;

@WebServlet("/delete")
public class DeleteById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("id"));
		EmpService eservice = new EmpServiceImpl();
		eservice.deleteEmp(eid);
		RequestDispatcher rd = request.getRequestDispatcher("display");
		rd.forward(request, response);
	}
	

}
