package com.xworkz.favourite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class FavouriteServlet extends HttpServlet {

	public FavouriteServlet() {
		System.out.println("Executing in the FavouriteServlet.....");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("Food", req.getParameter("Food"));
		req.setAttribute("Place", req.getParameter("Place"));
		req.setAttribute("Person", req.getParameter("Person"));
		
		String[] laptops= {"dell","hp","Asus"};
		req.setAttribute("laptops1", laptops[0]);
		req.setAttribute("laptops2", laptops[1]);
		req.setAttribute("laptops3", laptops[2]);
		
		
		RequestDispatcher requestDispatcher = req
				.getRequestDispatcher("InfoDisplay.jsp");
		requestDispatcher.forward(req, resp);

	}

}
