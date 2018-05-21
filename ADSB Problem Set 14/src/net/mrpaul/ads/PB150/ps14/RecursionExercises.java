package net.mrpaul.ads.PB150.ps14;

public class RecursionExercises {
	
	/*
	 * All methods should be static
	 * 2 JUnit tests are expected for each exercise
	 * Do not use loops in any of the following exercises
	 */
	
	/**
	 * Takes a single String parameter and returns it reversed
	 * 
	 * @param word
	 * @return word reversed
	 */
	public static String reverseString(String word) {
		if (word.length() == 1) {
			return word;
		}
		else {
			return word.substring(word.length()-1) + reverseString(word.substring(0, word.length() - 1));
		}
	}
	
	/**
	 * Given a non-negative int n, returns the sum of its digits recursively
	 * 
	 * **pseudocode:
	 * check is n is less then 10, if it is return n
	 * if it is grater return  n %10 plus sum(n/10)
	 * **
	 * @param n
	 * @return
	 */
	public static int sumDigits(int n) {
		if( n < 10) {
			return n;
		}
		else
		{
			return n%10 + sumDigits(n/10);
		}
		//return n == 0 ? 0 : n % 10 + sumDigits(n/10);		
	}
	
	//FINISHED
	public static int count7(int n) {
		
		if(n < 10) {
			if (n == 7) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		else
		{
			if (n % 10 == 7) {
				return 1 + count7(n/10);
			}
			else {
				return count7(n/10);
			}
		}
	}
	
	/**
	 * Given base and n that are both 1 or more, it computes recursively the value of base to the n power
	 * so powerN(3, 2) is 9 (3 squared).
	 * 
	 *  **pseudocode:
	 *  check if n is 1, if it is rethrn the base
	 *  else, return the base * powerN(base, power - 1)
	 *  **
	 * @param base
	 * @param power
	 * @return
	 */
	public static int powerN(int base, int power) {
		if (power == 1) {
			return base;
		}
		
		else
		{
			return base * powerN(base, power -1);
		}
	}
	
	//FINISHED
	public static boolean array220(int[] a, int x) {
		if(x >= a.length - 2) {
			if(a[x] * 10 == a[x+1]) {
				return true;
			}
			return false;
		}
		
		else {
			if(a[x] * 10 == a[x+1]) {
				return true;
			}
			return array220(a, x + 1);
		}
	}
	
	/**
	 * Implements Euclid's algorithm for finding the greatest common denominator of two positive 
	 * integers (the largest integer that divides both without a remainder)
	 * 
	 * **pseudocode:
	 * gcd (num1, num2) is num2 if num2<=num1 and num2 divides num1 evenly
	 * gcd(num1,num2) is gcd(num2, num1) if num1<num2
	 * gcd(num1, num2) is gcd(num2,num1%num2) otherwise
	 * **
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static int euclideanGCD(int x, int y) {
		if (y <= x && x%y == 0) {
			return y;
		}
		else if(x < y) {
			return euclideanGCD(y, x);
		}
		else
		{
			return euclideanGCD(y, x%y);
		}
	}
	
	
	//FINSISHED
	public static int countVowels(String word) {
		
		if (word.length() == 1) {
			if (checkVowel(word.charAt(0))) {
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else if (checkVowel(word.charAt(word.length()-1))){
			return 1 + countVowels(word.substring(0, word.length() -1));
		}
		else {
			return countVowels(word.substring(0, word.length() -1));
		}

	}
	
	//HELPER METHOD: for countVowel
	private static boolean checkVowel(char word) {
		if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
			return true;
		}
		return false;
	}
	
	//TEST METHOD
	public static void main(String[] args) {
	
		String y = "Natenael";
		System.out.println(countVowels(y));
		
		int x = 756767;
		System.out.println(count7(x));
		
		int[] z = {1, 2, 20, 200};
		System.out.println(array220(z, 0));
	}
}