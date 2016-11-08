package no.hib.dat100.Oppgave_6;

public class PersonKlient {

	public static void main(String[] args) {
		Person[] p = new Person[] { new Student("Olsen", "Lisa", 1992, Kjønn.KVINNE, 123123, "H16DATA"),
				new Student("Olsen", "Per", 1993, Kjønn.MANN, 123123, "H16DATA"),
				new Student("Olloto", "Oda", 1947, Kjønn.KVINNE, 345663, "H16DATA"),
				new Lærar("Persen", "Ole", 1996, Kjønn.MANN, 25000, 403),
				new Lærar("Pettersen", "Helga", 1980, Kjønn.KVINNE, 20000, 123) };
		
		// Skriver ut person-tabell
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].skrivData());
		} // for

		// Skriver ut eldste person
		int eldste = p[0].getFødselsår();
		int teller = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].getFødselsår() > eldste) {
				eldste = p[i].getFødselsår();
			} // if
			teller++;
		} // for
		System.out.println("\nDen eldste personen er " + p[teller - 1].getFornamn() + " " + p[teller - 1].getEtternamn()
				+ " på " + (2016 - p[teller - 1].getFødselsår() + " år."));
		
		// Finner antall menn og kvinner
		int antallKvinner = 0;
		int antallMenn = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].getKjønn().equals(Kjønn.KVINNE)) {
				antallKvinner++;
			} // if
			if (p[i].getKjønn().equals(Kjønn.MANN)) {
				antallMenn++;
			} // if
		} // for
		System.out.println("Antall kvinner: " + antallKvinner + ", antall menn: " + antallMenn);

	} // main
} // class
