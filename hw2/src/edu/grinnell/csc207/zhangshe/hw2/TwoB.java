package edu.grinnell.csc207.zhangshe.hw2;

public class TwoB
{
  /**
   * Compute the average of two integers. Rounds toward zero if the average is
   * not a whole number.
   */

  public static int
    /**
     * 
     * @param left
     *          an integer
     * @param right
     *          an integer
     * @return the average of left and right. The number will round towards zero
     *         if the average is not a whole number
     * @pre both left and right numbers should not be greater than
     *      Integer.Max_Value or smaller than Integer.Min_Value
     */
    average (int left, int right)
  {
    /**
     * In the original program, it was possible that the sum of left and right
     * exceeds Integer.Max_Value or Integer.Min_Value even when either left or
     * right is within the boundaries. Therefore, we solve this problem by
     * dividing the left and right numbers first, and then sum them up.
     */
    double avg = left / 2.0 + right / 2.0;
    return (int) avg;
  } // average(int,int)}

} // class TwoB
