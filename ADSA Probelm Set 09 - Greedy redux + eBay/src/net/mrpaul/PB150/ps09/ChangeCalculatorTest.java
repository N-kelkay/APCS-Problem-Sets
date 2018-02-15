package net.mrpaul.PB150.ps09;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChangeCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRecursiveMinChange() {
		int n = 8;
		int[] c = {1, 4, 6};
		assertEquals(2,ChangeCalculator.recursiveMinChange(n, c));
	}

	@Test
	public void testDynamicMinChange() {
		int n = 8;
		int[] c = {1, 4, 6};
		
		assertEquals(2, ChangeCalculator.dynamicMinChange(n, c));
	}

}
