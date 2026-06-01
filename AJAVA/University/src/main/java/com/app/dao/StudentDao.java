package com.app.dao;

import java.sql.*;

import com.app.model.UniversityResult;

public class StudentDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "Shruti@24");

		System.out.println("Connection established");

		return con;
	}

	public static int universityRegistration(UniversityResult u) throws SQLException, ClassNotFoundException {

		int i = 0;

		System.out.println("u = " + u);

		Connection con = getConnection();

		PreparedStatement pstmt = con.prepareStatement(
				"insert into result " + "(prn, name, math, english, physics, chemistry) " + "values(?,?,?,?,?,?)");

		pstmt.setInt(1, u.getPrn());
		pstmt.setString(2, u.getName());
		pstmt.setInt(3, u.getMath());
		pstmt.setInt(4, u.getEnglish());
		pstmt.setInt(5, u.getPhysics());
		pstmt.setInt(6, u.getChemistry());

		i = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return i;
	}

	public static boolean validateUniversityResult(UniversityResult u) throws ClassNotFoundException, SQLException {

		Connection con = getConnection();

		PreparedStatement pstmt = con.prepareStatement("select * from result where prn=?");

		pstmt.setInt(1, u.getPrn());

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			u.setPrn(rs.getInt("prn"));
			u.setName(rs.getString("name"));

			u.setMath(rs.getInt("math"));
			u.setEnglish(rs.getInt("english"));
			u.setPhysics(rs.getInt("physics"));
			u.setChemistry(rs.getInt("chemistry"));

			int total = rs.getInt("math") + rs.getInt("english") + rs.getInt("physics") + rs.getInt("chemistry");

			double percentage = total / 4.0;

			u.setTotal(total);
			u.setPercentage(percentage);

			rs.close();
			pstmt.close();
			con.close();

			return true;
		}

		rs.close();
		pstmt.close();
		con.close();

		return false;
	}

	public static int updateResult(UniversityResult u) throws ClassNotFoundException, SQLException {

		int i = 0;

		Connection con = getConnection();

		PreparedStatement pstmt = con.prepareStatement("update result set " + "math=?, english=?, physics=?, chemistry=? " + "where prn=?");

		pstmt.setInt(1, u.getMath());
		pstmt.setInt(2, u.getEnglish());
		pstmt.setInt(3, u.getPhysics());
		pstmt.setInt(4, u.getChemistry());
		pstmt.setInt(5, u.getPrn());

		i = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return i;
	}
}