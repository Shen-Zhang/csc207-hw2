package edu.grinnell.csc207.zhangshe.hw2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TwoATest {

	/*
	 * @Test public void testIsMultiple() { assertEquals ("a = 10, b = 5", true,
	 * TwoA.isMultiple(10, 5)); assertEquals ("a = 11, b = 5", false,
	 * TwoA.isMultiple(11, 5)); assertEquals ("a = 0, b = 0", true,
	 * TwoA.isMultiple(0, 0)); assertEquals ("a = -10, b = -2", true,
	 * TwoA.isMultiple(-10, -2)); assertEquals ("a = -10, b = -3", false,
	 * TwoA.isMultiple(-10, -3)); assertEquals ("a = -15, b = 5", true,
	 * TwoA.isMultiple(-15, 5)); long max = Integer.MAX_VALUE ; long min =
	 * Integer.MIN_VALUE; assertEquals ("a = max, b = min", false,
	 * TwoA.isMultiple(max, min)); }
	 */

	/*
	 * @Test public void test_isOdd () { assertEquals ("i =3", true,
	 * TwoA.isOdd(3)); assertEquals ("i =4", false, TwoA.isOdd(4)); assertEquals
	 * ("i =0", false, TwoA.isOdd(0)); assertEquals ("i =-3", true,
	 * TwoA.isOdd(-3)); assertEquals ("i =-4", false, TwoA.isOdd(-4)); int max =
	 * Integer.MAX_VALUE; int min = Integer.MIN_VALUE; assertEquals ("i = max",
	 * true, TwoA.isOdd(max)); assertEquals ("i = min", false, TwoA.isOdd(min));
	 * }
	 */

/*	@Test
	public void test_oddSumTo() {
		assertEquals("n = 5", 4, TwoA.oddSumTo(5));
		assertEquals("n = 8", 16, TwoA.oddSumTo(8));
		assertEquals("n = -8", 0, TwoA.oddSumTo(-8));
		assertEquals("n = 0", 0, TwoA.oddSumTo(0));
	}*/

	/*
	 * @Test public void test_isOddProd () { int[] vals = new int[10]; vals[0] =
	 * -1; // initialize second element vals[1] = 201; // and so forth vals[2] =
	 * 0; vals[3] = 0;
	 * 
	 * assertEquals ("vals", true, TwoA.isOddProd(vals));
	 * 
	 * }
	 */
/*
	@Test
	public void test_allDistinct() {
		int[] vals = new int[4];
		vals[0] = -1;
		// initialize second element
		vals[1] = 201;
		// and so forth
		vals[2] = 10;
		vals[3] = 0;

		assertEquals("vals", true, TwoA.allDistinct(vals));
	}*/

	@Test
	public void test_reverseInts () {
		int[] vals = new int[4];
	        vals[0] = -1;
	        // initialize second element
	        vals[1] = 201;
	        // and so forth
	        vals[2] = 0;
	        vals[3] = 0;
	        
		    int[] val2 = new int[4];
			val2[0] = 0;
			// initialize second element
			val2[1] = 0;
			// and so forth
			val2[2] = 201;
			val2[3] = -1;
			
	        assertEquals ("vals reverse", true, Arrays.equals(TwoA.reverseInts(vals),val2));
	}


}
