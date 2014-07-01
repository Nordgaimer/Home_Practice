
public class HW_2
{
	public  static void  hw_1 ()
	{
		int count=1;
		int [][]arr = new int [7][7];
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<7;j++)
			{
				arr [i][j]=count;
				System.out.print(arr [i][j]);
			}
			System.out.println();
			count ++;
		}
	}

	public  static void  hw_2 ()
	{
		int count=3;
		int [][]arr = new int [7][7];
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<7;j++)
			{
				arr [i][j]=count;
				System.out.print(arr [i][j]);
			}
			System.out.println();
			count --;
		}
	}

	public  static void  hw_3 ()
	{	
		int count=1;
		int [][]arr = new int [7][7];
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<7;j++)
			{
				arr [i][j]=count;
				System.out.print(arr [i][j]);
			}
			System.out.println();
			count++;
		}
	}

	public  static void  hw_4 ()
	{
		int count=3;
		int [][]arr = new int [7][7];
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<7;j++)
			{
				arr [i][j]=count--;
				System.out.print(arr [i][j]);
			}
			System.out.println();
			count=3;
		}

	}
}
