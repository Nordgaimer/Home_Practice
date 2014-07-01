import java.sql.SQLException;
import java.util.ArrayList;


public class Main 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Persons_DAO pd = new Persons_DAO();
		pd.init();
		
		//pd.cr_person();
		
//		pd.create( new Person( 1,"Bob","Marley",56) );
//		pd.create( new Person( 2,"Michael", "Jackson", 45) );
//		pd.create( new Person( 3,"Edward", "Snowda", 77) );
//		pd.create( new Person( 4,"Alla", "Pugacheva", 30) );
//		pd.delete(4);
//		pd.update("Merelin","Monro", 4);
		
		ArrayList<Person> p_list = pd.read();
		for (Person p : p_list) 
		{
			System.out.println(p);
		}
		

		pd.close();
		
	}
}
