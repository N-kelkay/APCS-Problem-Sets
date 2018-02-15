package net.mrpaul.PB150.ps09;

import images.APImage;

/**
*This class works with the term Fibonacci. 
*
*<p> The methods Find the nth Fibonacci Number. "n" is the number passed in through the parameters. <p>
*
*APCS PS150: Greedy redux + eBay
*Friday 2, 2018
*
*@author Natenael Kelkay
*/
public class Fibonacci {
	/**
	 * Finds the nth Fibonacci Number
	 *
	 * @param n
	 * @return int
	 */
	public static int recursiveFibonacci(int n){	
		//base case
		if (n == 1) {
			return 1;
		} else if (n == 0){
			return 0;
			//Recursive case
		}else
			return (int) (recursiveFibonacci(n -1) + recursiveFibonacci(n - 2));	
	}

	/**
	 * Calculating only the nth term, we begin at the 0th and build our way up to the nth term
	 *
	 * @param n
	 * @return int
	 */
	public static int dynamicFibonacci(int n){	
		int[] dp = new int[n+1];
		dp[0] = 0;

		if (n > 0) {
			dp[1] = 1;
		}

		for(int i = 2; i < dp.length; i++ ) {
			dp[i] = dp[i -1] + dp[i - 2];
		}
		return dp[dp.length -1];
	}

	/**
	 * HELPER: Not for Project
	 * Accepting an array of integers. It finds the nano time difference from the start of the
	 * RecursiveFibonacci to the end of the process
	 *
	 * @param array
	 */
	public static void nanoTimeDifferenceRecursiveFibonacci(int[] array, String string) {
		APImage betterRec = new APImage("BetterRecursiveNanoTimeChart.png");
		APImage rec = new APImage("RecursiveNanoTimeChart.png");

		if(string == "Recursive") {
			for(int i = 0; i < array.length; i++) {
				long o = System.nanoTime();
				recursiveFibonacci(array[i]);
				long t = System.nanoTime() - o;
				System.out.println(t);
			}
			System.out.println("The graph looks somewhat like this: ");
			rec.draw();
		} else if (string == "Dynamic") {
			for(int i = 0; i < array.length; i++) {
				long o = System.nanoTime();
				dynamicFibonacci(array[i]);
				long t = System.nanoTime() - o;
				System.out.println(t);
			}
			System.out.println("The graph looks somewhat like this: ");
			betterRec.draw();
		}
	}

	public static void main(String[] args) {
		/*
		 *  Checks the NanoTime for both algorithms: "Recursive" and the better 
		 *  version of that; "Better Recursive". And draws a graph of them
		 */
		int[] n = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};
		nanoTimeDifferenceRecursiveFibonacci(n, "Dynamic");
	}
}
