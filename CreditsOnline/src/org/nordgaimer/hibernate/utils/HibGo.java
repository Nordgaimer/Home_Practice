package org.nordgaimer.hibernate.utils;

import java.util.List;

import org.nordgaimer.dao.impl.UserDAOImpl;
import org.nordgaimer.dto.User;
import org.norgaimer.dao.UserDAO;

public class HibGo {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
//		User user1 = new User();
//		//user1.setId(1);
//		user1.setUserName("user_1");
//		user1.setPassword("user_1");
//		User user2 = new User();
//		//user2.setId(2);
//		user2.setUserName("user_2");
//		user2.setPassword("user_2");
//		User user3 = new User();
//		//user3.setId(3);
//		user3.setUserName("user_3");
//		user3.setPassword("user_3");
//		userDAO.addUser(user1);
//		userDAO.addUser(user2);
//		userDAO.addUser(user3);
		
//		List <User> users = userDAO.getAllUsers();
//		for (User user:users){
//			System.out.println(user.getId()+" "+user.getUserName());
//		}
		
//		User user = null;
//		for (User user_look:users){
//			if (user_look.getUserName().contains("user_1")) {
//				user = new User();
//				user.setId(user_look.getId());
//				user.setUserName(user_look.getUserName());
//				user.setPassword(user_look.getPassword());
//				System.out.println("User founded");
//				}
//			}
//		System.out.println(user.getUserName());
		
//		User user_test = userDAO.getUserByName("user_1");
//		System.out.println(user_test.getUserName());
		
		
	}
}
