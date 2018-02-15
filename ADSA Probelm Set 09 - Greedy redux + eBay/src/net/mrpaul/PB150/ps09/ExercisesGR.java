package net.mrpaul.PB150.ps09;

/**
*EcerciseGr is a series of exercise methods assigned
*
*<p> The methods do basic configuration with arrays, ints and other types of variables passed in <p>
*
*APCS PS150: Greedy redux + eBay
*Friday 2, 2018
*
*@author Natenael Kelkay
*/
public class ExercisesGR {

	/*
	 * Given the desired length of the output array, 
	 * static method fillOne(int length) should return
	 * a new array of B = [1, 1, ..., 1] where B.length equals length.
	 */
	public static int[] fillOne(int length) {
		int[] b = new int[length];
		for(int i = 0; i< b.length; i++) {
			b[i] = 1;
		}
		return b;
	}

	/*
	 * Given an array of integers a = [x0, x1, ..., xn] as input, static 
	 * method reverse(int[] A) should return a new array B = [xn, xn-1, ..., x0].
	 */
	public static int[] Reverse(int[] A) {
		int[] b = new int[A.length];
		int count = 0;
		for(int i = A.length -1; i >=0; i--) {
			b[count] = A[i];
			count++;
		}
		return b;
	}

	/*
	 * Given an array of integers a = [x0, x1, ..., xn] and another integer i as input, 
	 * static method insertBetweenTriads(int[] A, int i)should return a new array 
	 * B = [i, x0, x1, x2, i, x3, x4, x5, i, x6, ...].  If given an array with an exact multiple 
	 * of 3 elements, you should insert i on both ends, as in: B = [i, x0, x1, x2, i].  
	 * Take care to handle initial array lengths not divisible by 3.  
	 */
	public static int[] insertBetweenTriads(int[] a, int i) {
		int length = a.length + a.length/3 + 1;
		int[] arr = new int[length];
		for(int x =0; x< length; x++) {
			arr[x] = i;
		}
		int hey = 1;
		for(int x = 0; x < arr.length;x++) {
			if(x % 4 != 0) {
				arr[x] = a[x-hey];
				hey++;
			}
		}

		return arr;
	}
}
