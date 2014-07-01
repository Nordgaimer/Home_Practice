package org.nordgaimer.hibernate;

import java.nio.channels.SeekableByteChannel;
import java.util.Date;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nordgaimer.hibernate.utils.HibernateUtil;
import org.nordgaimer.userprops.Adress;
import org.nordgaimer.userprops.UserDetails;

public class HibernateTest { 

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setName("Leo User");
		user.setDescription("Worker");
		user.setJoinedDate(new Date());
		
		Adress adress_1 = new Adress();
		adress_1.setCity("Oakland");
		adress_1.setState("Iowa");
		adress_1.setStreet("A ave.");
		adress_1.setPincode("1123");
		
		Adress adress_2 = new Adress();
		adress_2.setCity("Los-Angeles");
		adress_2.setState("California");
		adress_2.setStreet("B ave.");
		adress_2.setPincode("1125");
		
		user.getListOfAdresses().add(adress_1);
		user.getListOfAdresses().add(adress_2);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		user = (UserDetails) session.get(UserDetails.class, 2);
		System.out.print(user.getListOfAdresses().size());
		
		 
		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		user = (UserDetails)session.get(UserDetails.class,1);
//		System.out.println("USER ="+user.getUserId()+" "+user.getName());
		
		
	}
}

