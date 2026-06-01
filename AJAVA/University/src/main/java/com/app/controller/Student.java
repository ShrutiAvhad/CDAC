package com.app.controller;

import java.io.*;
import java.sql.SQLException;

import com.app.dao.StudentDao;
import com.app.model.UniversityResult;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/student")
public class Student extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		int prn = Integer.parseInt(request.getParameter("prn"));

		UniversityResult u = new UniversityResult();

		u.setPrn(prn);

		try {

			boolean status = StudentDao.validateUniversityResult(u);

			if (status) {
				request.setAttribute("result", u);

				request.getRequestDispatcher("result.jsp").forward(request, response);
			} else {
				pw.write("<h2>Invalid PRN</h2>");
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		doGet(request, response);
	}
}