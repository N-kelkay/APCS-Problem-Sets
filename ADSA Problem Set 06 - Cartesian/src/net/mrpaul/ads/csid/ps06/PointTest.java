package net.mrpaul.ads.csid.ps06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {
	Point p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18;
	

	@Before
	public void setUp() throws Exception {
		p1 = new Point(10, 10);
		p2 = new Point(10, 11);
		p3 = new Point(-10, 10);
		p4 = new Point(-10, 11);	
		p5 = new Point(-10, -10);
		p6 = new Point(-10, -11);
		p7 = new Point(10, -10);
		p8 = new Point(10, -11);
		p10 = p1;
		p11 = p2;
		p12 = new Point(4, 6);
		p13 = new Point(4, 5);
		p14 = new Point(5, 5);
		p15 = new Point(10, 10);
		p16 = new Point(0, 1);
		p17 = new Point(1, 3);
		p18 = new Point(2, 5);
	}
	
	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		p3 = null;
		p4 = null;
		p5 = null;
		p6 = null;
		p7 = null;
		p8 = null;
		p9 = null;
		p10 = null;
		p11 = null;
		p12 = null;
		p13 = null;
		p14 = null;
		p15 = null;
		p16 = null;
		p17 = null;
		p18 = null;
	}

	@Test
	public void testManhattanDistance() {
		// Quad 1:
				int actual = p1.manhattanDistance(p2);
				assertEquals(actual, 1);
		// Quad 2:
		
		int actual2 = p3.manhattanDistance(p4); 
		assertEquals(actual2, 1);
		// Quad 3:
	
		int actual3 = p5.manhattanDistance(p6);
		assertEquals(actual3, 1);
		// Quad 4:
		
		int actual4 = p7.manhattanDistance(p8);
		assertEquals(actual4, 1);
		// Same identity
		
		assertEquals(p10.manhattanDistance(p11), 1);	
	}
	@Test
	public void isVertical() {		
		assertTrue(p12.isVertical(p13));
	}
	@Test
	public void slope() {
		System.out.println(p14.slope(p15));
		assertEquals(1, p14.slope(p15), .0001);
	}
	@Test
	public void isCollinear() {
		assertEquals(p16.isCollinear(p17, p18), true);
	}

}
