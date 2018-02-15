package net.mrpaul.ads.csid.ps06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {
	Dice d1, d2, d3, d4;

	@Before
	public void setUp() throws Exception {
		
		d1 = new Dice();
		d2 = new Dice();
		d3 = new Dice();
		d4 = new Dice();
	}

	@After
	public void tearDown() throws Exception {
		d1= null;
		d2 = null;
		d3 = null;
		d4 = null;
	}

	@Test
	public void testGetCurrentSide() {
		assertEquals(d1.getCurrentSide(), 0);
	}

	@Test
	public void testGetNumRolls() {
		assertEquals(d2.getNumRolls(), 0);
	}

	@Test
	public void testGetNumRollsInt() {
		
		assertEquals(d3.getNumRolls(), 0);
	}

	@Test
	public void testGetPercentage() {
		int i = (int) d4.getPercentage(0);
		int o = -1;
		assertEquals(i,o);
	}

}
