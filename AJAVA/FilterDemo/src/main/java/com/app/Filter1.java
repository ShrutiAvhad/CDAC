package com.app;

import jakarta.servlet.Filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import jakarta.servlet.*;

@WebFilter("/loginServlet")
public class Filter1 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Filter1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String pwd = request.getParameter("txtPassword");
		pwd = pwd.trim().toUpperCase();
		request.setAttribute("Pass", pwd);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}
}
