package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Employee;

public class Marketer extends Employee{
	public double getSalary() {
		return 50000.00;
	}
	
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}
}
