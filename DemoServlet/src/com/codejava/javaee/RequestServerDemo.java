package com.codejava.javaee;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/demo-request" })
public class RequestServerDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("phuong thuc request" + req.getMethod());

		System.out.println(req.getServerName());

		System.out.println(req.getServletPath());

		System.out.println(req.getPathInfo());
		
		//tra lai mot doi tuong key
		Enumeration<String> keys=req.getHeaderNames();
		
		while(keys.hasMoreElements()){
			
			//key tiep
			String key=keys.nextElement();
			//lay key value
			System.out.println(key+":"+req.getHeader(key));
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
