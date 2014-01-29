package edu.grinnell.csc207.zhangshe.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest
{

  @Test
  public void
    testIsMultiple ()
  {
    // Case 1: two positive integers
    assertEquals ("a = 10, b = 5", true, TwoA.isMultiple (10, 5));
    assertEquals ("a = 5, b = 10", false, TwoA.isMultiple (5, 10));
    assertEquals ("a = 11, b = 5", false, TwoA.isMultiple (11, 5));
    // Case 2: at least one of the numbers is 0
    assertEquals ("a = 0, b = 3", true, TwoA.isMultiple (0, 3));
    assertEquals ("a = -1, b = 0", true, TwoA.isMultiple (-1, 0));
    assertEquals ("a = 0, b = 0", true, TwoA.isMultiple (0, 0));
    // Case 3: both numbers are negative
    assertEquals ("a = -10, b = -2", true, TwoA.isMultiple (-10, -2));
    assertEquals ("a = -2, b = -10", false, TwoA.isMultiple (-2, -10));
    assertEquals ("a = -10, b = -3", false, TwoA.isMultiple (-10, -3));
    // Case 4: one positive and one negative integer
    assertEquals ("a = -15, b = 5", true, TwoA.isMultiple (-15, 5));
    assertEquals ("a = 5, b = -15", false, TwoA.isMultiple (5, -15));
    assertEquals ("a = -16, b = 3", false, TwoA.isMultiple (-16, 3));

    // Case 5: max and min numbers
    long max = Integer.MAX_VALUE;
    long min = Integer.MIN_VALUE;
    assertEquals ("a = max, b = 3", false, TwoA.isMultiple (max, 3));
    assertEquals ("a = max, b = -4", false, TwoA.isMultiple (max, -4));
    assertEquals ("a = max, b = min", false, TwoA.isMultiple (max, min));
    assertEquals ("a = min, b = 3", false, TwoA.isMultiple (min, 3));
    assertEquals ("a = 3, b = min", false, TwoA.isMultiple (3, max));
  }// testIsMultiple

  @Test
  public void
    testIsOdd ()
  {

    // Case 1: Even number
    for (int i = -100; i < 100; i += 2)
      {
        assertEquals ("i = " + i, false, TwoA.isOdd (i));

      }

    // Case 2: Odd number
    for (int i = -99; i < 100; i += 2)
      {
        assertEquals ("i = " + i, true, TwoA.isOdd (i));

      }
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    assertEquals ("i = max", true, TwoA.isOdd (max));
    assertEquals ("i = min", false, TwoA.isOdd (min));
  } // testIsOdd

  @Test
  public void
    testOddSumTo ()
  {
    // Multiple Cases: Test from 0 to 199
    for (int m = 0; m < 200; m++)
      {
        int sum = 0; // set sum to 0
        for (int i = 1; i < m; i += 2)
          sum += i; // add odd number
        assertEquals ("n = " + m, sum, TwoA.oddSumTo (m));
      }

  } // testOddSumTo

  @Test
  public void
    test_isOddProd ()
  {

    for (int i = -100; i <= 100; i++)
      {
        int[] valsTrue = new int[] { i + 1, i + 2, i + 3, i + 4, i + 5 };
        // this array will have at least two odds, so it must be true
        int[] valsFalse = new int[] { i + 1, i }; // this array always has an
                                                  // odd and an even, so it's
                                                  // always false
        assertEquals ("{ " + (i + 1) + (i + 2) + (i + 3) + (i + 4) + (i + 5)
                          + " }", true, TwoA.isOddProd (valsTrue));
        assertEquals ((i + 1) + "and" + i, false, TwoA.isOddProd (valsFalse));
      }

  } // testIsOddProd

  @Test
  public void
    testAllDistinct ()
  {
    // different lists of true cases

    for (int i = -100; i <= 100; i++)
      {
        int[] vals = new int[] { i + 1, i + 20, i + 10, i + 3 };

        assertEquals ("{ " + (i + 1) + (i + 20) + (i + 10) + (i + 3) + "}",
                      true, TwoA.allDistinct (vals));
      }
    // different lists of false cases
    for (int i = -100; i <= 100; i++)
      {
        int[] vals = new int[] { i + 1, i + 5, i + 10, i + 5 };

        assertEquals ("{ " + (i + 1) + (i + 5) + (i + 10) + (i + 5) + "}",
                      false, TwoA.allDistinct (vals));
      }
  } // testAllDinstinct

  @Test
  public void
    testReverseInts ()
  {
    for (int i = -100; i <= 100; i += 5)
      {
        int[] original = new int[] { i, i + 1, i + 2, i + 3, i + 4 };
        int[] expected = new int[] { i + 4, i + 3, i + 2, i + 1, i };

        TwoA.reverseInts (original);
        assertArrayEquals ("original array { " + i + (i + 1) + (i + 2)
                               + (i + 3) + (i + 4) + " }", expected, original);
      } // for

    // if there is only one element in the array
    int[] oneElem = new int[] { 0 };
    int[] oneExpect = new int[] { 0 };
    assertArrayEquals ("there is only one element in the array", oneExpect,
                       TwoA.reverseInts (oneElem));
    // if there is no element in the array
    int[] empty = new int[] {};
    int[] expectedEmpty = new int[] {};
    assertArrayEquals ("the array is empty", expectedEmpty,
                       TwoA.reverseInts (empty));
  } // testReverseInts

}
