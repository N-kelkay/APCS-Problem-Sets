package net.mrpaul.PB150.ps12;

/**           
* Works with 2d arrays
*
*<p> Has multiple methods that work with 2d arrays, and gets the desired output <p>
*APCS PS150: Sort it out
*Date
* 
*
*@author Natenael Kelkay
*/
public class Exercises2dArr {
	
	/**
	 * returns the maximum value
	 * @param a
	 * @return
	 */
	public static int max(int[][] a) {
		int max = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
		for(int j = 0; i < a[i].length; j++) {
			if (a[i][j] > max) {
				max = a[i][j];
			}
		}
	}
		return max;
	}
	
	/**
	 * returns the minimum value
	 * @param a
	 * @return
	 */
	public static int min(int[][] a) {
		int min = a[0][0];
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; i < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
			}
		}
	}
		return min;
	}
	
	/**
	 * Takes a 2d parameter array a and calculates the sum of each row, 
	 * returning an array in which element i of 
	 * the returned array is the sum of row i in a
	 * 
	 * @param a
	 * @return
	 */
	public static int[] collapseRows(int[][] a) {
		
		int[] sumRow = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; i < a[i].length; j++) {
				sumRow[i] = a[i][j];
			}
		}
		return sumRow;
	}
	
	/**
	 * constructs and returns a ragged two-dimensional array of integers 
	 * named ragged with n rows and an increasing number of columns in each row, 
	 * such that the first row has one column, the second row has two, 
	 * the third has three, and so on
	 * 
	 * @param n
	 * @return
	 */
	public static int[][] generateRagged(int n){
		
		int[][] ragged = new int[n][];
		int count = 1;
		for(int  i = 0; i< ragged.length; i++) {
			ragged[i] = new int [count];
			count ++;
		}
		return ragged;
	}
	
	/**
	 * checks to see whether arr is a Latin square
	 * 
	 * @param arr
	 * @return
	 */
	public static boolean isLatinSquare(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; i++) {
				if(arr.length != arr[i].length) {
					return false;
				}
				if(arr[i] == arr[i]) {
					return false;
				}
				else if(arr[i] == arr[j]) {
					return false;
				}
				else
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}