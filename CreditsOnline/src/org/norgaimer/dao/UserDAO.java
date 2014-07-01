package org.norgaimer.dao;

import java.util.*;

import org.nordgaimer.dto.User;

public interface UserDAO {
 public User getUserById (int id);
 
 public List<User> getAllUsers();
 
 public void addUser (User user);
 
 public void deleteUserById (int id);
 
 public void updateUserById (int id);
 
 public User getUserByName(String userName);
}
