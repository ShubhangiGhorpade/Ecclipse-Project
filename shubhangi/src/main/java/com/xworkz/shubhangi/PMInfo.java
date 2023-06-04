package com.xworkz.shubhangi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/PMSend")
public class PMInfo extends HttpServlet {

	public PMInfo() {
		System.out.println(" No-Arg constrt in PmInfo....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String pmName = req.getParameter("pmName");
		System.out.println("PMName: " + pmName);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h2>");
		writer.print("PM Info!!!</br> ");
		
		writer.print("</h2>");
		writer.print("<h3>");
		writer.print("PMName: " + pmName+"</br>");
		writer.print("</h3>");
		writer.print("</body>");
		writer.print("</html>");
		
		writer.print("<a href='index.html'>Go to Index</a>");

	}

}
