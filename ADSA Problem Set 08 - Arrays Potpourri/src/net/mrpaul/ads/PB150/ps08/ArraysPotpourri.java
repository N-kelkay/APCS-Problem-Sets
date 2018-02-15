package net.mrpaul.ads.PB150.ps08;

import java.util.*;


/**
 *The class ArraysPotpourri has many methods that do various jobs that have to do with arrays
 *<p>
 *This program, has methods that are passed in with arrays and sometimes ints, booleans and more. The methods 
 *are supposed to get for example the mode of the array, the range, or check if the array is sorted. 
 *the complexity of the methods increase as you go down
 *<p>
 *APCS PB150: Arrays Potpourri
 *Date Wed, 17, 2017
 * 
 *
 *@author Natenael Kelkay
 */


public class ArraysPotpourri {

	//returns last index at which the values occurs in the array
	public static int lastIndexOf(int[] a, int x) {
		for(int i = a.length -1; i >= 0; i--) {
			if(a[i] == x) {
				return i;
			} 	
		}
		return -1;
	}

	//returns largest digit minus smallest plus 1; returns 1 if there is only one digit
	public static int range(int[] a) {

		int smallest = a[0];
		int largest = a[0];

		if(a.length == 1) return 1;

		for(int i=1; i< a.length -1; i++)
		{
			if(a[i] > largest)
				largest = a[i];
			else if (a[i] < smallest)
				smallest = a[i];
		}
		return (largest - smallest) + 1;
	}

	//returns the count of how many elements from the array fall between the minimum and maximum (inclusive).
	public static int countInRange(int[] a, int min, int max){
		int count = 0;

		for(int i = 0; i < a.length -1; i++) {
			if(a[i] < min || a[i] > max) {
				count++;
			}
		}
		return count;
	}

