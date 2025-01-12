package com.example.PSpringBoot4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDAOImp implements IemployeePersistency {

	private static final String SQL_QUERY = "SELECT * FROM employee";

	List<Employee> employes;
	
	@Autowired
	private DataSource dataSource;
	
	public EmployeeDAOImp() {
		System.out.println("Employee Bean is created.");
	}
	
	@Override
	public List<Employee> getEmployeesData() {
		 try {
			Connection connection = dataSource.getConnection(); //Connection is from HikariCP
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs = pstmt.executeQuery();
			employes = new ArrayList();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				
				employes.add(emp);
			}
			
			
			
	 		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 	}
		return employes;
	}

}
