
public class User extends Person
{
	public String login;	
	public User(int id,int age,String Fname,String Lname,String login)
	{
		super.age=age;
		super.id=id;
		super.Lname=Lname;
		super.Fname=Fname;
		this.login=login;
	}
	@Override
	public String toString()
	{
		return super.toString()+login;
	}	
}