
public class Homework_Math
{
	//===========================================================================
	//1.Стрельба из гаубицы. Дан угол возвышения ствола а и начальная 
	//скорость полёта снаряда. v км/ч. Вычислить расстояние полёта снаряда. 
	//Реализовать решения для угла в градусах и в радианах.
	//===========================================================================	
	public static double hw_1 (double angle, double speed)
	{
		angle=Math.toDegrees(angle);
		double res = ((speed*speed)*2.0*(2*Math.sin(angle))/9.8);
		return res;
	}
	public static double hw_2 (double angle, double speed)
	{
		angle=Math.toRadians(angle);
		double res = ((speed*speed)*2.0*(2*Math.sin(angle))/9.8);
		return res;
	}
	//===========================================================================
	//2. Скорость первого автомобиля v1 км/ч, второго — v2 км/ч, расстояние 
	//между ними s км. Какое расстояние будет между ними через t ч, если
	//автомобили движутся в разные стороны?
	//===========================================================================		

	public static int hw_3(int speed_a, int speed_b, int distance, int hours) 
	{
		int res = distance+((speed_a+speed_b)*hours);
		return res;
	}

	//=====================================================================
	//3. Записать логическое выражение, принимающее значение 1, если точка 
	//лежит внутри заштрихованной области, иначе — 0.
	//=====================================================================
	public static int hw_4 (int x, int y)
	{
		
		int res=-1;

		if (x>=0 && y>=0 && x<=2 && y<=2 && x==y )
		{
			res=1;
		} 
		else if (x<=0 && y>=0 && x<=2 && y<=2 && x==y )
		{
			res=1;
		} 
		else if (x<=0 && y<=0 && x>=-1 && y>=-1 && x==y )
		{
			res=1;
		}
		else if (x<=0 && y<=0 && x>=-1 && y>=-1 && x==y)
		{
			res=1;
		}
		else
		{
			res=0;
		}
		return res;
	}
	//=====================================================================
	//Вычислить значение выражения
	//=====================================================================
	public static double hw_5(double x)
	{
		double e = Math.E;
		double z=(6*Math.log1p(Math.sqrt(Math.pow(x, e+1)+2*(Math.pow(x, e)*Math.cos(x)))))/(Math.log1p((x-Math.pow(x, e+1)*Math.sin(x))))+(Math.abs((Math.cos(x)/Math.pow(e,Math.sin(x)))));
		return z;
	}
}
