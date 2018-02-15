package net.mrpaul.PB150.ps09;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRecursiveFibonacci() {
		assertEquals(Fibonacci.recursiveFibonacci(4), 3);
	}

	@Test
	public void testDynamicFibonacci() {
		assertEquals(Fibonacci.dynamicFibonacci(4), 3);
	}

}
