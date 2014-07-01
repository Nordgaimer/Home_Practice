package main.java.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import main.java.dao.BookDAO;
import main.java.table.Book;
import main.java.util.HibernateUtil;

public class BookDAOImpl implements BookDAO {

	@Override
	public void addBook(Book book) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
	}

	@Override
	public void deleteBook(Book book) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(book);
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
	}

	@Override
	public Book getBook(int id) throws SQLException {
		Book result = null;
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			result=(Book)session.load(Book.class, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();
		return result;
	}

	@Override
	public List<Book> getBooks() throws SQLException {
		List<Book> books = null;
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			books = session.createCriteria(Book.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if ((session!=null) && (session.isOpen())) session.close(); 
		}
		session.close();		
		return books;
	}

}
