package com.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/toi","/song"},name="life")
public class HelloServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	resp.setContentType("text/html");
	
	PrintWriter pr=resp.getWriter();
	
	pr.write("Xn chao ai la toi xin moi den duong dan Https://facebook.com");
	
	
}

}
