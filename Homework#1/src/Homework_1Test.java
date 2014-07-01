import static org.junit.Assert.*;

import org.junit.Test;


public class Homework_1Test {
	//===========================================
	// Если а – четное посчитать а*б, иначе а+б
	//===========================================
	@Test
	public void test_odd() 
	{
		int act = Homework_1.hw_1(4,5);
		assertEquals(20,act);
	}
	@Test
	public void test_even() 
	{
		int act = Homework_1.hw_1(4,5);
		assertEquals(20,act);
	}

	//===================================================================
	// Определить какой четверти принадлежит точка с координатами (х,у)
	//===================================================================
	@Test
	public void test_1_1q() 
	{
		int act = Homework_1.hw_2(1,1);
		assertEquals(1,act);
	}
	@Test
	public void test_minus1_1() 
	{
		int act = Homework_1.hw_2(-1,1);
		assertEquals(2,act);
	}
	@Test
	public void test_minus1_minus1() 
	{
		int act = Homework_1.hw_2(-1,-1);
		assertEquals(3,act);
	}
	@Test
	public void test_1_minus1() 
	{
		int act = Homework_1.hw_2(1,-1);
		assertEquals(4,act);
	}
	//===================================================================
	// Найти суммы только положительных из трех чисел
	//===================================================================
	@Test
	public void test_() 
	{
		int act = Homework_1.hw_3(1,2,3);
		assertEquals(6,act);
	}
	@Test
	public void test_2() 
	{
		int act = Homework_1.hw_3(1,2,-3);
		assertEquals(3,act);
	}
	@Test
	public void test_3() 
	{
		int act = Homework_1.hw_3(1,-2,-3);
		assertEquals(1,act);
	}
	@Test
	public void test_4() 
	{
		int act = Homework_1.hw_3(-1,2,3);
		assertEquals(5,act);
	}
	@Test
	public void test_5() 
	{
		int act = Homework_1.hw_3(-1,-2,3);
		assertEquals(3,act);
	}
	@Test
	public void test_6() 
	{
		int act = Homework_1.hw_3(-1,2,-3);
		assertEquals(2,act);
	}
	@Test
	public void test_7() 
	{
		int act = Homework_1.hw_3(-1,-2,-3);
		assertEquals(0,act);
	}
	//===================================================================
	// Посчитать выражение макс(а*б*с, а+б+с)+3
	//===================================================================
	@Test
	public void test_1_1_1() 
	{
		int act = Homework_1.hw_3(1,1,1);
		assertEquals(3,act);
	}
	@Test
	public void test_2_2_2() 
	{
		int act = Homework_1.hw_3(2,2,2);
		assertEquals(6,act);
	}
	@Test
	public void test_0_0_0() 
	{
		int act = Homework_1.hw_3(0,0,0);
		assertEquals(0,act);
	}
	//===================================================================
	// Написать программу определения оценки студента по его рейтингу,
	//===================================================================
	public class HW_5Test {

		@Test
		public void test_0() 
		{
			int act = Homework_1.hw_5(0);
			assertEquals('F',act);
		}
		@Test
		public void test_20() 
		{
			int act = Homework_1.hw_5(20);
			assertEquals('E',act);
		}
		@Test
		public void test_40() 
		{
			int act = Homework_1.hw_5(40);
			assertEquals('D',act);
		}
		@Test
		public void test_60() 
		{
			int act = Homework_1.hw_5(60);
			assertEquals('C',act);
		}
		@Test
		public void test_75() 
		{
			int act = Homework_1.hw_5(75);
			assertEquals('B',act);
		}
		@Test
		public void test_90() 
		{
			int act = Homework_1.hw_5(90);
			assertEquals('A',act);
		}
		@Test (expected = IllegalArgumentException.class)
		public void test_101 ()
		{
			Homework_1.hw_5(101);
			
		}
		@Test (expected = IllegalArgumentException.class)
		public void test_minus1 ()
		{
			Homework_1.hw_5(-1);
			
		}


	}
}
