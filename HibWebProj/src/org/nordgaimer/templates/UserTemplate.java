package org.nordgaimer.templates;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
@Entity
public class UserTemplate {
	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	@Column  (name="EMAIL")
	private String email;
	@Column  (name="PASSWORD")
	private String password;
	@Column  (name="REGISTERED_DATE")
	private Date registeredDate;
	@Column  (name="CURRENT_BALANCE")
	private double currentBalance;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	@Override
	public String toString() {
		return "User email=" + email + ", password=" + password
				+ ", registeredDate=" + registeredDate + ", currentBalance=" + currentBalance + "]";
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(currentBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((registeredDate == null) ? 0 : registeredDate.hashCode());
		result = prime * result;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTemplate other = (UserTemplate) obj;
		if (Double.doubleToLongBits(currentBalance) != Double
				.doubleToLongBits(other.currentBalance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (registeredDate == null) {
			if (other.registeredDate != null)
				return false;
		} else if (!registeredDate.equals(other.registeredDate))
			return false;
	
		return true;
	}
	
	

}
