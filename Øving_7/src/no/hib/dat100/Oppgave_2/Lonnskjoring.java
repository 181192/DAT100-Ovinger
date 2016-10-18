package no.hib.dat100.Oppgave_2;

import java.util.Scanner;

public class Lonnskjoring {
	private String firmanamn;
	private Arbeidstaker[] at;
	private int antalTilsette;

	/* Standard konstruktør */
	public Lonnskjoring() {
		at = new Arbeidstaker[antalTilsette];
		firmanamn = "";
	} // konstruktør

	/* Konstruktør med parameter */
	public Lonnskjoring(String firmanamn, int MAXANTALL) {
		at = new Arbeidstaker[MAXANTALL];
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

	public void lesArbeidstakarar(Arbeidstaker a) {
		at[antalTilsette] = a;
		antalTilsette++;
	} // metode

	/* Finner total overtid over de ansatte */
	public void finnTotalOvertid() {
		double sum = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalOvertid = at[j].finnOvertidsTimar();
			sum += totalOvertid;
		} // for
		System.out.printf("%s%.2f%s%n", "Total Overtid\t\t : ", sum, " timer");
	} // metode

	/* Finner total bruttolønn for de ansatte */
	public void finnTotalBruttoløn() {
		double sum = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalBrutto = at[j].finnBruttolon();
			sum += totalBrutto;
		} // for
		System.out.printf("%s%.2f%s%n", "Total Bruttolønn\t : ", sum, " kr");

	} // metode

	/* Skriver ut lønnsoversikt til de ansatte */
	public void skrivLonsoversikt() {
		for (int i = 0; i < antalTilsette; i++) {
			at[i].skrivUt();
		} // for
	} // metode

	/* Skriver ut den høyeste bruttolønnen til en av de ansatte */
	public void skrivHogasteBrutto() {
		double storste = 0;
		storste = at[0].finnBruttolon();
		for (int i = 1; i < antalTilsette; i++) {
			if (at[i].finnBruttolon() > storste) {
				storste = at[i].finnBruttolon();
			} // if
		} // for
		System.out.printf("%s%.2f%s%n", "Høyeste Bruttolønn\t : ", storste, " kr");
	} // metode

	/* Skriv ut firmanavn */
	public void skrivFirmanavn() {
		System.out.println("Firmanavn: " + getFirmanamn() + "\n");
	}

	public void personInnhold(int i) {
		System.out.println();
		Arbeidstaker.tabellOverskrift();
		at[i].finnOvertidsTimar();
		at[i].finnBruttolon();
		at[i].finnSkatt();
		at[i].finnNettolon();
		at[i].skrivUt();
	}

	/* Søk opp en ansatt i firmaet, og skriv ut informasjon om personen */
	public boolean finnOgSkrivPersonAvansert() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Søk på person: ");

		String namn = "";
		namn = tast.nextLine();
		// namn = "Ole Olsen";

		String fornamn = " ";
		String etternamn = " ";

		/* Splitter innlest navn, splitter ved tom-spacing */
		if (namn.contains(" ")) {
			String[] fulltnamn = namn.split(" ");
			fornamn = fulltnamn[0];
			etternamn = fulltnamn[1];
		} else {
			fornamn = namn;
			etternamn = namn;
		}

//		 tast.close();
		/*
		 * Visst enten fornavn eller etternavn er funnet, skal metoden skrive ut
		 * all informasjon
		 */
		for (int i = 0; i < antalTilsette; i++) {
			if (!etternamn.equalsIgnoreCase(at[i].getEtternamn())) {
				if (fornamn.equalsIgnoreCase(at[i].getNamn())) {
					personInnhold(i);
					return true;
				}
			} // if
			else if (etternamn.equalsIgnoreCase(at[i].getEtternamn())) {
				if (!fornamn.equalsIgnoreCase(at[i].getNamn())) {
					personInnhold(i);
					return true;
				}
			} // if
			else if (etternamn.equalsIgnoreCase(at[i].getEtternamn()) && fornamn.equalsIgnoreCase(at[i].getNamn())) {
				personInnhold(i);
				return true;
			} // if
		} // for
		/* Navnet fantes ikke i firmaet */
		System.out.println(etternamn + fornamn + namn);
		System.out.println("Fant ikke navnet du søkte på!");
		return false;
	} // metode

	public boolean finnOgSkrivPerson() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Søk på person: ");

		String namn = "";
		 namn = tast.nextLine();
//		namn = "Ole hoho";
		 tast.close();
		if (startNamn(namn) == false) {
			if (sluttNamn(namn) == true) {
				sluttNamn(namn);
				return true;
			} else if (startNamn(namn) == true) {
				startNamn(namn);
				return true;
			}
		}
		return false;
	}

	public boolean startNamn(String namn) {
		for (int i = 0; i < antalTilsette; i++) {
			if (namn.startsWith(at[i].getNamn())) {
				personInnhold(i);
				return true;
			}
		}
		System.out.println("Fant ikke personen du søkte på!");
		return false;
	}

	public boolean sluttNamn(String namn) {
		for (int i = 0; i < antalTilsette; i++) {
			if (namn.endsWith(at[i].getEtternamn())) {
				personInnhold(i);
				return true;
			}
		}
		System.out.println("Fant ikke personen du søkte på!");
		return false;
	}
}
