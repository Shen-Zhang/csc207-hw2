package edu.grinnell.csc207.zhangshe.hw2;

public class TwoA {


	/**
	 * 
	 * @param a
	 *		a long integer
	 * @param b
	 * 		a long integer
	 * @return
	 * 		boolean value
	 * @pre
	 * 		Both a and b cannot be greater than Integer.Max_Value or smaller than Integer.Min_Value
	 */
	public static boolean isMultiple(long a, long b) {
		if (a == 0 || b == 0) // if a or b is 0, there always exists an integer
								// i such as a = b * i
			return true;
		else
			return (a % b == 0);
	} // isMultiple

	/**
	 * 
	 * @param i
	 * 		an integer
	 * @return
	 * 		boolean value
	 * @pre
	 * 		i cannot be greater than Integer.Max_Value or smaller than Integer.Min_Value
	 */
	public static boolean isOdd(int i) {
		return ((i & 1) == 1); // We determine the odd number by using bitwise operation.
	} // isOdd

	
	/**
	 * 
	 * @param n
	 * 		an integer
	 * @return
	 * 		a non-negative integer
	 * @pre
	 * 		(n/2) * (n/2) cannot be greater than Integer.Max_Value
	 */
	public static int oddSumTo(int n) {
		if (n <= 1)
			return 0; // for n less or equal to 1, the sum of positive integers
						// less than 1 is 0.
		else {
			int x = n /2;
			return x * x; // 1 + 3 + 5 + 7 + ... + (2n - 1) = n^2
		} // else
	} // oddSumTo

	/**
	 * 
	 * @param ints
	 * 		an integer array
	 * @return
	 * 		boolean value
	 * @pre
	 * 
	 */
	// input can not be greater than maximum
	public static boolean isOddProd(int[] ints) {
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			if (isOdd(ints[i]) == true)
				sum++;
		} //for
		return (sum >= 2);
	} // isOddProd

	public static boolean allDistinct(int[] ints) {
		int len = ints.length;
		for (int i = 0; i < len; i++)
			for (int j = i + 1; j < len; j++) {
				if (ints[i] == ints[j])
					return false;
			} // for
		return true;
	} // allDistinct

	public static int[] reverseInts(int[] ints) {
		int n = ints.length;
		if (n == 1)
			return ints;

		else {
			if (isOdd(n) == true)
				n--;

			for (int i = 0; i < n / 2; i++) {
				int temp = ints[i];
				ints[i] = ints[ints.length - 1 - i];
				ints[ints.length - 1 - i] = temp;
			} // for
			return ints;
		} // else
	} // reverseInts

} // TwoA
