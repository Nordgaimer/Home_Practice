import static org.junit.Assert.*;

import org.junit.Test;


public class AListTest {

	//=====================================================
	// Test AddEnd 0
	//=====================================================

	@Test
	public void testAddEnd_0() 
	{
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		ar.addEnd(1);
		assertEquals(1,ar.size());
		int [] exp = {1};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}

	//=====================================================
	// Test AddEnd 1
	//=====================================================

	@Test
	public void testAddEnd_1() {
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		ar.addEnd(1);
		assertEquals(2,ar.size());
		int [] exp = {10,1};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}

	//=====================================================
	// Test AddEnd 2
	//=====================================================

	@Test
	public void testAddEnd_2() {
		AList ar = new AList();
		int [] tmp = {10,20};
		ar.init(tmp);
		ar.addEnd(1);
		assertEquals(3,ar.size());
		int [] exp = {10,20,1};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}

	//=====================================================
	// Test AddEnd many
	//=====================================================

	@Test
	public void testAddEnd_many() {
		AList ar = new AList();
		int [] tmp = {10,20,30,40,50,60};
		ar.init(tmp);
		ar.addEnd(1);
		assertEquals(7,ar.size());
		int [] exp = {10,20,30,40,50,60,1};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}


	//=====================================================
	// Test AddStart 0
	//=====================================================

