package org.nordgaimer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USERS")
public class User {
	@Id
	@Column (name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name="USERNAME")
	private String userName;
	@Column (name="PASSWORD")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String unserName) {
		this.userName = unserName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
