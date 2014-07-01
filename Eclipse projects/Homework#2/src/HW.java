public class HW 
{
	public static void hw_1 ()
	{
		for (int i=0;i<7;i++)
		{
			System.out.println("*******");	
		}
	}

	public static void hw_2 ()
	{
		int point=0;
		System.out.println("*******");
		for (int i=0;i<6;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j){
					System.out.print("*");					
				}
				else
					System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println("*******");	
	}

	public static void hw_3()
	{
		int point=6;
		for (int i=0;i<6;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j){
					System.out.print("*");					
				}
				else
					System.out.print(" ");
			}
			System.out.println("*");
			point--;
		}
		System.out.println("*******");
	}

	public static void hw_4()
	{
		int point=1;
		System.out.println("*******");
		for (int i=0;i<6;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j){
					System.out.print("*");					
				}
				else
					System.out.print(" ");
			}
			System.out.println("*");
			point++;
		}
	}
	public static void hw_5()
	{
		int point=0;
		System.out.println("*");
		for (int i=0;i<5;i++)
		{
			System.out.print("*");
			for (int j=0;j<5;j++)
			{
				if (point==j){
					System.out.print("*");					
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			point++;
		}
		System.out.println("*******");
	}

	public static void hw_6()
	{
		int point=4;
		System.out.println("*******");
		for (int i=0;i<6;i++)
		{
			System.out.print("*");
			for (int j=0;j<5;j++)
			{
				if (point==j)
				{
					System.out.print("*");					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			point--;
		}

	}
	public static void hw_7()
	{
		int point=1;
		int endpoint=5;
		System.out.println("*******");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j)
				{
					System.out.print("*");					
				}
				else if (endpoint==j)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
			point++;
			endpoint--;
		}
	}

	public static void hw_8()
	{
		int point=0;
		int endpoint=6;
		System.out.println("*");
		for (int i=0;i<7;i++)
		{
			System.out.print("*");
			for (int j=0;j<6;j++)
			{
				if (point==j && point<4)
				{
					System.out.print("*");					
				}
				else if (endpoint==j && endpoint<4)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
			point++;
			endpoint--;
		}
		System.out.println("*");
	}

	public static void hw_9()
	{
		int point=6;
		int endpoint=0;
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j && point>=3)
				{
					System.out.print("*");					
				}
				else if (endpoint==j && endpoint>=4)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println("*");
			point--;
			endpoint++;
		}
	}

	public static void hw_10()
	{
		int point=4;
		int endpoint=2;
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<6;j++)
			{
				if (point==j && point<=3)
				{
					System.out.print("*");					
				}
				else if (endpoint==j && endpoint>=3)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
			point--;
			endpoint++;
		}
		System.out.println("*******");
	}
	public static void hw_11()
	{
		int point=0;
		int endpoint=6;
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<7;j++)
			{
				if (point==j)
				{
					System.out.print("*");					
				}
				else if (endpoint==j)
				{
					System.out.print("*");					
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
			point++;
			endpoint--;
		}
	}
}
