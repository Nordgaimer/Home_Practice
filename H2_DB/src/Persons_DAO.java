import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Persons_DAO
{
	Connection conn = null;
	String url = "jdbc:h2:~/test";

	public void init() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection(url,"user","");
	}

	public void close() throws SQLException
	{
		conn.close();
	}

	public void cr_person() throws SQLException
	{
		Statement st = conn.createStatement();
		String sql = "CREATE TABLE Person ( Id int, Fname varchar, Lname varchar, Age int )";
		st.executeUpdate(sql);
		st.close();
	}

	ArrayList<Person> read() throws SQLException
	{
		ArrayList<Person> pp = new ArrayList<Person>(); 

		String qq = "SELECT * FROM Person";
		Statement st = conn.createStatement();
		ResultSet  rs = st.executeQuery(qq);
		while (rs.next())
		{
			Person p = new Person( rs.getInt("id"), rs.getString("Fname"), rs.getString("Lname"), rs.getInt("age") );
			pp.add(p);
		}
		st.close();
		rs.close();
		return pp;
	}

	public void create( Person p ) throws SQLException
	{
		String qq = "INSERT INTO  Person (id,Fname,Lname,Age) VALUES (";
		qq += p.id;
		qq += ",'" + p.Fname + "'";
		qq += ",'" + p.Lname + "'";
		qq += ","  + p.age;
		qq += ")";
		Statement st = conn.createStatement();
		st.executeUpdate(qq);
		st.close();
	}
	
	
	public void delete(int id) throws SQLException
	{
		String qq = "DELETE FROM Person WHERE id=";
		qq += id;
		Statement st = conn.createStatement();
		st.executeUpdate(qq);
		st.close();
	}
	
	public void update(String Fname,String Lname, int id) throws SQLException
	{
		String qq = "UPDATE Person SET Fname=";
		qq +="'"+Fname+"', ";
		qq +="Lname='"+Lname+"' ";
		qq += "WHERE id="+id;
		Statement st = conn.createStatement();
		st.executeUpdate(qq);
		st.close();
	}


	/*
		try 
		{

			stmt = connection.createStatement();
			String sql = "CREATE TABLE Persons (id int,Fname varchar,Lname varchar)";
			stmt.executeUpdate(sql);
			String sql_1 = "INSERT INTO  Persons (id,Fname,Lname) VALUES (1,'Bob','Marley')";
			stmt.executeUpdate(sql_1);
			String sql_2 = "INSERT INTO  Persons (id,Fname,Lname) VALUES (2,'Michael','Jackson')";
			stmt.executeUpdate(sql_2);
			String sql_3= "INSERT INTO  Persons (id,Fname,Lname) VALUES (3,'Edward','Snowdan')";
			stmt.executeUpdate(sql_3);
			String sql_4= "INSERT INTO  Persons (id,Fname,Lname) VALUES (4,'Alla','Pugacheva')";
			stmt.executeUpdate(sql_4);
			String sql_5 = "SELECT * FROM Persons";
			result = stmt.executeQuery(sql_5);

			while (result.next())
			{
				System.out.println(result.getString("id")+" "+result.getString("Fname")+" "+result.getString("Lname"));
			}
		}
		catch (SQLException e) 
		{
			// NOP
			e.printStackTrace();
		}

		//=========
		//UPDATE
		//=========
		try
		{
			connection = DriverManager.getConnection(url,"user","");
			stmt = connection.createStatement();
			String sql = "UPDATE Persons SET Fname='Merelin',Lname='Monro' WHERE id=4";
			stmt.executeUpdate(sql);
			String sql_1 = "Select * from Persons";
			result = stmt.executeQuery(sql_1);

			while (result.next())
			{
				System.out.println(result.getString("id")+" "+result.getString("Fname")+" "+result.getString("Lname"));
			}
		} catch (SQLException e)
		{
			// NOP
			e.printStackTrace();
		}
		//=========
		//DELETE
		//=========
		try
		{
			connection = DriverManager.getConnection(url,"user","");
			stmt = connection.createStatement();
			String sql = "DELETE FROM Persons WHERE id=3"; 													
			stmt.executeUpdate(sql);
			String sql_1 = "Select * from Persons";
			result = stmt.executeQuery(sql_1);

			while (result.next())
			{
				System.out.println(result.getString("id")+" "+result.getString("Fname")+" "+result.getString("Lname"));
			}
		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}

		try 
		{
			connection = DriverManager.getConnection(url,"user","");
			stmt = connection.createStatement();
			String sql = "DROP TABLE Persons"; 													
			stmt.executeUpdate(sql);

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	 */

}
