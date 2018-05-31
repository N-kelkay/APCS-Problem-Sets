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
		String x = "racecar";
		assertEquals("racecar", RecursionExercises.reverseString(x));
	}

	@Test
	void testSumDigits() {
		int x = 123;
		assertEquals(6, RecursionExercises.sumDigits(x));
	}

	@Test
	void testCount7() {
		int x = 17671;
		assertEquals(2, RecursionExercises.count7(x));
	}

	@Test
	void testPowerN() {
		assertEquals(9, RecursionExercises.powerN(3, 2));
	}

	@Test
	void testArray220() {
		int[] x = {1, 2, 20, 200};
		assertEquals(true, RecursionExercises.array220(x, 0));
	}

	@Test
	void testEuclideanGCD() {
		assertEquals(2, RecursionExercises.euclideanGCD(2, 2));
	}
	
	@Test
	void testCountVowels() {
		String y = "Natenael";
		assertEquals(4, RecursionExercises.countVowels(y));
	}
	
	@Test
	void testIsPalindrome() {
		String y = "racecar";
		assertEquals(1, RecursionExercises.isPalindrome(y));
	}
}