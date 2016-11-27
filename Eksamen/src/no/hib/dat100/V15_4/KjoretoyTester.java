package no.hib.dat100.V15_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class KjoretoyTester {
	@Test
	public void test() {

		FirmaBil fb = new FirmaBil("123", 10, "o1");

		PrivatBil pb = new PrivatBil("234", -20, 1234);

		Kjoretoy[] k = { fb, pb };

		assertEquals(Regnskap.total(k), -20);

		fb.passer();

		pb.passer();

		assertEquals(Regnskap.total(k), -50);
	}
}
