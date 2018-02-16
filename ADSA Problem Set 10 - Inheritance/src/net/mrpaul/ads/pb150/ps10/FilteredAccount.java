package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Account;

public class FilteredAccount extends Account{

	public FilteredAccount(Client c) {
		super(c);
		
	}
	
	public double percentFiltered() {
		return 0;
	}
}
