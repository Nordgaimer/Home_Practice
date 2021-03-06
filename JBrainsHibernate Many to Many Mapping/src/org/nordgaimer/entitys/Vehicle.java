package org.nordgaimer.entitys;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int vehicleId; 
	private String vehicleName;
	@ManyToMany(mappedBy="vehicles")
	private Collection<UserDetails> userDetails = new ArrayList<UserDetails>();

	public Collection<UserDetails> getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(Collection<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

}
