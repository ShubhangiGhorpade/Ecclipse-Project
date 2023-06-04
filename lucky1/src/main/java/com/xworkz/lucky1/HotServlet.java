package com.xworkz.lucky1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class HotServlet extends HttpServlet {
	
	public HotServlet() {
		System.out.println("No Arg const in HotServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing do get....");
	}
	
}
