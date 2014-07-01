package org.nordgaimer.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nordgaimer.entitys.Adress;
import org.nordgaimer.entitys.UserDetails;
import org.nordgaimer.entitys.Vehicle;

public class HibernateTest { 

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setName("First User");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car Volvo");
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("Car BMW");
		
		user.getVehicles().add(vehicle);
		user.getVehicles().add(vehicle2);
//		
//		Adress adress_1 = new Adress();
//		adress_1.setCity("Oakland");
//		adress_1.setState("Iowa");
//		adress_1.setStreet("A ave.");
//		adress_1.setPincode("1123");
//		
//		Adress adress_2 = new Adress();
//		adress_2.setCity("Los-Angeles");
//		adress_2.setState("California");
//		adress_2.setStreet("B ave.");
//		adress_2.setPincode("1125");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2 );
		session.getTransaction().commit();
		session.close();
		
		 
	
		
	}
}

