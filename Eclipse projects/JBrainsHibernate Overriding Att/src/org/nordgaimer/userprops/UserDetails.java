package org.nordgaimer.userprops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="User_table")
public class UserDetails {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int UserId;
	private String name;
	private Date joinedDate;
	private String description;
	@ElementCollection
	@JoinTable (name="USER_ADRESS", joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator (name="hilo-gen",strategy="hilo")
	@CollectionId (columns = { @Column(name="ADDRESS_ID")}, generator="hilo-gen", type = @Type(type="long"))
	private Collection<Adress> listOfAdresses = new ArrayList<>(); 
	
	
public Collection<Adress> getListOfAdresses() {
		return listOfAdresses;
	}
	public void setListOfAdresses(Collection<Adress> listOfAdresses) {
		this.listOfAdresses = listOfAdresses;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	  
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
