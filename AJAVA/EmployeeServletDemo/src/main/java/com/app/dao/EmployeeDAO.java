package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDAO {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Shruti@24");
		System.out.println("connection established..");
		return con;
	}
	
	public static int enmployeeRegistration(Employee e) throws SQLException, ClassNotFoundException {
		int i = 0;
		
		System.out.println("e = "+e);
		Connection con = getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into employee(firstname, password, email, gender,age) values(?,?,?,?,?)");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
}
