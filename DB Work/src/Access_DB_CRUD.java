import java.sql.*;

public class Access_DB_CRUD 
{


	static Connection connection = null;
	static Statement stmt = null;
	static ResultSet result = null;


	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		String ulr = "jdbc:odbc:Access.accdb";
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);		
		//=========
		//SELECT
		//=========
		try
		{
			connection = DriverManager.getConnection(ulr);
			stmt = connection.createStatement();
			String sql = "Select * from Persons";
			result = stmt.executeQuery(sql);
			

			while (result.next())
			{
				System.out.println(result.getString("Fname")+" "+result.getString("Lname")+" "+result.getString("Age")+" "+result.getString("Position"));
			}
		} catch (SQLException e)
		{
			// NOP
			e.printStackTrace();
		}
		//=========
		//CREATE
		//=========
		try 
		{
			connection = DriverManager.getConnection(ulr);
			stmt = connection.createStatement();
			String sql = "INSERT INTO Persons (Fname,Lname,Age,Position) VALUES ('Emily','Robson',32,'Manager')";
			stmt.executeUpdate(sql);
			String sql_1 = "Select * from Persons";
			result = stmt.executeQuery(sql_1);

			while (result.next())
			{
				System.out.println(result.getString("Fname")+" "+result.getString("Lname")+" "+result.getString("Age")+" "+result.getString("Position"));
			}

		} catch (SQLException e) 
		{
			// NOP
			e.printStackTrace();
		}
		//=========
		//UPDATE
		//=========
		try
		{
			connection = DriverManager.getConnection(ulr);
			stmt = connection.createStatement();
			String sql = "UPDATE Persons SET Fname='Helen' WHERE id>3";
			stmt.executeUpdate(sql);
			String sql_1 = "Select * from Persons";
			result = stmt.executeQuery(sql_1);

			while (result.next())
			{
				System.out.println(result.getString("Fname")+" "+result.getString("Lname")+" "+result.getString("Age")+" "+result.getString("Position"));
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
			connection = DriverManager.getConnection(ulr);
			String sql = "DELETE FROM Persons WHERE id>4"; 													
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			String sql_1 = "Select * from Persons";
			result = stmt.executeQuery(sql_1);

			while (result.next())
			{
				System.out.println(result.getString("Fname")+" "+result.getString("Lname")+" "+result.getString("Age")+" "+result.getString("Position"));
			}
		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}
	}
}
