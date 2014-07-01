
public class Homework_2
{
	public static int hw_1_sum (int a)
	{
		int sum=0;
		for (int i=0;i<a;i++)
		{
			if (i%2==0)
			{
				sum+=i;				
			}
		}
		return sum;		
	}

	public static int hw_1_count (int a)
	{
		int j=0;
		for (int i=0;i<a;i++)
		{
			if (i%2==0)
			{
				j++;
			}
		}
		return j;
	}

	public static int hw_2 (int a)
	{
		int res;
		int j=0;
		for (int i=2;i<a+1;i++)
		{
			if  (a%i==0)
				j++;	
		}

		if (j==1)
		{
			res=1;
		}
		else
		{
			res=2;
		}
		return res;
	}

	public static int hw_3 (int a)
	{
		int res=0;
		res=(int)Math.sqrt(a);
		return res;

	}
	public static int hw_4 (int a)
	{
		int tmp = 1;
		for (int i=1;i<=a;i++)
		{
			tmp=tmp*i;
		}
		return tmp;
	}
	public static int hw_5 (int a)
	{
		int sum=0;
		while(a != 0)
		{
			sum = sum + (a % 10);
			a/=10;
		}
		return sum;
	}
	public static void hw_6 (int a)
	{
		String b=String.valueOf(a);
		char [] arr = b.toCharArray();		
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
