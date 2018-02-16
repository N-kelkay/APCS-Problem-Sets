package net.mrpaul.ads.pb150.ps10;

public class RandomIncrementer implements Incrementable{
	
	private int value;
	
	public RandomIncrementer() {
		value = (int)(Math.random() *101);
	}
	
	@Override
	public void increment(int value) {
		int x = (int)(Math.random() *101);
		value+=x;	
	}

	@Override
	public int getValue() {
		
		return value;
	}

}
