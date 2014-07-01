package org.nordgaimer.templates;

import org.nordgaimer.entitys.UserImpl;

public interface EntityManagerDAO {
	public void addUserEntity(UserTemplate user);
	public void deteleUserEntity(UserTemplate user);
	public UserImpl getUserEntity(int id);
}
