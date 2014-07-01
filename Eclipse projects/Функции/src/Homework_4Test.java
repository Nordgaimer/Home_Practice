import static org.junit.Assert.*;

import org.junit.Test;


public class Homework_4Test {
	//================================================================
	//1) Написать функцию, которая возвращает 
	//строковое название дня недели по номеру дня.
	//================================================================
	@Test
	public void test_1() 
	{
		String act = Homework_4.hw_1(1);
		assertEquals("Sunday", act);
	}
	@Test
	public void test_2() 
	{
		String act = Homework_4.hw_1(2);
		assertEquals("Monday", act);
	}
	@Test
	public void test_3() 
	{
		String act = Homework_4.hw_1(3);
		assertEquals("Tuesday", act);
	}
	@Test
	public void test_4() 
	{
		String act = Homework_4.hw_1(4);
		assertEquals("Thursday", act);
	}
	@Test
	public void test_5() 
	{
		String act = Homework_4.hw_1(5);
		assertEquals("Wednesday", act);
	}
	@Test
	public void test_6() 
	{
		String act = Homework_4.hw_1(6);
		assertEquals("Friday", act);
	}
	@Test
	public void test_7() 
	{
		String act = Homework_4.hw_1(7);
		assertEquals("Saturday", act);
	}

	@Test
	public void test_11()
	{
		String act = Homework_4.hw_1(11);
		assertEquals("We dont have other days", act);
	}

	//================================================================
	//3) Написать функцию, которая находит расстояние 
	//между двумя точками в двумерном декартовом пространстве.
	//================================================================
	@Test
	public void test() {
		int act = Homework_4.hw_3(9,1,1,9);
		assertEquals(11, act);
	}
}
