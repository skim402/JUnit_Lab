import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1, g2;
	
	@Before
	public void setUp() throws Exception{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(3.8);
		g1.addScore(9.4);
		g1.addScore(1.3);
		g1.addScore(8.7);
		
		g2.addScore(8.4);
		g2.addScore(7.7);
		
	}
	
	@After
	public void tearDown() throws Exception{
		g1 = null;
		g2 = null;
	}
	
	
	@Test
	public void addScoreTest() {
		assertTrue(g1.toString().equals("3.8 9.4 1.3 8.7 "));
		assertEquals(g1.getScoreSize(), 4);
		assertTrue(g2.toString().equals("8.4 7.7 "));
		assertEquals(g2.getScoreSize(), 2);
	}
	
	@Test
	public void testSum() {
		assertEquals(23.2, g1.sum(), 0.001);
		assertEquals(16.1, g2.sum(), 0.001);
	}
	
	@Test
	public void testMinimum() {
		assertEquals(g1.minimum(), 1.3, 0.001);
		assertEquals(g2.minimum(), 7.7, 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(g1.finalScore(), 21.9, 0.001);
		assertEquals(g2.finalScore(), 8.4, 0.001);
	}

}
