package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Emp03Dao;

@WebServlet("/delete.bit")
public class DeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int sabun = Integer.parseInt(request.getParameter("idx"));
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script type=\"text/javascript\" src=\"js/jquery-1.12.4.js\"></script>");
		out.println("<script>");
		out.println("var result=window.confirm('삭제하시겠습니까?');");
		out.println("if(result) $.post('delete.bit','sabun="+sabun+"?');");
		out.println(",function(){location.href='list.bit';};");
		out.println("else history.back();");
		out.println("</script>");
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int sabun = Integer.parseInt(request.getParameter("sabun"));
		try {
			Emp03Dao dao = new Emp03Dao();
			dao.deleteOne(sabun);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.setStatus(200);
	
	}
}
