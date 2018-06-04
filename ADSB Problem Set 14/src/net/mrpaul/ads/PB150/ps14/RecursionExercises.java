package net.mrpaul.ads.PB150.ps14;

import java.util.ArrayList;
import java.util.List;

/**
 * works with Recursion to solve different problems 
 * each problem has it's own method
 * 
 * @author Natenael Kelkay
 * Date: May 31, 2018
 */
public class RecursionExercises {
	
	/**
	 * Takes a single String parameter and returns it reversed
	 * 
	 * **pseudocode:
	 * check if the words length is 1, if it is return the word
	 * else return the words last letter + reverseString with word at 0 until the last character
	 * **
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
	
	/**
	 * Given a non-negative int n, returns the count of the occurrences of 7 as a digit, so for example 717 yields 2
	 * 
	 * **pseudocode:
	 * if the number is less then 10 and if it is equal 10 7 return 1, else return 0
	 * else
	 * if the number % 10 is 7 return 1 + count7(n/10)
	 * else return just count7(n/10)
	 * **
	 *
	 * @param n
	 * @return
	 */
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
	
	/**
	 * computes recursively if the array contains somewhere a value followed immediately in the array by that value times 10
	 * 
	 * **pseudocode:
	 * check if x -s greater or equal to the arrays length*2
	 * if it is, check if the array at x *1= is the same as the array at x+1
	 * if it is return true, else false
	 * 
	 * else check if a at x * 10 is the same as a at x+1
	 * if it is return true
	 * else return array220(a, x +1)
	 * **
	 * @param a
	 * @param x
	 * @return
	 */
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
	
	
	/**
	 * a method countVowels to return the number of vowels in its single String parameter
	 * 
	 * **pseudocode:
	 * check if the words length is one, if it is, if checkVowel of word.charAt(0) then return 1
	 * else return 0.
	 * Else, check, checkvowels(word.charAt(word.length()-1)). And return 1 and countVowels(word.substring(0, word.length() -1))
	 * else return just countVowels(word.substring(0, word.length() -1))
	 * **
	 * 
	 * @param word
	 * @return
	 */
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
	
	/**
	 * returns 1 if the string parameter is a palindrome and 0 otherwise
	 * 
	 * **pseudocode:
	 * trim the word of spaces
	 * if the length of the word is 1 or 0 return 1
	 * else check the first and last letter of the word,
	 * if they are equal return isPalindrome with the word trimed of the
	 * first and last letters
	 * else return 0
	 * **
	 * 
	 * @param word
	 * @return
	 */
	public static int isPalindrome(String word) {
		word = word.toLowerCase();
		word = word.trim();
		
		if(word.length() == 1 || word.length() == 0) {
			return 1;
		}
		
		else {
			if(word.substring(word.length()-1).equals(word.substring(0, 1))) {
				return isPalindrome(word.substring(1, word.length()-1));
			}
			return 0;
		}
		
	}
	
	//HELPER METHOD: for countVowel
	private static boolean checkVowel(char word) {
		if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
			return true;
		}
		return false;
	}
	
	
	// PART 2 (ONLY FOR APCS 2018):
	
	/**
	 * FINISHED!!
	 * @param list1
	 * @return
	 */
	public static int maxLength(List<String> list1){
		if(list1.size() == 0) {
			return 0;
		}
		else {
		int max = list1.get(0).length();
		
		if(list1.size() == 1) {
			return max;
		}
		
		else
		{
			if(list1.get(0).length() < list1.get(1).length()) {
				max = list1.get(1).length();
				list1.remove(0);
				return maxLength(list1);
			}
			else {
				list1.remove(1);
				return maxLength(list1);
			}
		}
		}	
	}
	
	/**
	 * FINSIHED!
	 * @param list
	 * @return
	 */
	public static String swapPairs(List<String> list){
		
		if(list.size() == 1) {
			return list.get(0);
		}
		else if(list.size() == 0) {
			return "";
		}
		else {
			String x = list.remove(0);
			String y = list.remove(0);
			return y + " " + x + " " + swapPairs(list);
		}
	}
	
	/**
	 * FINISHED!
	 * @param list
	 * @return
	 */
	public static String doubleList(List<String> list){
		
		if (list.size() == 1) {
			list.add(list.get(0));
			return list.get(0) + " " + list.get(1);
		}
		if(list.size() == 0) {
			return "";
		}
		else {
			
			
			String x = list.remove(0);
			String y = list.remove(0);
			return x + " " + x + " " + y + " " + y + " " + doubleList(list);
			
		}
	}
	
	/**
	 * FINISHED!
	 * @param list
	 * @return
	 */
	public static List<Integer> minToFront(List<Integer> list) {
		if(list.size() == 1) {
			return list;
		}
		else {
			//Finds min
			int min  = list.get(0);
			int indexOfMin = -1;
			int countMinReps = 0;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) < min) {
					min = list.get(i);
					indexOfMin = i;
				}
				if(list.get(i) == min) {
					countMinReps++;
				}
			}
			
			//Removes the mins from the list and adds them to the new list;
			List<Integer> newList = new ArrayList<>();
			for(int i = 0; i < countMinReps; i ++) {
				for(int j = 0; j < list.size(); j++) {
					if(list.get(j) == min) {
						list.remove(j);
						newList.add(min);
					}
				}
			}
			
			for(int i = 0; i < newList.size(); i ++) {
				list.add(0, newList.get(i));
			}
			return list;
		}
	}
	
	
	/**
	 * FINISHED!
	 * @param list
	 * @return
	 */
	public static String removeDuplicates(List<String> list) {
		if(list.size() == 1) {
			return list.get(0);
		}
		if(list.size() == 0) {
			return "";
		}
		else {
			if(list.get(0).equals(list.get(1))) {
				String x = list.remove(1);
				list.remove(0);
				return x + " " + removeDuplicates(list);
			}
			else {
				return list.remove(0) + " " + removeDuplicates(list);
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("hello");
		list.add("Hi");
		list.add("Hi");
		list.add("What");
		
		System.out.println(removeDuplicates(list));
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(4);
		list1.add(1);
		list1.add(1);
		list1.add(9);
		//System.out.println(minToFront(list1));
	}
	
}