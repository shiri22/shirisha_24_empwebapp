package com.capgemini.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeBean;

public class EmployeeDAOImple implements EmployeeDAO{

	@Override
	public boolean createEmployeeInfo(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3306/servlets_db?useSSL=false&user=root&password=root";
		String query = "insert into employee values(?,?,?)";
		try (Connection connection = DriverManager.getConnection(url);
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");
			preparedStatement.setInt(1, bean.getEmpId());
			preparedStatement.setString(2, bean.getEmpName());
			preparedStatement.setString(8, bean.getDesignation());
			
			

			int res = preparedStatement.executeUpdate();

			if (res != 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	


	@Override
	public boolean updateEmployeeInfo(EmployeeBean bean) {
		String query = "update employee_info set name=? where eid=?";
		String url = "jdbc:mysql://localhost:3306/servlets_db?useSSL=false&user=root&password=root";
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");
			preparedStatement.setString(1, bean.getEmpName());
			preparedStatement.setInt(2, bean.getEmpId());
			int res = preparedStatement.executeUpdate();
			if (res != 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		String url = "jdbc:mysql://localhost:3306/servlets_db?useSSL=false&user=root&password=root";
		String query = "delete from employee where eid=?";

		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			if (res != 0) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public EmployeeBean getEmployeeDetailsByname(String name) {
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/servlets_db?useSSL=false&user=root&password=root";
		String query = "select * from employee where name=?";
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			Class.forName("com.mysql.jdbc.Driver");

			preparedStatement.setString(1, name);
			res = preparedStatement.executeQuery();
			EmployeeBean bean = new EmployeeBean();
			if (res.next()) {
				bean.setEmpId(res.getInt("eid"));
				bean.setEmpName(res.getString("name"));
				bean.setDesignation(res.getString("designation"));
				return bean;
			} else {
				return null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (res != null) {
					res.close();
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		return null;
	}

	@Override
	public List<EmployeeBean> getAllEmployeeDetails() {
		String url = "jdbc:mysql://localhost:3306/servlets_db?useSSL=false&user=root&password=root";
		String query = "select * from employee ";

		List<EmployeeBean> info = new LinkedList<EmployeeBean>();
		try (Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				ResultSet res = preparedStatement.executeQuery();) {
			Class.forName("com.mysql.jdbc.Driver");
			while (res.next()) {
				EmployeeBean bean = new EmployeeBean();

				bean.setEmpId(res.getInt("eid"));
				bean.setEmpName(res.getString("name"));
				bean.setDesignation(res.getString("designation"));
				info.add(bean);
			}

			if (info.isEmpty()) {
				return null;
			} else {
				return info;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public boolean addEmployeeInfo(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}



	
}
