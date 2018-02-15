package net.mrpaul.ads.csid.ps06;

public class StandardFormLine {
	private double a, b, c;

	public StandardFormLine(double  a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public StandardFormLine( Point p1, Point p2){
		a =  -(p1.slope(p2));
		b  = 1;
		c = p1.getY() - (p1.slope(p2) * p1.getX());
	}
	public StandardFormLine(){
		a = -1;
		b = 1;
		c = 1;
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	//getSlope
	public double getSlope(){
		return -a / b;
	}
	public String toString(){
		return a + "x" + "+" + b + "y" + " = " + c;
	}
}
