package net.mrpaul.ads.csid.ps06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	Fraction f1, f2, f3, f4, f5, f6, f7, f8;
	@Before
	public void setUp() throws Exception {
	f1 = new Fraction(1,3);
	f2 = new Fraction(1,4);
	f3 = new Fraction(4,5);
	f4 = new Fraction(3,4);
	f5 = new Fraction(2,4);
	f6 = new Fraction(2,2);
	f7 = new Fraction(1,2);
	f8 = new Fraction(3,5);
	
	}
	@After
	public void tearDown() throws Exception {
	f1 = null;
	f2 = null;
	f3 = null;
	f4 = null;
	f5 = null;
	f6 = null;
	f7 = null;
	f8 = null;
	}
	@Test
	public void testAdd() {
		String actual = f1.add(f2).toString();
		String m1 = "7/12";
		assertEquals(actual, m1);
	}

	@Test
	public void testSubtract() {
		String actual = f3.subtract(f4).toString();
		String m2 = "1/20";
		assertEquals(actual, m2);
	}

	@Test
	public void testMultiply() {
		String actual = f5.multiply(f6).toString();
		String m3 = "1/2";
		assertEquals(actual, m3);
	}

	@Test
	public void testDivide() {
		String actual = f7.Divide(f8).toString();
		String m4 = "5/6";
	}

}
