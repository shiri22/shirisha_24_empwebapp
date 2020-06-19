package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dto.EmployeeBean;
import com.capgemini.empwebapp.services.EmployeeServices;
import com.capgemini.empwebapp.services.EmployeeServicesImple;

@SuppressWarnings("serial")
public class EmployeeServlets extends HttpServlet {
	
	private EmployeeServices service= new EmployeeServicesImple();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get query string
		String empIdVal = req.getParameter("empId");
		String empId =req.getParameter(empIdVal);
		String empName = req.getParameter("empName");
		String designation = req.getParameter("designation");
		
		
		EmployeeBean bean  = new EmployeeBean();
		bean.getEmpId();
		bean.getEmpName();
		bean.getDesignation();
		
		boolean isAdded= service.addEmployeeInfo(bean);
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		if(isAdded) {
			out.println("<h2 style'color: green'>Employee Added susscessfully.....</h2>");
		}else {
			out.println("<h2 style'color: red'>unable to add employee!!!</h2>");
			
		}
		out.println("</body>");
		out.println("</html>");

		

		
		
	}


}
