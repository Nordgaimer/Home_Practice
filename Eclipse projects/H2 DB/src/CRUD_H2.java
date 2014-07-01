import java.sql.*;
public class CRUD_H2
{

	public static void main(String[] args) throws ClassNotFoundException 
	{

		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		String ulr = "jdbc:odbc:";
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);		
		
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

	}

}
