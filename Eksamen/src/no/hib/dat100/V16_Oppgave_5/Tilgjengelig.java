package no.hib.dat100.V16_Oppgave_5;

public class Tilgjengelig {
	boolean[][] tilgjengelig = { { true, true, true, true }, // person 0
			{ true, true, true, true }, // person 1
			{ true, true, true, true }, // person 2
			{ false, true, false, true },
			{ true, false, true, true },
			{ false, true, false, true }}; // person 3

	public boolean kan(int p, int t) {
		return tilgjengelig[p][t];
	}

	public void skrivUt() {
		for (int rad = 0; rad < tilgjengelig.length; rad++) {
			for (int kol = 0; kol < tilgjengelig[rad].length; kol++) {
				if (tilgjengelig[rad][kol]) {
					System.out.print("+ ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

	public boolean kanAlle(int tidspunkt) {
		boolean kanAlle = true;
		for (int rad = 0; rad < tilgjengelig.length; rad++) {
			if (!tilgjengelig[rad][tidspunkt]) {
				kanAlle = false;
			}
		}
		return kanAlle;
	}

	public int antallSomKan(int t) {
		int antall = 0;

		for (int p = 0; p < tilgjengelig.length; p++) {
			if (tilgjengelig[p][t]) {
				antall++;
			}
		}
		return antall;
	}

	public int foreslaaTidspunkt() {
		// 0 er beste tidspunkt (index) til å starte med
		int bestetidspunkt = 0;

		for (int t = 0; t < tilgjengelig[0].length; t++) {
			if (antallSomKan(t) > antallSomKan(bestetidspunkt)) {
				bestetidspunkt = t;
			}
		}
		return bestetidspunkt;
	}
}
