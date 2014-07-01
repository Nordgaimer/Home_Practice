package main.java.general;

import java.sql.SQLException;

import main.java.dao.BookDAO;
import main.java.table.Book;

public class Project {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();
		BookDAO bookDAO = factory.getBookDao();
		bookDAO.addBook(new Book());
		
	}

}
