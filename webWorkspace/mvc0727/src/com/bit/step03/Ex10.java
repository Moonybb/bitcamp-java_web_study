
package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex10 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String initValue = req.getServletContext().getInitParameter("bit");
//		Enumeration<String> enu = getInitParameterNames();
//		while(enu.hasMoreElements()) System.out.println(enu.nextElement());
//		String initValue = getInitParameter("msg9");
		PrintWriter out = resp.getWriter();
		out.println("<h1>HttpServlet2 : "+initValue+"</h1>");
	}
}
