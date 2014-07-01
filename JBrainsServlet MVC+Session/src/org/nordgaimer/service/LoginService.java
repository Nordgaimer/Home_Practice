package org.nordgaimer.service;

import java.util.HashMap;

import org.nordgaimer.dto.User;





public class LoginService {	
	HashMap<String, String>  users = new HashMap<>();
	
	
	
	public LoginService(){
	users.put("user_1", "user_1_pass");	
	users.put("user_2", "user_2_pass");	
	users.put("user_3", "user_3_pass");	
	}
	public boolean authenticate (String userId, String password){
		if (userId==null || password.trim() == "") {
			return false;
		}
		return true;
	}
	// In real world data comes from DB
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	
	}

}
