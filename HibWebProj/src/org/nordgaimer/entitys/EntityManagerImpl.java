package org.nordgaimer.entitys;

import org.hibernate.Session;
import org.nordgaimer.templates.EntityManagerDAO;
import org.nordgaimer.templates.UserTemplate;
import org.nordgaimer.hibernate.utils.*;

public class EntityManagerImpl implements EntityManagerDAO{

	@Override
	public void addUserEntity(UserTemplate user) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
		
	}

	@Override
	public void deteleUserEntity(UserTemplate user) {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
		
	}

	@Override
	public UserImpl getUserEntity(int id) {
		UserImpl result = null;
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			result=(UserImpl)session.load(UserImpl.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
		return result;
		
	}

}
