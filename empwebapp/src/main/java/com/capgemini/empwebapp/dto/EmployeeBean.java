package com.capgemini.empwebapp.dto;

import java.io.Serializable;
import lombok.Data;
@Data
@SuppressWarnings("serial")
public class EmployeeBean implements Serializable {
		 private int empId;
		 private String empName;
		 private  String designation;
		 private String password;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		 

}