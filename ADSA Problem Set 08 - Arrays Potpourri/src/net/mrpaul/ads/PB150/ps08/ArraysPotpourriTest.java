package net.mrpaul.ads.PB150.ps08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ArraysPotpourriTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLastIndexOf() {
		int[] a = {74, 85, 102, 99, 101, 85, 56};
		assertEquals(5, ArraysPotpourri.lastIndexOf(a, 85));
	}

	@Test
	public void testRange(){
		int[] a = {3, 10000000, 5, -29, 4};
		assertEquals(10000030, ArraysPotpourri.range(a));
	}
	@Test
	public void testCountInRange() {
		int[] a = {14, 1, 22, 17, 36, 7, -43, 5};
		assertEquals(4, ArraysPotpourri.countInRange(a, 4	, 17));
	}
	@Test
	public void testIsSorted() {
		double[] a = {1, 2, 3, 0, 5};
		assertEquals(false, ArraysPotpourri.isSorted(a));
	}
	@Test
	public void testMode() {
		int[] a = {0, 1, 2, 2, 3, 4} ;
		assertEquals(2, ArraysPotpourri.mode(a));
	}
	@Test
	public void teststdev() {
		double[] b = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		assertEquals(11.237, ArraysPotpourri.stdev(b), .001);
	}
	@Test
	public void testKthLargest() {
		int[] a = {0, 1, 2, 2, 3, 4};
		assertEquals(ArraysPotpourri.kthLargest(1, a), 3);
	}
	@Test
	public void testMinGap() {
		int[] a = {1, 3, 6, 7, 12};
		assertEquals(1,ArraysPotpourri.minGap(a));
	}
	@Test
	public void testPercentEven() {
		int[] a = {6, 2, 9, 11, 3};
		assertEquals(40.0, ArraysPotpourri.percentEven(a), .01);
	}
	@Test
	public void testIfUnique () {
		int[] a = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
		assertEquals(false, ArraysPotpourri.isUnique(a));
	}
	@Test
	public void testPriceIsRight() {
		int[] a1 = {900, 885, 989, 1}; 
		assertEquals(1, ArraysPotpourri.priceIsRight(a1, 800));
	}
	@Test
	public void testLongestSortedSequence() {
		int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
		assertEquals(4, ArraysPotpourri.longestSortedSequence(array));
	}

	@Test 
	public void testContains() {
		int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
		int[] list2 = {1, 2, 1};
		assertEquals(true, ArraysPotpourri.contains(list1, list2));
	}
	@Test
	public void testCollapse() {
		int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
		int[] check = {7, 3, 5, 3, 8};
		assertEquals(Arrays.toString(ArraysPotpourri.collapse(list1)), Arrays.toString(check));
	}
	@Test
	public void testAppend() {

		int[] a = {3, 5, 11 };
		int[] c = {9, 2, 43, 11, 9};

		int[] n = {9, 2, 43, 11, 9, 3, 5, 11};	

		int[] ab;
		ab = ArraysPotpourri.append(c, a);
		assertEquals(Arrays.toString(ab), Arrays.toString(n));
	}
	@Test
	public void testVowelCount() {

		int[] n = {2, 3, 1, 1, 0};
		assertEquals(Arrays.toString(n),Arrays.toString(ArraysPotpourri.vowelCount("Hello my name is nate")));
	}

}