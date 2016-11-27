package no.hib.dat100.H15_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class GrafTester {
	@Test
	public void test() {

		boolean[][] nabomatrise = 
			{ { false, true, false, true, false, false },
				{ true, false, true, false, true, true }, 
				{ false, true, false, false, true, true },
				{ true, false, false, false, false, false }, 
				{ false, true, true, false, false, true },
				{ false, true, true, false, true, false } };

		
		Graf graf = new Graf(nabomatrise);
		
		assertTrue(graf.erNaboer(0,1));
		assertFalse(graf.erNaboer(3, 1));
		
		assertFalse(graf.regular(1));
		assertFalse(graf.regular(7));
		
		int[] noder = {1,2,4,5};
				
		assertTrue(graf.klikk(noder));
		
		int[] noder1 = {0,1,3};
		
		assertFalse(graf.klikk(noder1));
	}
}
