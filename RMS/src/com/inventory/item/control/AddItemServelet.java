package com.inventory.item.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.item.dao.AddItemdao;


@WebServlet("/AddItem")
public class AddItemServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("itemName");
		String date = request.getParameter("date");
		String type = request.getParameter("type");
		String unit = request.getParameter("unit");
		String price = request.getParameter("price");
		
		boolean istrue;
		
		istrue = AddItemdao.insertItem(name, date, type, unit, price);
		
		if (istrue) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
