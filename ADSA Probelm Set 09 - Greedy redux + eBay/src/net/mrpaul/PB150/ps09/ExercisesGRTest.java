package net.mrpaul.PB150.ps09;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercisesGRTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFillOne() {
		int x = 5;
		assertEquals(Arrays.toString(ExercisesGR.fillOne(x)), "[1, 1, 1, 1, 1]");
	}

	@Test
	public void testReverse() {
		int a[] = {1, 2, 3, 4, 5};
		assertEquals(Arrays.toString(ExercisesGR.Reverse(a)), "[5, 4, 3, 2, 1]");
	}

	@Test
	public void testInsertBetweenTriads() {
		int a[] = {2, 2, 2, 2, 2};
		assertEquals(Arrays.toString(ExercisesGR.insertBetweenTriads(a, 1)), "[1, 2, 2, 2, 1, 2, 2]");
	}

}
