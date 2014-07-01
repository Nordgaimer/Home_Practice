
public class main 
{

	public static void main(String[] args)
	{
		Person p = new Person();
		Mgr m = new Mgr(2,22,"Bob","Jackson","TL");
		User u = new User(3,35,"Simona","Jackson","Login");

		System.out.println(p);
		System.out.println(m);
		System.out.println(u);

		Person p2 = u;
		System.out.println(p2);
	}

}
