import static org.junit.Assert.*;

import org.junit.Test;


public class MathTest {

	@Test
	public void testCalc_plus()
	{
		int act = Math.calc(1, 2, '+');
		assertEquals(3, act);
		
	}
	
	@Test
	public void testCalc_minus()
	{
		int act = Math.calc(2, 1, '-');
		assertEquals(1, act);
		
	}
	@Test
	public void testCalc_multiply() 
	{
		int act = Math.calc(1, 2, '*');
		assertEquals(2, act);
		
	}
	@Test
	public void testCalc_divide() 
	{
		int act = Math.calc(2, 1, '/');
		assertEquals(2, act);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testCalc_exeption() 
	{
		int act = Math.calc(3, 0, '/');
		assertEquals(0, act);
		
	}

}
