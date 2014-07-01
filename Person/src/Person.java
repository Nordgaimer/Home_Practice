
public class Person
{
	public int id = 1;
	public String Fname = "Michael ";
	public String Lname = "Jackson ";
	public int age = 99;
	@Override
	public String toString ()
	{
		String tmp = Lname+Fname+id+age;
		return tmp; 
	}
}
