package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpFilter;

public class MyFilter extends HttpFilter implements Filter {
    
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, jakarta.servlet.ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("In doFilter");

		PrintWriter pw = response.getWriter();
		pw.write("Pre-processor -- filter involked after<br>");
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		pw.write("post-processor -- filter involked before<br>");
	}

}
