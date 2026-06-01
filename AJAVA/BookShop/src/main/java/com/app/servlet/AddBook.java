package com.app.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Book;
import com.app.utility.HibernateUtil;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/addBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		double price = Double.parseDouble(request.getParameter("price"));
		
		Book book = new Book(title, author, price);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction t = session.getTransaction();
		session.persist(book);
		t.commit();
		session.close();
		
		response.sendRedirect("viewBook");
	}

}
