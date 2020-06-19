package com.capgemini.empwebapp.dao;

import java.util.List;
import com.capgemini.empwebapp.dto.EmployeeBean;

public interface EmployeeDAO {
	
	  public boolean createEmployeeInfo(EmployeeBean bean);
	  public boolean addEmployeeInfo(EmployeeBean bean);
	  public boolean updateEmployeeInfo(EmployeeBean bean);
	  public boolean deleteEmployeeInfo(int id);
	  public EmployeeBean getEmployeeDetailsByname(String name);
	  public List<EmployeeBean> getAllEmployeeDetails();
	  
}
	
