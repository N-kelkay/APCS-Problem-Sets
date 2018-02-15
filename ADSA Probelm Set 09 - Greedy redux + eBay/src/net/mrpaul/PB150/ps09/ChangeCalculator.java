package net.mrpaul.PB150.ps09;

/**
*Finds the minimum change for a given value recursively and dynamicaly
*
*<p> The methods accept and int of array and an int. The method runs and finds the minimum change possible to make the int value passed with the numbers in the array <p>
*
*APCS PS150: Greedy redux + eBay
*Friday 2, 2018
*
*@author Natenael Kelkay
*/
public class ChangeCalculator {

	/**
	 * Gets the minimum amount of combinations possible to make up a
	 * coins value that is passed in, using an array of coin values also passed in as an array
	 *
	 * @param n
	 * @param coins
	 * @return int
	 */

	public static int recursiveMinChange(int n, int[] coins) {
		int[] difChangeValue = new int[coins.length];

		for(int i = 0; i < coins.length; i ++) {
			if (n - coins[i] == 0) {
				difChangeValue[i] = 1;
			} else if (n - coins[i] < 0) {
				difChangeValue[i] = Integer.MAX_VALUE;
			} else {
				difChangeValue[i] = recursiveMinChange(n - coins[i], coins) + 1;
			}
		}
		return getMinValue(difChangeValue);	
	}	

	/**
	 * Implements the dynamic programming algorithm was wrote in step 1 to solve the Min-Change problem
	 *
	 * @param n
	 * @param coins
	 * @return int
	 */
	public static int dynamicMinChange(int n, int[] coins) {
		int[] difChangeValue = new int[n +1];
		int dif1 = 0;
		difChangeValue[0] = 0;
		difChangeValue[1] = 1;
		for(int i = 2; i < difChangeValue.length; i++) {
			for(int j = coins.length - 1; j >= 0; j--) {
				if(n - coins[j] >= 0) {
					//System.out.println(n-coins[j]);
					if (difChangeValue[i] > difChangeValue[n - coins[j]] + 1 || difChangeValue[i] == 0){
						difChangeValue[i] = difChangeValue[n - coins[j]] + 1;
					}
				}
			}
		}
		return difChangeValue[n];
	}

	/**
	 * HELPER METHOD: Not for Project
	 * Gets the minimum value
	 *
	 * @param array
	 * @return int
	 */
	public static int getMinValue(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		/*	//n = 11 cents in a regular American coinset C = [1,5,10,25]
		int n = 144700;
		int[] c = {1, 3, 6, 8, 21, 25};

		System.out.println(recursiveMinChange(n, c));
		 */
		int n = 144700;
		int[] c = {1, 3, 6, 8, 21, 25};

		System.out.println(dynamicMinChange(n, c));

	}

}
