package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.BankingAccount;

public class MinMaxAccount extends BankingAccount{

	private int min, max;
	
	/**
	 * - Constructs a MinMaxAccount object using information in the Startup object s
	 * @param s
	 */
	public MinMaxAccount(Startup s) {
		super(s);
		min = super.getBalance();
		max = super.getBalance();
	}

	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public void debit(Debit d) {
		super.debit(d);
		
		if(super.getBalance() < min) 
			min = super.getBalance();
		else if(super.getBalance() > max)
			max = super.getBalance();
	}
	
	public void credit(Credit c) {
		super.credit(c);
		
		if (super.getBalance() < min)
			min = super.getBalance();
		else if(super.getBalance() > max)
			max = super.getBalance();
	}

}
