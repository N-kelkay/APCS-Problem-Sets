package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Account;

/*
 * - include the extra behavior of not processing transactions with a value of 0
 * - the new class should indicate that a zero-valued transaction was approved
 * 
 *  HOW:
 * - This class shouldn't call the process method in the Account class to process
 * - For non-zero-valued transactions, it should call the superclass process method as usual
 */
public class FilteredAccount extends Account{
	private int filtered, submitted;
	
	public FilteredAccount(Client c) {
		super(c);
		filtered = 0;
		submitted = 0;
	}
	
	public double percentFiltered() {
	
		if(submitted == 0) 
			return 0.0;
		else
			return submitted;		
		
	}
	
	public boolean process(Transaction t) {
		super.process(t);
		
		submitted = t.value();
		
		return __processCalled;
	}
}
