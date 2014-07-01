package main.java.general;

import main.java.dao.BookDAO;
import main.java.dao.impl.BookDAOImpl;

public class Factory {
	public static Factory instance = new Factory();
	public BookDAO bookDAO;
	private Factory(){}
	
	public static Factory getInstance(){
		return Factory.instance;
	}
	
	public BookDAO getBookDao (){
		if (bookDAO == null) bookDAO = new BookDAOImpl();
		return bookDAO;
	}
}
