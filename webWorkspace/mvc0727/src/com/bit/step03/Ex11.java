package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/ex11", initParams={
	@WebInitParam(name="msg1",value="abcd2"),
	@WebInitParam(name="msg2",value="abcd2")
	})
public class Ex11 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> enu = getInitParameterNames();
		while(enu.hasMoreElements()){
			String value = getInitParameter(enu.nextElement());
			System.out.println(value);
		}
		PrintWriter out = resp.getWriter();
		out.println("<h1>annotation mapping</h1>");
		
	}
}
