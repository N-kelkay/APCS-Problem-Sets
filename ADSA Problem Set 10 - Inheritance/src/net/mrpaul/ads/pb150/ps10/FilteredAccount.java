package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Account;

/**
*class called FilteredAccount whose instances can be used in place of an Account object but which include
*the extra behavior of not processing transactions with a value of 0. 
*
*<p>
*More specifically, the new class should indicate that a zero-valued transaction was approved,
*but shouldn't call the process method in the Account class to process it.  For non-zero-valued transactions, 
*it should call the superclass process method as usual.
*<p>
*APCS PS: Inheritance
*Date; Feb 16, 2018
* 
*@author Natenael Kelkay
*/
public class FilteredAccount extends Account{
	private int filtered, submitted;
	
	/**
	 *  Main constructor
	 * @param c
	 */
	public FilteredAccount(Client c) {
		super(c);
		filtered = 0;
		submitted = 0;
	}
	
	/**
	 * return the percent of transaction filtered out(between 1.0 nas 100.0);
	 * return 0.0 if no transactions submitted
	 * @return
	 */
	public double percentFiltered() {
		
		if (submitted == 0)
			return 0;
		else 
			return (filtered * 100.0) / submitted;
	}
	
	/**
	 * if value is 0 adds 1 to both submitted, and filtered
	 * else added one to submitted
	 * @param t
	 */
	public boolean process(Transaction t) {
		
		if(t.value() == 0) {
			submitted += 1;
			filtered += 1;
			return true;
		} 
		else {
			submitted += 1;
			super.process(t);
			return true;
		}	
	}		
}
