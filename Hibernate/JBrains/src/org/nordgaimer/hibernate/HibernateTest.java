package org.nordgaimer.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.nordgaimer.entitys.FourWheeler;
import org.nordgaimer.entitys.TwoWheeler;
import org.nordgaimer.entitys.Vehicle;
import org.nordgaimer.hibernate.utils.HibernateUtil;

public class HibernateTest { 

	public static void main(String[] args) { 
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle" );
		 
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porshe");
		car.setSteeringWheel("Porshe Steering Wheel");

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(car);
		session.save(vehicle);
		session.save(bike);
		session.getTransaction().commit();
		session.close();
		
		 
	
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
	}
}

