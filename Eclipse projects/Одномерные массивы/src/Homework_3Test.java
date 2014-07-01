import static org.junit.Assert.*;

import org.junit.Test;


public class Homework_3Test 
{

	//================================================================
	//1) Найти минимальный элемент массива
	//================================================================
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void testHw1_0() 
	{
		int[] ar = {};
		int act = Homework_3.hw_1(ar);
		assertEquals(2, act);
	}
	@Test
	public void testHw1_1() 
	{
		int[] ar = {10};
		int act = Homework_3.hw_1(ar);
		assertEquals(10, act);
	}
	@Test
	public void testHw1_2() 
	{
		int[] ar = {10,20};
		int act = Homework_3.hw_1(ar);
		assertEquals(10, act);
	}
	@Test
	public void testHw1_many() 
	{
		int[] ar = {10,20,33,11,8,2};
		int act = Homework_3.hw_1(ar);
		assertEquals(2, act);
	}


	//================================================================
	//2) Найти индекс максимального элемента массива
	//================================================================
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void testHw2_0() 
	{
		int[] ar = {};
		Homework_3.hw_2(ar);

	}
	@Test
	public void testHw2_1() 
	{
		int[] ar = {10};
		int act = Homework_3.hw_2(ar);
		assertEquals(0, act);
	}
	@Test
	public void testHw2_2() 
	{
		int[] ar = {10,20};
		int act = Homework_3.hw_2(ar);
		assertEquals(1, act);
	}
	@Test
	public void testHw2_many() 
	{
		int[] ar = {10,20,33,11,8,2};
		int act = Homework_3.hw_2(ar);
		assertEquals(2, act);
	}
	//================================================================
	//3)Посчитать сумму элементов массива с нечетными индексами
	//================================================================
	@Test 
	public void testHw3_0() 
	{
		int[] ar = {};
		int act = Homework_3.hw_3(ar);
		assertEquals(0, act);

	}
	@Test
	public void testHw3_1() 
	{
		int[] ar = {10};
		int act = Homework_3.hw_3(ar);
		assertEquals(0, act);
	}
	@Test
	public void testHw3_2() 
	{
		int[] ar = {10,19};
		int act = Homework_3.hw_3(ar);
		assertEquals(19, act);
	}
	@Test
	public void testHw3_many() 
	{
		int[] ar = {10,20,33,11,8,2};
		int act = Homework_3.hw_3(ar);
		assertEquals(44, act);
	}
	//================================================================
	//4)Сделать реверс массива (массив в обратном направлении)
	//================================================================
	@Test 
	public void testHw4_0() 
	{
		int[] ar = {};
		Homework_3.hw_4(ar);
		int[] exp = {};
		assertArrayEquals(exp,ar);

	}
	@Test
	public void testHw4_1() 
	{
		int[] ar = {1};
		Homework_3.hw_4(ar);
		int[] exp = {1};
		assertArrayEquals(exp,ar);

	}
	@Test
	public void testHw4_2() 
	{
		int[] ar = {1,2};
		Homework_3.hw_4(ar);
		int[] exp = {2,1};
		assertArrayEquals(exp, ar);

	}
	@Test
	public void testHw4_many() 
	{
		int[] ar = {1,2,3,4};
		Homework_3.hw_4(ar);
		int[] exp = {4,3,2,1};
		assertArrayEquals(exp,ar);

	}
	//================================================================
	//5) Посчитать количество нечетных элементов массива
	//================================================================
	@Test 
	public void testHw5_0() 
	{
		int[] ar = {};
		int act = Homework_3.hw_5(ar);
		assertEquals(0, act);

	}
	@Test
	public void testHw5_1() 
	{
		int[] ar = {10};
		int act = Homework_3.hw_5(ar);
		assertEquals(0, act);
	}
	@Test
	public void testHw5_2() 
	{
		int[] ar = {10,19};
		int act = Homework_3.hw_2(ar);
		assertEquals(1, act);
	}
	@Test
	public void testHw5_many() 
	{
		int[] ar = {10,20,33,11,8,2};
		int act = Homework_3.hw_2(ar);
		assertEquals(2, act);
	}
	//================================================================
	//6) Поменять местами первую и вторую половину массива
	//================================================================
	//================================================================
	//7) Отсортировать массив пузырьком
	//================================================================
	 @Test
	 public void test_bubble_0() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.bubble(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_bubble_1() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.bubble(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_bubble_2() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.bubble(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_bubble_many() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.bubble(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	//================================================================
	//7) Отсортировать массив выбором
	//================================================================
	 @Test
	 public void test_Sort_0() 
	 {
	  int[] ar = {};
	  Homework_3.selection(ar);
	  int[] exp = {};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_Sort_1() 
	 {
	  int[] ar = {10};
	  Homework_3.selection(ar);
	  int[] exp = {10};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_Sort_2() 
	 {
	  int[] ar = {20,10};
	  Homework_3.selection(ar);
	  int[] exp = {10,20};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_Sort_many() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.selection(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	
	//================================================================
	//7) Отсортировать массив вставками
	//================================================================
	 @Test
	 public void test_insert_0() 
	 {
	  int[] ar = {};
	  Homework_3.another(ar);
	  int[] exp = {};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_insert_1() 
	 {
	  int[] ar = {10};
	  Homework_3.another(ar);
	  int[] exp = {10};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_insert_2() 
	 {
	  int[] ar = {20,10};
	  Homework_3.another(ar);
	  int[] exp = {10,20};
	  assertArrayEquals(exp, ar);
	 }
	 @Test
	 public void test_insert_many() 
	 {
	  int[] ar = {10,20,33,11,8,2};
	  Homework_3.another(ar);
	  int[] exp = {2,8,10,11,20,33};
	  assertArrayEquals(exp, ar);
	 }
	}

