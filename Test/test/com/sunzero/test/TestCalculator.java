package com.sunzero.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	private Calculator cal = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(cal.add(1,2), 3);
	}
}
