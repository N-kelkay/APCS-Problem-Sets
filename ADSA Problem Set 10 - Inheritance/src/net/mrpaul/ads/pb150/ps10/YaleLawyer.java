package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Lawyer;

public class YaleLawyer extends Lawyer{
	
	/*
	 * - 20% more money than a normal lawyer
	 * (non-Javadoc)
	 * @see net.mrpaul.ps10.distribution.Employee#getSalary()
	 */
	public double getSalary() {
		return 50000;
	}
	
	/*
	 * - They get 3 days more vacation 
	 * (non-Javadoc)
	 * @see net.mrpaul.ps10.distribution.Lawyer#getVacationDays()
	 */
	public int getVacationDays() {
		return 18;
	}
	
	/*
	 * - They have to fill out four of the lawyer's forms to go on vacation
	 * (non-Javadoc)
	 * @see net.mrpaul.ps10.distribution.Lawyer#getVacationForm()
	 */
	public String getVacationForm() {
		return "pinkpinkpinkpink";
	}
	
}
