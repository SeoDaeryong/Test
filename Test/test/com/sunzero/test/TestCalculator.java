package com.sunzero.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	private Calculator cal = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(cal.add(1,2), 3);
	}
	
	@Test
	public void testMinus() {
		assertEquals(cal.minus(2,1), 1);
	}
	
	@Test
	public void testMultiple() {
		assertEquals(cal.multiple(2,3), 6);
	}
	
	@Test
	public void testDivide() {
		assertEquals(cal.divide(6,3), 2);
	}
}
