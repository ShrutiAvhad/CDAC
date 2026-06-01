package com.app;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletContext servletContext;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException{
    	super.init();
    	servletContext = getServletContext();
    	
    	System.out.println("Parameter = "+servletContext.getInitParameter("Apache Tomcat"));
    	
    	Enumeration<String>e = servletContext.getInitParameterNames();
    	while(e.hasMoreElements())
    	{
    		String str = e.nextElement();
    		System.out.println(str+" "+servletContext.getInitParameter(str));
    	}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
