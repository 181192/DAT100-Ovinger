package no.hib.dat100.Oppgave_3;

import java.util.HashMap;

import easyIO.In;

class AkronymMain {
	static HashMap<String, Akronym> akronymer;

	public static void main(String[] args) {

		// initialiserer akronym-registeret
		akronymer = new HashMap<String, Akronym>();

		// leser inn data fra fil og bygger opp register
		byggRegister();

		// går i dialog med bruker
		brukerdialog();

	}

	static void byggRegister() {
		In fil = new In("akronymer.txt");
		while (!fil.endOfFile()) {

			// leser akronymet og tolkningen
			String akro = fil.inWord();
			String tolkning = fil.readLine().trim();

			// sjekker om akronymet er registrert tidligere
			if (akronymer.containsKey(akro)) {

				// vi skal nå legge til en ny tolkning
				Akronym a = akronymer.get(akro);
				a.add(tolkning);

			} else {
				// vi lager et nytt Akronym-objekt
				Akronym ny = new Akronym(akro, tolkning);

				// vi legger det inn i akronym-registeret
				akronymer.put(akro, ny);
			}
		}
		fil.close();
	}

	static void brukerdialog() {
		In tastatur = new In();
		String svar;
		do {
			System.out.print("Skriv inn et akronym (avslutt med -): ");
			svar = tastatur.inLine();
			svar = svar.trim();
			svar = svar.toUpperCase();
			if (akronymer.containsKey(svar)) {
				Akronym a = akronymer.get(svar);
				a.skrivUt();
			} else if (!svar.equals("-")) {
				System.out.println(svar + " fins ikke i akronymregisteret.");
			}
		} while (!svar.equals("-"));
	}

}// slutt på klassen AkronymMain