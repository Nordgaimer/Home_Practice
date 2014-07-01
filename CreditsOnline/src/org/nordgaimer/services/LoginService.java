package org.nordgaimer.services;


import java.util.ArrayList;
import java.util.List;

import org.nordgaimer.dao.impl.UserDAOImpl;
import org.nordgaimer.dto.User;
import org.norgaimer.dao.UserDAO;


public class LoginService  {

	
	public boolean authenticate (String userName, String password){
		UserDAO userDAO = new UserDAOImpl();
		List<User> users=userDAO.getAllUsers();
		
		//Spell check
		if (userName==null || password == "") return false;
		
		//Searching for user	
		for (User user:users){
			if (userName==user.getUserName() && password==user.getPassword())
				return true;
		}
		//User not found
		return false;
		
	}

	public User getUserDetails(String userName) {
		UserDAO userDAO = new UserDAOImpl();
		User user = userDAO.getUserByName(userName);
//		User user = new User();
//		user.setId(1);
//		user.setUserName("user_1");
//		user.setPassword("user_1");
		
		return user;
	}
}

