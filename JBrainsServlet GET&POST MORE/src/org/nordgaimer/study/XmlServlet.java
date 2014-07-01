package org.nordgaimer.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from getMethod");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Hello! " + userName);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from postMethod");
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		output.println("Hello! " + userName + " " + fullName);
		
		//Single parameter//
		String prof = request.getParameter("prof");
		output.println("You are a "+prof);
		
		//A lot of parameters//
		String [] location = request.getParameterValues("location");
		output.println("You are from "+location.length + "places");
		for (int i=0;i<location.length;i++){
		output.println(location[i]);
		}
		
	}	

}
