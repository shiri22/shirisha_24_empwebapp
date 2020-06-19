package com.capgemini.empwebapp.services;

import java.util.List;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImple;
import com.capgemini.empwebapp.dto.EmployeeBean;

public class EmployeeServicesImple implements EmployeeServices{
	
	EmployeeDAO dao = new  EmployeeDAOImple();
	
	@Override
	public boolean createEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.createEmployeeInfo(bean);
	}
	
	@Override
	public boolean addEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean updateEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeInfo(bean);
	}
	
	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeInfo(id);
	}
	
	@Override
	public EmployeeBean getEmployeeDetailsByname(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailsByname(name);
	}

	@Override
	public List<EmployeeBean> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean authenticate(int id, String empPass) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
