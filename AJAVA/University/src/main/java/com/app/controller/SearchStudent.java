package com.app.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

import com.app.dao.TeacherDao;
import com.app.model.UniversityResult;

@WebServlet("/searchstudent")
public class SearchStudent extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int prn = Integer.parseInt(request.getParameter("prn"));

		UniversityResult u = new UniversityResult();

		u.setPrn(prn);

		try {

			boolean status = TeacherDao.getStudentResult(u);

			if (status) {

				request.setAttribute("result", u);

				request.getRequestDispatcher("Tupdate.jsp").forward(request, response);

			} else {

				response.getWriter().write("Student Not Found");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}