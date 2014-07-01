import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest 
{
	@Test
	public void testCalc_Plus() 
	{
		int res = Calc.calc(5,5,'+');
		assertEquals(10, res);
	}
	public void testCalc_Minus() 
	{
		int res = Calc.calc(5,5,'-');
		assertEquals(0, res);
	}
	public void testCalc_Mn() 
	{
		int res = Calc.calc(5,5,'*');
		assertEquals(25, res);
	}
	public void testCalc_Del() 
	{
		int res = Calc.calc(5,5,'/');
		assertEquals(1, res);
	}
}
