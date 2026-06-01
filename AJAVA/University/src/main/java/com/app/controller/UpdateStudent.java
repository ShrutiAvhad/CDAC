package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.dao.StudentDao;
import com.app.model.UniversityResult;

/**
 * Servlet implementation class Update
 */

@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet( HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost( HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		int prn = Integer.parseInt(request.getParameter("prn"));
		
		String name = request.getParameter("name");

		int math = Integer.parseInt(request.getParameter("math"));

		int english = Integer.parseInt(request.getParameter("english"));

		int physics = Integer.parseInt(request.getParameter("physics"));

		int chemistry = Integer.parseInt(request.getParameter("chemistry"));

		UniversityResult u = new UniversityResult();

		u.setPrn(prn);
		u.setMath(math);
		u.setEnglish(english);
		u.setPhysics(physics);
		u.setChemistry(chemistry);

		try {

			int i = StudentDao.updateResult(u);

			if (i > 0) {
				pw.write("<h2>Result Updated Successfully</h2>");
			} else {
				pw.write("<h2>Result Update Failed</h2>");
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}