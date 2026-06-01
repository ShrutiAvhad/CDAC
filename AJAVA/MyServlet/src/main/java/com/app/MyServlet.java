package com.app;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/serv1")
public class MyServlet extends HttpServlet{
	
	public MyServlet(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String data = request.getParameter("txtData");
		String engine = request.getParameter("engine");
		
		try {
			if(data.trim().length() == 0)
			{
				throw new Exception();
			}
			if(engine == null)
			{
				throw new Exception();
			}
			
			String url =" ";
			
			if(engine.equals("google"))
			{
				url="https://www.google.com/search?q="+data;
			}
			if(engine.equals("yahoo"))
			{
				url="https://search.yahoo.com/?fr=yfp-t&fr2=p%3Afp%2Cm%3Asb&fp"+data;
			}
			if(engine.equals("bing"))
			{
				url="https://www.bing.com/search?q="+data;
			}
			
			response.sendRedirect(url);

		}catch(Exception e) {
			response.sendRedirect("error.html");
		}
	}
}