	// returns true if the list is in sorted (nondecreasing) order and false otherwise. 
	public static boolean isSorted(double[] a) {
		boolean sorted = true;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
				sorted = false;
				break;
			}
		}
		return sorted;
	}

	//returns the most frequently occurring element of an array of integers
	//check!
	public static int mode(int[] a) {
		int mostFreq = -1;
		for(int i = 0; i < a.length -1; i ++) {
			if(a[i] == a[i +1]) {
				mostFreq = a[i];
				break;
			}
		}
		return mostFreq;
	}

	/*
	 * returns the standard deviation of an array of integers
	 * 
	 *Standard deviation is computed by taking the square root of the sum of the squares of the 
	 *differences between each element and the mean, divided by one less than the number of elements.
	 */
	public static double stdev(double[] a) {
		//Average
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = (int) (sum + a[i]); 

		}
		double average = (double) sum / a.length;

		// Then add up (number - average)^2 for each number.  
		int addUp = 0;
		double added = 0.0;
		for(int i = 0; i < a.length; i++) {
			added = added + (Math.pow((a[i] - average), 2));
		}

		double x = Math.sqrt((added/ (a.length -1)));
		return x;

	}

	/*
	 * accepts an integer k and an array a as its parameters
	 * returns the element such that k elements have greater or equal value. 
	 * If k == 0, return the largest element; if k == 1, return the second largest element, and so on. 
	 */

	public static int kthLargest(int k, int[] a) {
		Arrays.sort(a);
		return a[a.length-1-k];
	}

	/*
	 * accepts an integer array as a parameter
	 * returns the minimum 'gap' between adjacent values in the array
	 */
	public static int minGap(int[] a) {
		int[] b = new int[a.length-1];

		for(int i = 1; i < a.length ; i++) {
			b[i-1] = a[i] - a[i -1];
		}
		return kthLargest(b.length -1, b);
	}

	/*
	 * accepts an array of integers as a parameter 
	 * returns the percentage of even numbers in the array as a real number
	 */
	public static double percentEven(int[] a) {

		double count = 0;
		for(int i = 0; i <= a.length -1; i ++) {
			if (a[i]% 2 == 0) {
				count++;
			}
		}

		return (count/ a.length) * 100;
	}

	/*
	 * takes an array of integers as a parameter
	 * returns a boolean value indicating whether or not the values in the array are unique 
	 * (true for yes, false for no).
	 */
	public static boolean isUnique(int[] a) {
		boolean isU = true;
		Arrays.sort(a);
		for(int i = 0; i < a.length -1; i++) {
			if(a[i] == a[i +1]) {
				isU = false;
				break;
			} 
		}
		return isU;
	}

	/*
	 * accepts an array of integers bids and an integer price as parameters
	 * returns the element in the bids array that is closest in value to price without being larger than price
	 */
	public static int priceIsRight(int[] bids, int price) {
		int num = -1;

		for(int i = 0; i < bids.length; i ++) {
			if(bids[i] <= price) {
				if(num < 0)
					num = bids[i];
				else if(price - bids[i] < price - num)
					num = bids[i];
			}
		}

		return num;

	}

	/*
	 *accepts an array of integers as a parameter
	 *returns the length of the longest sorted (nondecreasing) sequence of integers in the array
	 */
	public static int longestSortedSequence(int[] a) {
		int longestCount = 0;
		int count = 0;
		for(int i = 1; i < a.length; i++) {
			if (a[i-1] <= a[i]) {
				count ++;
			}
			else {
				longestCount = (count>longestCount)? count:longestCount;
				count = 0;
			}
		}
		return longestCount + 1;
	}

	/*
	 * accepts two arrays of integers a1 and a2 as parameters
	 * 
	 * returns a boolean value indicating whether or not a2's
	 * sequence of elements appears in a1 (true for yes, false for no)
	 */
	public static boolean contains(int[] a1, int[] a2) {
		int longestX = 0;
		if(a1.length < a2.length) {
			return false;
		}else {

			int x = 0;
			for(int i = 0; i < a1.length-a2.length + 1; i++)
				if(a1[i] == a2[0])
					for(int j = 1;j < a2.length; j++) {
						if(a1[i + j] == a2[j])
							x++;
						else
							break;
					}
			longestX = (longestX < x)? x : longestX;
			x = 0;


		}
		return longestX == a2.length - 1;
	}

	/*
	 * accepts an array of integers as a parameter
	 * returns a new array containing the result of replacing each pair of integers with the sum of that pair
	 */
	public static int[] collapse(int[] a) {
		int[] array = new int[a.length/2];
		for(int i = 0;i < a.length-1;i = i+ 2) 
			array[i/2] = a[i] + a[i+1];

		if(a.length%2 == 1) {
			int[] temp = new int[array.length+1];
			for(int i = 0;i < array.length;i++) 
				temp[i] = array[i];

			temp[array.length] = a[a.length-1];
			array = temp;
		}

		return array;
	}

	/*
	 * accepts two integer arrays as parameters
	 * returns a new array that contains the result of appending the second array's values at the end of the first array
	 */
	public static int[] append(int[] a, int[] b) {
		int[] ab = new int[a.length + b.length];
		int currentPosition = 0;
		for( int i = 0; i < a.length; i++) {
			ab[currentPosition] = a[i];
			currentPosition++;
		}
		for( int j = 0; j < b.length; j++) {
			ab[currentPosition] = b[j];
			currentPosition++;
		}
		return ab;
	}

	/*
	 * accepts a String as a parameter and produces
	 * returns an array of integers representing the counts of each vowel in the String
	 */
	public static int[] vowelCount(String word) {
		int[] vowels = new int[5];

		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a') {
				vowels[0]++;
			}
			if(word.charAt(i) == 'e') {
				vowels[1]++;
			}
			if(word.charAt(i) == 'i') {
				vowels[2]++;
			}
			if(word.charAt(i) == 'o') {
				vowels[3]++;
			}
			if(word.charAt(i) == 'u') {
				vowels[4]++;
			}
		}

		return vowels;
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}