package net.mrpaul.ads.csid.ps06;

/**
* Point is a class that takes point and changes the value depending on which method used.
*
*I first made the x and y the added constructors for them, them made getters and setter, 
*then added other methods that allow the person to change them (the points) <p> HTML tag.
*<p>
*APCS PS150: Problem set 06 Cartesian
*Date 11/17/2017
* 
*
*@author Natenael Kelkay
*/
//A Point object represents a pair of (x, y) coordinates.
public class Point {
	private double x;
	private double y;

	// Constructs a new point at the origin, (0, 0).
	public Point() {
		this(0, 0);  // calls Point(int, int) constructor
	}

	// Constructs a new point with the given (x, y) location.
	public Point(Point p) {
		setLocation(p.x, p.y);
	}

	// Constructs a new point with the given (x, y) location.
	// pre: x >= 0 && y >= 0
	public Point(double x, double y) {
		setLocation(x, y);
	}

	// Returns the distance between this Point and (0, 0).
	public double distanceFromOrigin() {
		return distance(new Point());
	}

	// Returns the distance between this Point and the given other Point.
	public double distance(Point p) {
		double dx = x - p.getX();
		double dy = y - p.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	/*  Interesting aside: The following implementation of distance(p) is also legal.
 	It seems like it shouldn't be, since we are accessing p's private instance variables without using getters.
 	It is, however, legal.  One object may access another object's private instance variables directly (without 
 	getters and setters) IF they are of the same type.  So because "this" is a point, it can access p's private
 	instance variables directly because p is also a point.  In contrast, though, a Student object would NOT be able
 	to access p.x and p.y without getters and setters because it is not a Point object.

	public double distance(Point p) {
		int dx = x - p.x;
		int dy = y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	 */


	// Returns whether o refers to a point with the same (x, y)
	// coordinates as this point.
	public final boolean equals(Object o) {
		if (o instanceof Point) {
			Point other = (Point) o;
			return x == other.getX() && y == other.getY();
		} else { // not a Point object
			return false;
		}
	}

	// Returns the x-coordinate of this point.
	public final double getX() {
		return x;
	}

	// Returns the y-coordidnate of this point.
	public final double getY() {
		return y;
	}

	// Sets this point's (x, y) location to the given values.
	// pre: x >= 0 && y >= 0
	public void setLocation(double x, double y) {
		// if (x < 0 || y < 0) {
		//     throw new IllegalArgumentException();
		// }

		this.x = x;
		this.y = y;
	}

	// Sets the x-coordinate of this point to the given value.
	public void setX(double x) {
		this.x = x;
	}

	// Sets the y-coordinate of this point to the given value.
	public void setY(double y) {
		this.y = y;
	}

	// Returns a String representation of this point.
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	// Shifts this point's location by the given amount.
	// pre: x + dx >= 0 && y + dy >= 0
	public void translate(double dx, double dy) {
		setLocation(x + dx, y + dy);
	}

	//YOUR CODE GOES HERE: manhattanDistance, isVertical, slope, and isCollinear

	public int manhattanDistance(Point other){

		int difX = (int) Math.abs(this.getX() - other.getX());
		int difY = (int) Math.abs(this.getY() - other.getY()); 

		return difX + difY;
	}
	//is vert
	public boolean isVertical(Point other){
		if (this.getX() == other.getX()){
			return true;
		}else
		{
			return false;
		}
	}
	//Slope
	public double slope(Point other) {
		double slope = Math.abs((other.y - this.y) / (other.x - this.x));

		if (this.getY() == other.getY()){
			throw new IllegalArgumentException("Invalid: Slope is undefined between points (" + this.x + ", " + this.y + ") and (" + other.getX() + ", " + other.getY() + ")." );
		}else
		{
			return slope;	
		}
	}
	//isCollinear
	public boolean isCollinear(Point p2, Point p3) {

		double slope1 = Math.abs((p2.y - this.y) / (p2.x - this.x));
		double slope2 = Math.abs((p3.y - this.y) / (p3.x - this.x));

		if(this.x == p2.x || this.x == p3.x) {
		return true;
		}else if(slope1 == slope2) {
			return true;
		}else {
			return false;
		}
	}
}