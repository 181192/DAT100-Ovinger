package no.hib.dat100.Oppgave_2;

import java.util.Scanner;

public class Lonnskjoring {
	private String firmanamn;
	private Arbeidstaker[] register;
	private int antalTilsette;

	/* Standard konstruktør */
	public Lonnskjoring() {
		register = new Arbeidstaker[antalTilsette];
		firmanamn = "";
	} // konstruktør

	/* Konstruktør med parameter */
	public Lonnskjoring(String firmanamn, int MAXANTALL) {
		register = new Arbeidstaker[MAXANTALL];
		this.firmanamn = firmanamn;
	} // konstruktør

	/* Set- og get metoder */
	public String getFirmanamn() {
		return firmanamn;
	} // get

	public void setFirmanamn(String firmanamn) {
		this.firmanamn = firmanamn;
	} // set

	public int getAntalTilsette() {
		return antalTilsette;
	} // get

	public void setAntalTilsette(int antalTilsette) {
		this.antalTilsette = antalTilsette;
	} // set

	/* Leser inn ansatt fra klient */
	public void lesArbeidstakararEnkel(Arbeidstaker a) {
		register[antalTilsette] = a;
		antalTilsette++;
	} // metode

	/* Leser inn en ansatt om gangen */
	public void registrerArbeidstakarar() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Hvor mange arbeidstakarar skal leses inn? ");
		int antall = tast.nextInt();

		for (int i = 0; i < antall; i++) {
			Arbeidstaker a = new Arbeidstaker();
			a.leggTil();
			register[i] = a;
			antalTilsette++;
		}
//		tast.close();
	} // metode

	/* Finner total overtid over de ansatte */
	public double finnTotalOvertid() {
		double sumOvertid = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalOvertid = register[j].finnOvertidsTimar();
			sumOvertid += totalOvertid;
		} // for
		return sumOvertid;
	} // metode

	/* Finner total bruttolønn for de ansatte */
	public double finnTotalBruttoløn() {
		double sumBrutto = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalBrutto = register[j].finnBruttolon();
			sumBrutto += totalBrutto;
		} // for
		return sumBrutto;
	} // metode

	/* Skriver ut den høyeste bruttolønnen til en av de ansatte */
	public double skrivHogasteBrutto() {
		double storste = 0;
		storste = register[0].finnBruttolon();
		for (int i = 1; i < antalTilsette; i++) {
			if (register[i].finnBruttolon() > storste) {
				storste = register[i].finnBruttolon();
			} // if
		} // for
		return storste;
	} // metode

	/* Skriver ut lønnsoversikt til de ansatte */
	public void skrivLonsoversikt() {
		for (int i = 0; i < antalTilsette; i++) {
			register[i].skrivUt();
		} // for
	} // metode

	/* Skriv inn firmanavn */
	public void skrivInnFirmaNamn() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Skriv inn firma namn: ");
		setFirmanamn(tast.nextLine().toUpperCase());
		System.out.println();
//		tast.close();
	} // metode

	/* Skriv ut firmanavn */
	public void skrivUtFirmaNamn() {
		System.out.println("Firmanamn: " + getFirmanamn() + "\n");
	} // metode

	/* Informasjon til de ansatte i plass "i" i lønnskjøring tabell */
	public void personInnhold(int i) {
		System.out.println();
		Arbeidstaker.tabellOverskrift();
		register[i].finnOvertidsTimar();
		register[i].finnBruttolon();
		register[i].finnSkatt();
		register[i].finnNettolon();
		register[i].skrivUt();
	} // metode

	/* Søk opp en ansatt i firmaet, og skriv ut informasjon om personen */
	public boolean finnOgSkrivPerson() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Søk på ansatt: ");

		/* Skriver inn navn på ansatt */
		String namn = "";
		namn = tast.nextLine();
		namn = namn.toLowerCase();
//		tast.close();

		if (sluttNamn(namn) == true) {
			return true;
		} else if (startNamn(namn) == true) {
			return true;
		}
		System.out.println("Fant ikke den ansatte du søkte på!");
		return false;
	} // metode

	/*
	 * Metoden skjekker om navnet du skrev inn starter på fornamnet til de
	 * ansatte
	 */
	public boolean startNamn(String namn) {
		for (int i = 0; i < antalTilsette; i++) {
			String lowerCaseNamn = register[i].getNamn();
			lowerCaseNamn = lowerCaseNamn.toLowerCase();
			if (namn.toLowerCase().startsWith(lowerCaseNamn)) {
				personInnhold(i);
				return true;
			} // if
		} // for
		return false;
	} // metode

	/*
	 * Metoden skjekker om navnet du skrev inn slutter på etternamnet til de
	 * ansatte
	 */
	public boolean sluttNamn(String namn) {
		for (int i = 0; i < antalTilsette; i++) {
			String lowerCaseEtternamn = register[i].getEtternamn();
			lowerCaseEtternamn = lowerCaseEtternamn.toLowerCase();
			if (namn.toLowerCase().endsWith(lowerCaseEtternamn)) {
				personInnhold(i);
				return true;
			} // if
		} // for
		return false;
	} // metode

	public void skrivTotalOversikt() {
		System.out.printf("%s%.2f%s%n", "Total Overtid\t\t : ", finnTotalOvertid(), " timer");
		System.out.printf("%s%.2f%s%n", "Total Bruttolønn\t : ", finnTotalBruttoløn(), " kr");
		System.out.printf("%s%.2f%s%n", "Høyeste Bruttolønn\t : ", skrivHogasteBrutto(), " kr");
	}
	
	public void meny() {
		String meny = "1- Personsøk fornamn, etternamn eller fulltnamn\n" + "2- Avslutt\n" + "\nValg: ";

		Scanner tast = new Scanner(System.in);
		String valg = "0";
		do {
			System.out.print(meny);
			valg = tast.next();
			switch (valg) {
			case "1":
				System.out.println();
				finnOgSkrivPerson();
				System.out.println();
				break;
			case "2":
				break;
			default:
				System.out.println("\nUkjent menyvalg\n");
			}
		} while (!valg.equals("2")); // do-while
		tast.close();
	}
} // class
