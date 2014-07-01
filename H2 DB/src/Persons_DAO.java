import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Persons_DAO
{

	public static void main(String[] args) throws ClassNotFoundException 
	{

		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		String ulr = "jdbc:jdbc:h2:~/test";
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);		
		
		//=========
		//CREATE
		//=========
		
		try 
		{
			connection = DriverManager.getConnection(ulr);
			stmt = connection.createStatement();
			String sql = "CREATE TABLE Persons (id int,Fname varchar,Lname varchar)";
			stmt.executeUpdate(sql);

		}
		catch (SQLException e) 
		{
			// NOP
			e.printStackTrace();
		}

	}

}
