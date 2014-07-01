package org.nordgaimer.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartServlet
 */
@WebServlet("/StartServlet")
public class StartServlet extends DispatcherServlet {
	private static final long serialVersionUID = 1121231241112341241L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("enter")!=null)super.forward("/myServlet", request, response);
		if (request.getParameter("register")!=null)super.forward("/registration.jsp", request, response);
	}

}
