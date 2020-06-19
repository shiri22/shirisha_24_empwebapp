package com.capgemini.empwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeBean;

@SuppressWarnings("serial")
public class AddController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	    String name=req.getParameter("name");
	    String designation=req.getParameter("designation");
	    
	   
	    
	    EmployeeBean demo=new EmployeeBean();
	    
	    demo.setEmpName(name);
	    demo.setDesignation(designation);
	    EmployeeDAO dao=new EmployeeDAOImple();
	    dao.addEmployeeInfo(demo);
	    boolean check= dao.addEmployeeInfo(demo);

	}
	

}
