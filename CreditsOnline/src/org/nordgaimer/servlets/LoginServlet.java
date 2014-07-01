package org.nordgaimer.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nordgaimer.dto.User;
import org.nordgaimer.services.LoginService;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName;
		String password;
		
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userName, password);
		if (result) {
//			User user = loginService.getUserDetails(userName);
//			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			return;
		}else{
			response.sendRedirect("register.jsp");
			return;
		}
	}

}
