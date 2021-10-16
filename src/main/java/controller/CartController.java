package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/cart")
public class CartController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("type");
		RequestDispatcher rd = null;
		switch (type) {
			case "1":
				rd = req.getRequestDispatcher("/form/cart.jsp"); 
				break;
			case "2":
				rd = req.getRequestDispatcher("/form/record.jsp");
				break;
		}
		if(rd != null) {
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect(getServletContext().getContextPath() + "/servlet/cart?type=1");
	}
	
	
	
}