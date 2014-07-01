
public class Homework_random_num 
{
	public static void hw_1 ()
	{
		System.out.println(Math.random());
	}
	public static void hw_2 ()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(Math.random());
		}
	}
	public static void hw_3 ()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(Math.random()*10);
		}
	}
	public static void hw_4 ()
	{
		for (int i=0;i<10;i++)
		{
			int a = (int)(30*Math.random()+20); 
			System.out.println(a);
		}
	}
	public static void hw_5 ()
	{
		for (int i=0;i<10;i++)
		{
			int a = (int)(20*Math.random()-10); 
			System.out.println(a);
		}
	}
	public static  void  hw_6 ()
	{
		int c = 0;
		c = (int)Math.round (Math.random()*3+3);
		int tmp = 0;
		for( int i=0;i<c ;i++)
		{
			tmp = (int)Math.round (Math.random()*16 + 20);
			System.out.println(tmp);

		}
		System.out.println("c" +  c);
	}
}
