package edu.grinnell.csc207.zhangshe.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoBTest
{

  @Test
  public void
    testAverage ()
  {
    assertEquals ("left = 1, right = 20", 10, TwoB.average (1, 20));
    assertEquals ("left = -1, right = 20", 9, TwoB.average (-1, 20));
    assertEquals ("left = 0, right = 0", 0, TwoB.average (0, 0));
    System.out.println (TwoB.average (Integer.MAX_VALUE - 1, Integer.MIN_VALUE));
    // assertEquals ("left = -1, right = 20", 9, TwoB.average (-1, 20));
  }

}
