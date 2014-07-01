package org.nordgaimer.entitys;

import javax.persistence.Entity;

import org.nordgaimer.templates.AdministratorDAO;
import org.nordgaimer.templates.UserTemplate;

@Entity
public class AdminImpl extends UserTemplate implements AdministratorDAO {

	
	public void showControlPanel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addAmout(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdrawAmount(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showPaymentsHistory() {
		// TODO Auto-generated method stub
		
	}

}