	@Test
	public void testAddStart_0() {
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		ar.addStart(1);
		assertEquals(1,ar.size());
		int [] exp = {1};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test AddStart 1
	//=====================================================

	@Test
	public void testAddStart_1() {
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		ar.addStart(1);
		assertEquals(2,ar.size());
		int [] exp = {1,10};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test AddStart 2
	//=====================================================

	@Test
	public void testAddStart_2() {
		AList ar = new AList();
		int [] tmp = {10,20};
		ar.init(tmp);
		ar.addStart(1);
		assertEquals(3,ar.size());
		int [] exp = {1,10,20};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test AddStart many
	//=====================================================

	@Test
	public void testAddStart() {
		AList ar = new AList();
		int [] tmp = {10,20,30,40,50,60};
		ar.init(tmp);
		ar.addStart(1);
		assertEquals(7,ar.size());
		int [] exp = {1,10,20,30,40,50,60};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}


	//=====================================================
	// Test set_positions 0
	//=====================================================
	@Test (expected = IndexOutOfBoundsException.class)
	public void testSet_pos_0()
	{	
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		ar.set_pos(5, 2);

	}
	//=====================================================
	// Test set_positions 1
	//=====================================================
	@Test
	public void testSet_pos_1() {	
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		ar.set_pos(5, 0);
		assertEquals(1,ar.size());
		int [] exp = {5};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test set_positions 2
	//=====================================================
	@Test
	public void testSet_pos() {	
		AList ar = new AList();
		int [] tmp = {10,20};
		ar.init(tmp);
		ar.set_pos(5, 1);
		assertEquals(2,ar.size());
		int [] exp = {10,5};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test set_positions many
	//=====================================================
	@Test
	public void testSet_pos_many()
	{	
		AList ar = new AList();
		int [] tmp = {10,20,30,40,50,60};
		ar.init(tmp);
		ar.set_pos(5, 1);
		assertEquals(6,ar.size());
		int [] exp = {10,5,30,40,50,60};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test size 0
	//=====================================================
	@Test
	public void testSize_0() 
	{	
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		assertEquals(0,ar.size());
	}
	//=====================================================
	// Test size 1
	//=====================================================
	@Test
	public void testSize_1() 
	{	
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		assertEquals(1,ar.size());
	}
	//=====================================================
	// Test size 2
	//=====================================================
	@Test
	public void testSize_2() 
	{	
		AList ar = new AList();
		int [] tmp = {10,20};
		ar.init(tmp);
		assertEquals(2,ar.size());
	}

	//=====================================================
	// Test size many
	//=====================================================
	@Test
	public void testSize_many() 
	{	
		AList ar = new AList();
		int [] tmp = {10,20,30,40};
		ar.init(tmp);
		assertEquals(4,ar.size());
	}
	//=====================================================
	// Test min value 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testMin_value_0() 
	{
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		int act = ar.min_value();
	}
	//=====================================================
	// Test min value 1
	//=====================================================
	@Test
	public void testMin_value_1() 
	{
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		assertEquals(10,ar.min_value());
	}
	//=====================================================
	// Test min value 2
	//=====================================================
	@Test
	public void testMin_value_2() 
	{
		AList ar = new AList();
		int [] tmp = {20,10};
		ar.init(tmp);
		int actuals = ar.min_value();
		assertEquals(10, actuals);
	}
	//=====================================================
	// Test min value many
	//=====================================================
	@Test
	public void testMin_value_many() 
	{
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		int act = ar.min_value();
		assertEquals(10,act);
	}

	//=====================================================
	// Test max value 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testMax_value_0()
	{
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		int act = ar.max_value();
	}
	//=====================================================
	// Test max value 1
	//=====================================================
	@Test
	public void testMax_value_1()
	{
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		int act = ar.max_value();
		assertEquals(20,act);
	}
	//=====================================================
	// Test max value 2
	//=====================================================
	@Test
	public void testMax_value_2()
	{
		AList ar = new AList();
		int [] tmp = {10,20};
		ar.init(tmp);
		int act = ar.max_value();
		assertEquals(20,act);
	}
	//=====================================================
	// Test max value many
	//=====================================================
	@Test
	public void testMax_value_many()
	{
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		int act = ar.max_value();
		assertEquals(60,act);
	}
	//=====================================================
	// Test get value 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testGet_value_0() 
	{
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		int act = ar.get_value(2);


	}
	//=====================================================
	// Test get value 1
	//=====================================================
	@Test
	public void testGet_value_1() 
	{
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		int act = ar.get_value(0);
		assertEquals(20,act);

	}

	//=====================================================
	// Test get value 1 additional
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testGet_value_1_additional() 
	{
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		ar.get_value(1);

	}
	//=====================================================
	// Test get value 2
	//=====================================================
	@Test
	public void testGet_value_2() 
	{
		AList ar = new AList();
		int [] tmp = {20,10};
		ar.init(tmp);
		int act = ar.get_value(1);
		assertEquals(10,act);

	}
	//=====================================================
	// Test get value many
	//=====================================================
	@Test
	public void testGet_value() 
	{
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		int act = ar.get_value(2);
		assertEquals(30,act);

	}
	//=====================================================
	// Test reverse 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testReverse_0() {
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		ar.reverse();

	}
	//=====================================================
	// Test reverse 1
	//=====================================================
	@Test
	public void testReverse_1() {
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		ar.reverse();
		int [] act = ar.toArray();
		int [] exp = {20};
		assertArrayEquals(exp, act);
	}
	//=====================================================
	// Test reverse 2
	//=====================================================
	@Test
	public void testReverse_2() {
		AList ar = new AList();
		int [] tmp = {20,10};
		ar.init(tmp);
		ar.reverse();
		int [] act = ar.toArray();
		int [] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	//=====================================================
	// Test reverse many
	//=====================================================
	@Test
	public void testReverse_many() {
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		ar.reverse();
		int [] act = ar.toArray();
		int [] exp = {60,50,40,30,10,20};
		assertArrayEquals(exp, act);
	}

	//=====================================================
	// Test Min_value_index 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testMin_value_index_0() {
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		int act = ar.min_value_index();
	}
	//=====================================================
	// Test Min_value_index 1
	//=====================================================
	@Test
	public void testMin_value_index_1() {
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		int act = ar.min_value_index();
		assertEquals(0,act);
	}
	//=====================================================
	// Test Min_value_index 2
	//=====================================================
	@Test
	public void testMin_value_index_2() {
		AList ar = new AList();
		int [] tmp = {20,10};
		ar.init(tmp);
		int act = ar.min_value_index();
		assertEquals(1,act);
	}
	//=====================================================
	// Test Min_value_index many
	//=====================================================
	@Test
	public void testMin_value_index_many() {
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		int act = ar.min_value_index();
		assertEquals(1,act);
	}
	//=====================================================
	// Test Max_value_index 0
	//=====================================================
	@Test (expected=IndexOutOfBoundsException.class)
	public void testMax_value_index_0() {
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		int act = ar.max_value_index();
	}
	//=====================================================
	// Test Max_value_index 1
	//=====================================================
	@Test
	public void testMax_value_index_1() {
		AList ar = new AList();
		int [] tmp = {20};
		ar.init(tmp);
		int act = ar.max_value_index();
		assertEquals(0,act);
	}
	//=====================================================
	// Test Max_value_index 2
	//=====================================================
	@Test
	public void testMax_value_index_2() {
		AList ar = new AList();
		int [] tmp = {20,10};
		ar.init(tmp);
		int act = ar.max_value_index();
		assertEquals(0,act);
	}
	//=====================================================
	// Test Max_value_index many
	//=====================================================
	@Test
	public void testMax_value_index_many() {
		AList ar = new AList();
		int [] tmp = {20,10,30,40,50,60};
		ar.init(tmp);
		int act = ar.max_value_index();
		assertEquals(5,act);
	}
	//=====================================================
	// Test Sort 0
	//=====================================================

	@Test (expected=IndexOutOfBoundsException.class)
	public void testSort_0()
	{
		AList ar = new AList();
		int [] tmp = {};
		ar.init(tmp);
		ar.sort();
	}
	//=====================================================
	// Test Sort 1
	//=====================================================

	@Test 
	public void testSort_1() 
	{
		AList ar = new AList();
		int [] tmp = {10};
		ar.init(tmp);
		ar.sort();
		assertEquals(1,ar.size());
		int [] exp = {10};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test Sort 2
	//=====================================================

	@Test
	public void testSort_2() 
	{
		AList ar = new AList();
		int [] tmp = {10,4};
		ar.init(tmp);
		ar.sort();
		assertEquals(2,ar.size());
		int [] exp = {4,10};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}
	//=====================================================
	// Test Sort many
	//=====================================================

	@Test
	public void testSort_many() {
		AList ar = new AList();
		int [] tmp = {10,4,3,50,20,100};
		ar.init(tmp);
		ar.sort();
		assertEquals(6,ar.size());
		int [] exp = {3,4,10,20,50,100};
		int [] act = ar.toArray();
		assertArrayEquals(exp,act);
	}

}
