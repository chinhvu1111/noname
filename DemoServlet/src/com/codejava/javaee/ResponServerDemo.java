package com.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/demo-response" })
public class ResponServerDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		// ->text/plain o dang text thoi
		PrintWriter pr = resp.getWriter();

		pr.println("<h1>xin chao toi la ai</h1>");// gui thong bao ve client

		// client chinh la may minh

		// co ben duoi thi khong chay do up them du lieu
		resp.addCookie(new Cookie("a", "a"));

		resp.addHeader("1", "vu hoang long");

		resp.sendError(2000);// viec tra ve co thanh cong hay khong

	}
}
