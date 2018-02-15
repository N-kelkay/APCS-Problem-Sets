package net.mrpaul.ads.csid.ps06;

/**
 * The class allows the person fractions, and allows them to be divided added and more.
 *
 *At the beginning I set up variables to set the num and denom. Aster i initialized them.
 * I add constructors and getters and setters methods. After I added methods that allow the 
 * Person to add subtract and do other things. <p> HTML tag.
 *<p>
 *APCS PS150: Problem set 06 Cartesian
 *Date 11/17/2017
 * 
 *
 *@author Natenael Kelkay
 */
public class Fraction {
	private int numerator; 
	private int denominator;

	public Fraction() {
		numerator = 1;
		denominator = 1;
	}
	Fraction(int n, int d){
		numerator = n;
		denominator = d;
	}
	public int getnumerator() {
		return numerator;
	}
	public void setnumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//ADD
	public Fraction add(Fraction f1) {
		Fraction finalAns = new Fraction();
		finalAns.setnumerator((this.numerator * f1.denominator) + (f1.numerator * this.denominator));
		finalAns.setDenominator(this.denominator * f1.denominator);
		return finalAns.reduce();
	}
	//SUBTRACT
	public Fraction subtract(Fraction f1) {
		Fraction finalAns = new Fraction();
		finalAns.setnumerator((this.numerator * f1.denominator) - (f1.numerator * this.denominator));
		finalAns.setDenominator(this.denominator * f1.denominator);
		return finalAns.reduce();
	}
	//MULTIPLY
	public Fraction multiply(Fraction f1) {
		Fraction finalAns = new Fraction();
		finalAns.setnumerator(this.numerator * f1.numerator);
		finalAns.setDenominator(this.denominator * f1.denominator);
		return finalAns.reduce();
	}
	//DIVIDE
	public Fraction Divide(Fraction f1) {
		Fraction finalAns = new Fraction();
		finalAns.setnumerator(this.numerator * f1.denominator);
		finalAns.setDenominator(this.denominator * f1.numerator);
		return finalAns.reduce();

	}

	public Fraction reduce(){
		int lNum, sNum;
		int gcf = 1;
		if(numerator > denominator){
			sNum = denominator;
			lNum = numerator;
		}
		else{
			sNum = numerator;
			lNum = denominator;
		}
		for(int x = sNum; x > 0; x--){
			if(sNum % x == 0 && lNum % x == 0){
				gcf = x;
				break;
			}	
		}
		return new Fraction(numerator / gcf , denominator / gcf);
	}
	public Fraction getReciprocal(Fraction f1){
		Fraction finalAns = new Fraction();
		finalAns.setDenominator(numerator);
		finalAns.setnumerator(denominator);
		return finalAns.reduce();
	}
	public String toString() {
		return this.getnumerator() + "/" + this.getDenominator();
	}
}
