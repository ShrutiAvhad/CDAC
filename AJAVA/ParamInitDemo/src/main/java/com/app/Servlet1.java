package com.app;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Servlet1
 */

@WebServlet(urlPatterns="/serv1", initParams= {@WebInitParam(name="driver", value="mysql"), @WebInitParam(name="uname",value="admin")})
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private ServletConfig servletConfig;
	private String driverName;
	private String user;
	private String password;
	
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException{
    	super.init();
    	servletConfig = getServletConfig();
    	driverName = servletConfig.getInitParameter("driver");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Enumeration<String> e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String s = e.nextElement();
			pw.write("Nm = "+s+"value = "+servletConfig.getInitParameter(s)+"<br>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
