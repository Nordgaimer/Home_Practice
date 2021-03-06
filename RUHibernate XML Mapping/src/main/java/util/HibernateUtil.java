package main.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private HibernateUtil(){}
		
	static{
		try{
			sessionFactory = new Configuration().buildSessionFactory();
		}catch (Exception e){
			e.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
