package net.mrpaul.ads.PB150.ps14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
	
	//Part 2:
	
	@Test
	void testMaxLength() {
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("Hi");
		list.add("Hi");
		list.add("What");
		
		assertEquals(7, RecursionExercises.maxLength(list));
	}
	
	@Test 
	void testSwapPairs() {
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("Hi");
		list.add("Hi");
		list.add("What");
		String answer = "hello welcome Hi Hi What";
		
		assertTrue(RecursionExercises.swapPairs(list).equals(answer));
	}
	
	@Test
	void testDoubleList() {
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("Hi");
		String answer = "welcome welcome hello hello Hi Hi";
		 
		assertTrue(RecursionExercises.doubleList(list).equals(answer));
	}
	
	@Test
	void testMinToFront() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(4);
		list1.add(1);
		list1.add(1);
		list1.add(9);
		List<Integer> list = RecursionExercises.minToFront(list1);
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(9);
		assertEquals(list, list2);
	}
	
	@Test
	void testRemoveDuplicates() {
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("Hi");
		list.add("Hi");
		list.add("What");
		String answer = "welcome hello Hi What";
		
		assertTrue(RecursionExercises.removeDuplicates(list).equals(answer));
	}
}