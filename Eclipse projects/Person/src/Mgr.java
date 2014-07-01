
public class Mgr extends Person
{
	public String position;
	public Mgr(int id, int age, String Fname,String Lname,String position)
	{
		super.age=age;
		super.id=id;
		super.Lname=Lname;
		super.Fname=Fname;
		this.position=position;
	}
	@Override
	public String toString()
	{
		return super.toString()+position;
	}
}
