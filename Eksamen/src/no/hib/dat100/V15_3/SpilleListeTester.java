package no.hib.dat100.V15_3;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SpilleListeTester {

	@Test
	public void test() {
		
		SpilleListe sl = new SpilleListe();
		
		Sang s1 = new Sang ("s1",10,Sjanger.ROCK);
		Sang s2 = new Sang ("s2",10,Sjanger.POP);
		
		sl.leggTil(s1);
		sl.visListe();
		
		assertFalse(sl.leggTilSjekk(s1));
		
		sl.leggTilSjekk(s2);
		sl.visListe();
		
		/*
		ArrayList<Sang> sl1 = sl.finnSanger(Sjanger.ROCK);
		
		assertTrue(sl1.contains(s1));
		
		assertFalse(sl1.contains(s2));
		*/
	}

}
