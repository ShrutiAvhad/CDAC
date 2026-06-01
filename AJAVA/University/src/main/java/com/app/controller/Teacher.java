package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

import com.app.dao.TeacherDao;
import com.app.model.UniversityResult;

@WebServlet("/teacher")
public class Teacher extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int prn = Integer.parseInt(request.getParameter("prn"));

		UniversityResult u = new UniversityResult();

		u.setPrn(prn);

		try {

			boolean status = TeacherDao.validateUniversityResult(u);
			System.out.println(status+" "+u);

			if (status) {
				response.sendRedirect("SearchStudent.jsp");
				
			} else {
				response.getWriter().write("Invalid PRN");
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		

	}
}