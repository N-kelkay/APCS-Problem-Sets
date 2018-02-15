package net.mrpaul.ads.csid.ps07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PigLatinTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStartOfFirstConsonantCluster() {
		int x = PigLatin.startOfFirstConsonantCluster("Word");
		assertEquals(0, x);
	}

	@Test
	void testEndOfFirstConsonantCluster() {
		int x = PigLatin.endOfFirstConsonantCluster("Wwword");
		assertEquals(x, 2);
	}

	@Test
	void testFindStartOfEndingPuncSeq() {
		int x = PigLatin.findEndOfStartingPuncSeq("...word...");
		assertEquals(2, x);
	}

	@Test
	void testFindEndOfStartingPuncSeq() {
		int x = PigLatin.findStartOfEndingPuncSeq("...word...");
		assertEquals(7, x);
	}

}
