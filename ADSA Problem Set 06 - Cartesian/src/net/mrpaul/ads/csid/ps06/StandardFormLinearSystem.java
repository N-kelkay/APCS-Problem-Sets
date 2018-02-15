package net.mrpaul.ads.csid.ps06;

public class StandardFormLinearSystem {
	private  StandardFormLine l1, l2;
	
	public StandardFormLinearSystem(StandardFormLine line1, StandardFormLine line2){
		this.l1 = line1;
		this.l2 = line2;
	}
	
	public StandardFormLinearSystem(){
		l1 = new StandardFormLine();
		l2 = new StandardFormLine();
	}
	public StandardFormLine getL1() {
		return l1;
	}
	public void setL1(StandardFormLine l1) {
		this.l1 = l1;
	}
	public StandardFormLine getL2() {
		return l2;
	}
	public void setL2(StandardFormLine l2) {
		this.l2 = l2;
	}
	//I have getters and setters done the way you want it 
	//below but I prefer the above code so, I kept the top one instead
	
	/*public void setLine(int lineNumber, StandardFormLine line){
		if (lineNumber == 1){
			l1 = line;
		} else if(lineNumber == 2){
			l2 = line;
		} else
		{
			System.out.println("Number should be 1 or 2");
		}
	}
	public StandardFormLine getLine(int lineNumber){
		if(lineNumber == 1){
			return l1;
		} else if (lineNumber == 2){
			return l2;
		} else{
			throw new ArithmeticException("Number should be 1 or 2"); 	
		}
		
	}
	*/
	public String toString(){
		// <A1>x + <B1>y = <C1>
		// <A2>x + <B2>y = <C2>
		return l1.toString() + "\n" + l2.toString();
	}
	public boolean haveSameSlope(){
		return l1.getSlope() == l2.getSlope();
	}
	public boolean hasInfiniteSolutions(){
		return this.haveSameSlope() && (l1.getC()/l1.getB() == (l1.getC() / l1.getB()));
	}
	public boolean areParallel(){
		 return this.haveSameSlope() && !this.hasInfiniteSolutions();
	}
	public Point solve(){
		if (this.hasInfiniteSolutions() || this.areParallel()){
			return null;
		} else
		{
			double x = this.determinate(l1.getC(), l1.getB(), l2.getC(), l2.getB())
					/ this.determinate(l1.getA(), l1.getB(), l2.getA(), l2.getB());
			double y = this.determinate(l1.getA(), l1.getC(), l2.getA(), l2.getC())
					/ this.determinate(l1.getA(), l1.getB(), l2.getA(), l2.getB());
			
			return new Point(x,y);
		}
	}
	private double determinate( double a, double b, double c, double d){
		return (a * d) - (c * b);
	}

}
