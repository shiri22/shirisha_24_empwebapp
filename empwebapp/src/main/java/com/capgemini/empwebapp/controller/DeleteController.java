package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.services.EmployeeServices;
import com.capgemini.empwebapp.services.EmployeeServicesImple;

@SuppressWarnings("serial")
public class DeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id1");
		EmployeeServices service=new EmployeeServicesImple();
		service.deleteEmployeeInfo(Integer.parseInt(id));
	}

}
