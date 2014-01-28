package edu.grinnell.csc207.zhangshe.hw2;

public class TwoA
{

  public static boolean
    isMultiple (long a, long b)
  {
    if (a == 0 || b == 0) // if a or b is 0, there always exists an integer i
                          // such as a = b * i
      return true;
    else
      return (a % b == 0);
  } // isMultiple


  
  public static boolean
  isOdd (int i)
  {
    return ((i & 1) == 1);  
  }
  
  // Cannot sum up to a number greater than the maximum
  public static int
    oddSumTo (int n)
  {
    if (n <= 1) 
      return 0; // for n less or equal to 1, the sum of positive integers less than 1 is 0.
    else
      {
        if (isOdd (n) == true)
          n = ((n - 2) + 1) / 2; 

        else if (isOdd (n) == false)
          n = ((n - 1) + 1) / 2;

        return n * n; // 1 + 3 + 5 + 7 + ... + (2n - 1) = n^2
      }
  }

  // input can not be greater than maximum
  public static boolean
    isOddProd (int[] ints)
  {
    int len = ints.length;
    int sum = 0;
    for (int i = 0; i < len; i++)
      {
        if (isOdd (ints[i]) == true)
          sum++;
      }
    return (sum >= 2);
  }

  public static boolean
    allDistinct (int[] ints)
  {
    int len = ints.length;
    for (int i = 0; i < len; i++)
      for (int j = i + 1; j < len; j++)
        {
          if (ints[i] == ints[j])
            return false;
        }
    return true;
  }

  public static int[]
    reverseInts (int[] ints)
  {
    int len = ints.length;
    int[] vals = new int[len];

    for (int i = 0; i < len; i++)
      vals[i] = ints[(len - 1) - i];
    return vals;
  }

}
