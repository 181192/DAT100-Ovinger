package no.hib.dat100.Oppgave_6;

import easyIO.Out;

public class PersonKlient {

	public static void main(String[] args) {
		Person[] p = new Person[] { new Student("Olsen", "Lisa", 1992, Kj�nn.KVINNE, 123123, "H16DATA"),
				new Student("Olsen", "Per", 1993, Kj�nn.MANN, 123123, "H16DATA"),
				new Student("Olloto", "Oda", 1947, Kj�nn.KVINNE, 345663, "H16DATA"),
				new L�rar("Persen", "Ole", 1996, Kj�nn.MANN, 25000, 403),
				new L�rar("Pettersen", "Helga", 1880, Kj�nn.KVINNE, 20000, 123) };

		// Skriver ut person-tabell
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].skrivData());
		} // for

		// Skriver ut eldste person
		int eldste = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].erEldreEnn(p[eldste])) {
				eldste = i;
			} // if
		} // for
		System.out.println(p[eldste].skrivEldste(p));

		// Finner antall menn og kvinner
		int antallKvinner = 0;
		int antallMenn = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].getKj�nn().equals(Kj�nn.KVINNE)) {
				antallKvinner++;
			} // if
			if (p[i].getKj�nn().equals(Kj�nn.MANN)) {
				antallMenn++;
			} // if
		} // for
		System.out.println("Antall kvinner: " + antallKvinner + ", antall menn: " + antallMenn);

		for (int i = 0; i < p.length; i++) {
			Out html = new Out(p[i].getEtternamn() + ".html", false);
			html.out(p[i].tilHTML());
			html.close();
		}
		

		Out index = new Out("index.html", false);
		index.out("<html><h1>Personregister</h1><ul>");
		for (int i = 0; i < p.length; i++) {
			index.out("<li><a href=" + p[i].getEtternamn() + ".html>"+ p[i].getEtternamn() + "</a></li>");
		}
		index.out("</ul></html>");
		index.close();

	} // main
} // class
