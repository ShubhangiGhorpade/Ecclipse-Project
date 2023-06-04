package com.xworkz.lucky1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/RoyalEnfield")
public class RoyalEnfield extends HttpServlet {

	public RoyalEnfield() {
		System.out.println("No-Arg const in RoyalEnfield");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Executing do get in RoyalEnfield");
	}
}
