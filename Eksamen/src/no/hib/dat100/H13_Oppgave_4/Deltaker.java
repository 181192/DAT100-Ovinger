package no.hib.dat100.H13_Oppgave_4;

public class Deltaker {
	private String navn;
	private Tur[] turer;
	private int antall;
	private final int maxAntall = 100;

	public Deltaker(String navn) {
		this.navn = navn;
		turer = new Tur[maxAntall];
	}

	public void leggTil(Tur t) {
		if (antall <= maxAntall) {
			turer[antall] = t;
			antall++;
		} else {
			System.out.println("Det er ikke plass til flere turer. ");
		}
	}

	public int antallGanger(int kode) {
		int antall = 0;
		for (int i = 0; i < turer.length; i++) {
			if (kode == turer[i].getKode() && turer[i] != null) {
				antall++;
			}
		}
		return antall;
	}

	public boolean besoktAlle(int[] tab) {
		boolean tilstand = true;
		for (int j = 0; j < turer.length; j++) {
			if (tab != null && turer != null) { // skjekker om tabellen inneholder elementer
				if (tab.length != turer.length) { // skjekker om de har samme lengde
					tilstand = false;
				} else {
					for (int i = 0; i < turer.length; i++) { 
						if (tab[i] != turer[i].getKode()) { // skjekker om elementene er ulike/like
							tilstand = false;
						}
					}
				}
			} else { // Visst tabellen er null
				tilstand = false;
			}
		}
		return tilstand;
	}
	public boolean besøktMellom(Dato fra, Dato til) {
		boolean tilstand = false;
		for (int i = 0; i < turer.length; i++) {
			if (fra.paaEllerEtter(turer[i].getDato()) && til.paaEllerFoer(turer[i].getDato())) {
				tilstand = true;
			}
		}
		return tilstand;
	}
}
