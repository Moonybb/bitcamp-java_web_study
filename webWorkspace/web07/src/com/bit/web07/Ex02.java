package com.bit.web07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String msg = req.getParameter("msg");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"EUC-KR\"");
		out.println("</head");
		out.println("<body>");
		out.println("		<h1>ex02 page</h1>");
		out.println("		<h2>msg="+msg+"</h2");
		for(int i=0;i<5;i++){
			out.println("                               <p>print"+i+"</p>");
		}
		out.println("</body>");
		out.println("</html");

		out.flush();
		out.close();
	}
}
