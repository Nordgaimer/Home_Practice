
import java.sql.*;

public class SQlite_DB_CRUD
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		Connection connection = null;
		Statement stmt = null;
		ResultSet result = null;
		Driver d = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
		String ulr = "jdbc:sqlite:C:\\Users\\User\\���� Google\\DB\\Persons.db";
		//=========
		//CREATE
		//=========
		try
		{
			connection = DriverManager.getConnection(ulr);
			String sql = "INSERT INTO lib_First_Names VALUES ('8','�������','Jeremy')"; 													
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}
		//=========
		//READ
		//=========
		try 
		{
			connection = DriverManager.getConnection(ulr);
			String sql = "SELECT name_en,name_ru FROM lib_First_Names WHERE id=8"; 													
			stmt = connection.createStatement();
			result = stmt.executeQuery(sql);

			while (result.next())
			{
				System.out.println(result.getString("name_en")+" "+result.getString("name_ru"));
			}
		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}
		//=========
		//UPDATE
		//=========
		try 
		{
			connection = DriverManager.getConnection(ulr);
			String sql = "UPDATE lib_First_Names SET name_en = 'Donald' WHERE id=8";													
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			String sql_1 = "SELECT name_en,name_ru FROM lib_First_Names WHERE id=8"; 				
			stmt = connection.createStatement();
			result = stmt.executeQuery(sql_1);
			while (result.next())
			{
				System.out.println(result.getString("name_en")+" "+result.getString("name_ru"));
			}
		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}
		//=========
		//DELETE
		//=========
		try
		{
			connection = DriverManager.getConnection(ulr);
			String sql = "DELETE FROM lib_First_Names WHERE id=8"; 													
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			String sql_1 = "SELECT name_en,name_ru FROM lib_First_Names WHERE id=8"; 				
			stmt = connection.createStatement();
			result = stmt.executeQuery(sql_1);
			if (result.next())
			{
				System.out.println(result.getString("name_en")+" "+result.getString("name_ru"));
			}
			else
			{
				System.out.println("Id 8 is deleted");
			}

		} catch (SQLException e) {
			// NOP
			e.printStackTrace();
		}
	}
}
