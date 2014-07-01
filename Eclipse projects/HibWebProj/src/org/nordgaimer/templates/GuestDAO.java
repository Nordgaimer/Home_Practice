package org.nordgaimer.templates;

public interface GuestDAO {
	public int register(String email, String password);
	public void logIn(String email, String password);
	
}
