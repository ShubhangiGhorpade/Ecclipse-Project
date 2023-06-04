package com.xworkz.lucky1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cat")
public class Cat extends HttpServlet {

	public Cat() {
		System.out.println("No-Arg contst in cat...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing do get in dog...");

		System.out.println(req.getRequestURI());
		System.out.println(req.getRemoteAddr());
		Enumeration<String> reqHeader = req.getHeaderNames();
		while (reqHeader.hasMoreElements()) {
			String headerName = reqHeader.nextElement();
			System.out.println(
					headerName + " : " + req.getHeader(headerName));
		}
		System.out.println("================================");

		String name = req.getParameter("fName");
		String lName = req.getParameter("lName");
		String mobileNo = req.getParameter("mobileNo");
		String email = req.getParameter("email");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print(
				"<html><body><h1>This is my first Response!!!!!</html></body></h1>");
	}

}
