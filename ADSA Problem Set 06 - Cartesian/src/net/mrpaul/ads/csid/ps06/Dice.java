package net.mrpaul.ads.csid.ps06;

import java.util.Random;

/**
* The class allows the person to create dies that generate numbers from 1-6 randomly
*
*At the beaconing I set variables and the generator, I set up constructors 
*that initialize the sides and all of the other variables. The other methods are implement.<p> HTML tag.
*<p>
*APCS PS150: Problem set 06 Cartesian
*Date 11/17/2017
* 
*
*@author Natenael Kelkay
*/
public class Dice {

	private int currentSide, numRolls;
	Random generator;
	private int[] sides;

	public Dice() {
		generator = new Random();
		numRolls = 0;
		currentSide = 0;
		sides = new int[6];


	}
	public Dice(long seed) {
		generator = new Random(seed);
		numRolls = 0;
		currentSide = 0;
		
	}
	public void roll() {
		int temp = generator.nextInt(6); 
		sides[temp]++;
		currentSide = temp;
		
	}
	public int getCurrentSide() {
		return currentSide;

	}
	public int getNumRolls() {
		return numRolls;
	}

	public int getNumRolls(int n) {
		if(n < 1 || n > 6)
			return -1;
		else
			return sides[n-1];
		
	}
	// getPercentage
	public double getPercentage(int n) {
		if(n < 1 || n > 6)
			return -1;
		else
			return sides[n-1]/numRolls;
	}
	// Reset
	public void reset() {
		numRolls = 0;
		currentSide = 0;
		int[] temp = new int[6];
		sides = temp;
	}

}
