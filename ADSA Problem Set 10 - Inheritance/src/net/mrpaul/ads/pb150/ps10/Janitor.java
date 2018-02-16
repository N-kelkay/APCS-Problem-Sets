package net.mrpaul.ads.pb150.ps10;

import net.mrpaul.ps10.distribution.Employee;

public class Janitor extends Employee{
	public int getHours() {
		return 80;
	}
	
	public double getSalary() {
		return 30000;
	}
	
	public int getVacationDays() {
		return 5;
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
}
