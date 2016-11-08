package no.hib.dat100.Oppgave_3;

class Akronym {
	int antall;
	String akronym;
	String[] tolkninger = new String[10];

	Akronym(String a, String t) {
		akronym = a;
		tolkninger[antall] = t;
		antall = 1;
	}

	void add(String t) {
		if (antall < 10) {
			tolkninger[antall] = t;
			antall++;
		} else {
			System.out.println("For mange tolkninger av " + akronym);
		}
	}

	void skrivUt() {
		System.out.println(akronym + " kan bety:");
		for (int i = 0; i < antall; i++) {
			System.out.println("   " + tolkninger[i]);
		}
	}
} // slutt på klassen Akronym
