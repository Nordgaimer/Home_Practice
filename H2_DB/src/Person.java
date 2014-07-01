import java.util.*;

public class Person
{	
	int id ;
	String Fname;
	String Lname;
	int age;
	
	public Person()
	{	
	}
	public Person(int id, String Fname, String Lname, int age)
	{	
		this.id = id;
		this.Fname = Fname;
		this.Lname = Lname;
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		String str = "Person[ ";
		str += "ID:" + id;
		str += ", FName:" + Fname;
		str += ", LName:" + Lname;
		str += ", Age:" + age;
		return str;
	}
	

}


