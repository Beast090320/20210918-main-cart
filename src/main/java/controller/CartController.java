package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CartDao;

@WebServlet("/servlet/cart")
public class CartController extends HttpServlet {
	private CartDao cartDao = new CartDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("type");
		type = (type == null) ? "" : type;
		RequestDispatcher rd = null;
		switch (type) {
			case "1":
				rd = req.getRequestDispatcher("/form/cart.jsp"); 
				break;
			case "2":
				rd = req.getRequestDispatcher("/form/record.jsp");
				break;
			default:
				rd = req.getRequestDispatcher("/form/index.jsp");
				req.setAttribute("products", cartDao.queryProducts());
		}
		if(rd != null) {
			rd.forward(req, resp);
		}
	}
	//加入到購物車
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String[] data = req.getParameterValues("data");
		if(id == null) {
			resp.sendRedirect(getServletContext().getContextPath() + "/servlet/cart?");
			
			return;
		}
		Integer userId = Integer.parseInt(id);
		// 將資料存入到 Session 中 (購物車)
		HttpSession session = req.getSession();
		session.setAttribute("userid", userId);
		session.setAttribute("data", data);
		resp.sendRedirect(getServletContext().getContextPath() + "/servlet/cart?type=1");
	}
	
	
	
}