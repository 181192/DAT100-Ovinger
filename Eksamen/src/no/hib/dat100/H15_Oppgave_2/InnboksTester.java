package no.hib.dat100.H15_Oppgave_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class InnboksTester {
	@Test
	public void test() {

		int ANTALL = 10;

		Innboks innboks = new Innboks(ANTALL);
		assertEquals(ANTALL, innboks.maxAntall());
		assertEquals(ANTALL, innboks.antallLedige());

		innboks.leggTil(new Epost("Lars", "Michael", "en epost"));
		assertEquals(ANTALL - 1, innboks.antallLedige());
		assertFalse(innboks.erFull());

		innboks.leggTil(new Epost("X", "Y", "en epost til"));
		assertEquals(ANTALL - 2, innboks.antallLedige());
	}

}
