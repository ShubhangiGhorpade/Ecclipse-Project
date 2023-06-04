package com.xworkz.shubhangi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/country")
public class CountryInfo extends HttpServlet {

	public CountryInfo() {
		System.out.println("No-Arg consrtructor in CountryInfo.....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String countryName = req.getParameter("cName");
		String code = req.getParameter("code");
		String population = req.getParameter("population");
		String capitalCity = req.getParameter("cCity");

		System.out.println("countryName :" + countryName + "  " + "code :"
				+ code + "  " + "population :" + population + "  "
				+ "capitalCity :" + capitalCity);

		String pmName = req.getParameter("pmName");
		// System.out.println("PMName: " + pmName);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body bgcolor='pink'>");
		writer.print("<h1>");
		writer.print("This is the Info of Country!!!" + "</br>");
		writer.print("CountryName: " + countryName + "</br>");
		writer.print("Code: " + code + "</br>");
		writer.print("Population: " + population + "</br>");
		writer.print("CapitalCity: " + capitalCity + "</br>");

		
		writer.print("<form method='get' action='PMSend'>");
		writer.print("<h3>");

		writer.print("Enter PM Name" + "</br>");

		writer.print("</h3>");
		writer.print(
				"PM Name:<input type='text' name='pmName'>" + "</br>");
		writer.print("<input type='submit' value='send'>");
	
		writer.print("</form>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

	}

}
