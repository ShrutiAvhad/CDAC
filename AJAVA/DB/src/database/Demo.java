package database;

import java.sql.*;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Scanner s = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","Shruti@24");
		System.out.println("Connection established !!");
		
		PreparedStatement pstmt = con.prepareStatement("insert into employee(name,salary) values(?,?)");
		
		System.out.println("================== Insert Data ================");
		System.out.println("Enter employee name : ");
		String name = s.next();
		System.out.println("Enter employee salary : ");
		double salary = s.nextDouble();
		
		pstmt.setString(1, name);
		pstmt.setDouble(2, salary);
		
		int i = pstmt.executeUpdate();
		if(i==1)
		{
			System.out.println("Record inserted");
		}
		else
		{
			System.out.println("Failed");
		}
		
		ResultSet rs = pstmt.executeQuery("select * from employee");
		System.out.println("-------------------------------------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
				
		
		System.out.println("================= Update Data =================");
		
		
		System.out.println("Enter Id :");
		int id = s.nextInt();
		
		System.out.println("Enter Salary : ");
		double salary1 = s.nextDouble();
		
		PreparedStatement pstmt1 = con.prepareStatement("UPDATE employee SET salary = ? WHERE id = ?");

		pstmt1.setDouble(1, salary1);
		pstmt1.setInt(2,id);

		int j = pstmt1.executeUpdate();
		if(j==1)
		{
			System.out.println("Record updated !");
		}
		else
		{
			System.out.println("Failed to update !");
		}
		
	 rs = pstmt.executeQuery("select * from employee");
		System.out.println("-------------------------------------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		}
		
		
		
		System.out.println("-------------------------------------");
		s.close();
		
		con.close();
	}
}
