package edu.grinnell.csc207.zhangshe.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoBTest
{

  @Test
  public void
    testAverage ()
  {
    // assertEquals ("left = 10, right = 20", 15, TwoB.average(10, 20));
    // assertEquals ("left = -10, right = -20", -15, TwoB.average(-10, -20));
    // assertEquals ("left = -10, right = 20", 5, TwoB.average(-10, 20));
    assertEquals ("left = 1, right = 20", 10, TwoB.average (1, 20));
    assertEquals ("left = -1, right = 20", 9, TwoB.average (-1, 20));

  }

}
