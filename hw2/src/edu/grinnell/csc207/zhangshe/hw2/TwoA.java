package edu.grinnell.csc207.zhangshe.hw2;

public class TwoA
{
  public static boolean
    isMultiple (long a, long b)
  {
    if (a == 0 || b == 0)
    {
    	System.out.println (0);
        return true;
    }

    else
    {
    	System.out.println (a % b);
    	return (a % b == 0);
    }
      
  } // isMultiple
  
  public static boolean
   isOdd (int i)
  {
	  if ((i > 0) && (i <= Integer.MAX_VALUE))
	  {
		  for (int sum = 1; sum <= i; sum +=2)
		  {
			  if (sum == i)
				  return true;
	  }
	  }
	  else if ((i < 0) && (i >= Integer.MIN_VALUE))
	  {
		  for (int sum = -1; sum >= i; sum = sum -2)
		  {
			  if (sum == i)
				  return true;
	  }
	  }
	  return false;
  
 }
  //Cannot sum up to a number greater than the maximum
  public static int
  oddSumTo (int n)
  {
	  int sum = 0;
	  
	  if (isOdd(n) == true)
	  {
		  n = n-2;
		  for (sum = 0; n> 0; n = n-2)
			  sum += n;
	  }
	  else if (isOdd(n) == false)
	  {
		  n = n-1;
		  for (sum = 0; n > 0; n = n-2)
			  sum += n;
	  }
return sum;
  }
  
  //input can not be greater than maximum
  public static boolean
  isOddProd (int[] ints)
  {
	  int len = ints.length;
	  int sum = 0;
	  for (int i = 0; i < len; i++)
	  {
		  if (isOdd(ints[i]) == true)
			  sum++;
  }
	  return (sum >=2);
}
  
  public static boolean
  allDistinct (int[] ints)
  {
	  int len = ints.length;
	  for (int i = 0; i < len; i++)
		  for (int j = i+1; j < len; j++)
		  {
			  if (ints[i] == ints[j])
				  return false;
		  }
	  return true;
  }
  
  public static int[]
	reverseInts(int[] ints)
  {
	  int len = ints.length;
	  int[] vals = new int[len];
	  
	/*  vals[0] = ints[3];
	  vals[1] = ints[2];
	  vals[2] = ints[1];
	  vals[3] = ints[0];
	  */
	  for (int i = 0; i < len; i++)
	  {
		  vals[i] = ints[(len-1) - i];
	  
	  }
	  System.out.println(vals[0]);
	  System.out.println(vals[1]);
	  System.out.println(vals[2]);
	  System.out.println(vals[3]);
		  return vals;
  }
		  
		  
		  
		  
		  
		  
		  
}

