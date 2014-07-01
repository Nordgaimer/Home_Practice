package org.nordgaimer.servlets;

import java.io.IOException;

import javax.imageio.spi.RegisterableService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nordgaimer.services.RegistrationService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/registration")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName;
		String password;
		
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		RegistrationService registrationService = new RegistrationService();
		registrationService.registerUser(userName, password);
		
		
	}

}
