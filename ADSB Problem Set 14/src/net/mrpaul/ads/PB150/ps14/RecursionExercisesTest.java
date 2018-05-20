package net.mrpaul.ads.PB150.ps14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursionExercisesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReverseString() {
		fail("Not yet implemented");
	}

	@Test
	void testSumDigits() {
		int x = 123;
		assertEquals(6, RecursionExercises.sumDigits(x));
	}

	@Test
	void testCount7() {
		fail("Not yet implemented");
	}

	@Test
	void testPowerN() {
		assertEquals(9, RecursionExercises.powerN(3, 2));
	}

	@Test
	void testArray220() {
		fail("Not yet implemented");
	}

	@Test
	void testEuclideanGCD() {
		assertEquals(2, RecursionExercises.euclideanGCD(2, 2));
	}

}
