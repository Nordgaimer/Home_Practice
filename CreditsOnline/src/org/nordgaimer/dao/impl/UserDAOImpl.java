package org.nordgaimer.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nordgaimer.dto.User;
import org.nordgaimer.hibernate.utils.HibernateUtil;
import org.norgaimer.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public User getUserById(int id) {
		User user = null;
		Session session = null;
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		user = (User) session.load(User.class, id);
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		return user;
	}

	//Working
	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		Session session = null;
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		users = session.createCriteria(User.class).list();
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		return users;
	}

	//Working
	@Override
	public void addUser(User user) {
		Session session = null;
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
	}

	@Override
	public void deleteUserById(int id) {
		User user = null;
		Session session = null;
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (User) session.load(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
	}

	@Override
	public void updateUserById(int id) {
		// TODO Auto-generated method stub
		
	}
	public User getUserByName(String userName) {
		User user = null;
		Session session = null;
		List<User> users = null;
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		users = session.createCriteria(User.class).list();
		for (User user_look:users)
			if (user_look.getUserName()==userName) {
				user = new User();
				user.setId(user_look.getId());
				user.setUserName(user_look.getUserName());
				user.setPassword(user_look.getPassword());
				}
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		return user;
	}

}
