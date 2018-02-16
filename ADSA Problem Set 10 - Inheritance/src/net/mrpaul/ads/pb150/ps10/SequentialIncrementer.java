package net.mrpaul.ads.pb150.ps10;

public class SequentialIncrementer implements Incrementable {
	
	private int value;
	
	public SequentialIncrementer(){
		value = 0;
	}
	
	@Override
	public void increment(int value) {
		value++;
	}

	@Override
	public int getValue() {
		
		return value;
	}

}
