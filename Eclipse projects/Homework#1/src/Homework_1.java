
public class Homework_1 {
	//===========================================
	// ���� � � ������ ��������� �*�, ����� �+�
	//===========================================
	public static int hw_1 (int a,int b)
	{
		int res=0;
		if (a%2==0)
		{
			res = a*b;
		}
		else
		{
			res= a+b;	
		}
		return res;
	}
	//===================================================================
	// ���������� ����� �������� ����������� ����� � ������������ (�,�)
	//===================================================================
	public static int hw_2 (double x,double y)
	{
		int res=0;
		if (x>0 && y>0)
		{
			res=1;	
		}

		else if (x<0 && y>0)
		{
			res=2;	
		}
		else if (x<0 && y<0)
		{
			res=3;	
		}
		else if (x>0 && y<0)
		{
			res=4;	
		}
		else
		{
			res=-1;
		}
		return res;
	}
	//===================================================================
	// ����� ����� ������ ������������� �� ���� �����
	//===================================================================
	public static int hw_3 (int a, int b, int c)
	{
		int res = 0;
		if (a>0 && b>0 && c>0) //1
		{
			res=a+b+c;
		}
		if (a>0 && b>0 && c<0) //2
		{
			res=a+b;			
		}
		if (a>0 && b<0 && c<0) //3
		{
			res=a;
		}
		if (a<0 && b>0 && c>0) //4
		{
			res=b+c;
		}
		if (a<0 && b<0 && c>0) //5
		{
			res= c;
		}
		if (a<0 && b>0 && c<0) //6
		{
			res= b;
		}
		if (a<0 && b<0 && c<0) //7
		{
			res=0;
		}
		//		if (a<0 && b<0 && c<0) //8
		//		{
		//			res=0;
		//		}
		return res;
	}
	//===================================================================
	// ��������� ��������� ����(�*�*�, �+�+�)+3
	//===================================================================
	public static int hw_4 (int a,int b,int c)
	{
		int res=0;
		if ((a*b*c)<(a+b+c))
		{
			res=(a+b+c)+3;
		}
		else if ((a*b*c)>(a+b+c))
		{
			res=(a*b*c)+3;
		}
		else if ((a*b*c)==(a+b+c))
		{
			res=0;
		}
		return res;
	}
	//===================================================================
	// �������� ��������� ����������� ������ �������� �� ��� ��������,
	//===================================================================
	public static int hw_5 (int a)    

	{
		if(a < 0 || a > 100)
		{
			throw new IllegalArgumentException();
		}
		char res=' ';   			//1
		if (a<=19)
		{
			res='F';
		}
		else if (a<=39)	//2
		{
			res='E';
		}
		else if ( a<=59)	//3
		{
			res='D';
		}
		else if (a<=74)	//4
		{
			res='C';
		}
		else if (a<=89)	//5
		{
			res='B';
		}
		else if (a<=100)	//6
		{
			res='A';
		}
		else							//7
		{
			res='Z';
		}
		return res;
	}
}


