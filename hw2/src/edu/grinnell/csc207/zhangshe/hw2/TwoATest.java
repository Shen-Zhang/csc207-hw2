package edu.grinnell.csc207.zhangshe.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest {

	@Test
	public void testIsMultiple() {
		assertEquals ("a = 10, b = 5", true, TwoA.isMultiple(10, 5));
		assertEquals ("a = 11, b = 5", false, TwoA.isMultiple(11, 5));
		assertEquals ("a = 0, b = 0", true, TwoA.isMultiple(0, 0));
		assertEquals ("a = -10, b = -2", true, TwoA.isMultiple(-10, -2));
		assertEquals ("a = -10, b = -3", false, TwoA.isMultiple(-10, -3));
		assertEquals ("a = -15, b = 5", true, TwoA.isMultiple(-15, 5));
	}

}
