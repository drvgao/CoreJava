package com.corejava.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyEvenOddTest {
	@Test
	public void testSum() {
		EnumDemo2 even = new EnumDemo2();
		assertEquals("Hey, 1+2 should be 3", 3, even.sum(1,2));
		
//		even.getOrder("aleem", 9182374);
	}

}
