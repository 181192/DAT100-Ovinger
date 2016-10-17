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

	public void finnTotalOvertid() {
		double sum = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalOvertid = at[j].finnOvertidsTimar();
			sum += totalOvertid;
		} // for
		System.out.printf("%s%.2f%s%n", "Total Overtid\t\t : ", sum, " timer");
	} // metode

	public void finnTotalBruttoløn() {
		double sum = 0;
		for (int j = 0; j < antalTilsette; j++) {
			double totalBrutto = at[j].finnBruttolon();
			sum += totalBrutto;
		} // for
		System.out.printf("%s%.2f%s%n", "Total Bruttolønn\t : ", sum, " kr");

	} // metode

	public void skrivLonsoversikt() {
		for (int i = 0; i < antalTilsette; i++) {
			at[i].skrivUt();
		} // for
	} // metode

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

	public boolean finnOgSkrivPerson() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Søk på person: ");

		String namn = "";
		namn = tast.nextLine();
//		namn = "Ole Olsen";		
		
		String[] fulltnamn = namn.split(" ");
		String fornamn = fulltnamn[0];
		String etternamn = fulltnamn[1];
		
		tast.close();		

		for (int i = 0; i < antalTilsette; i++) {
			if (!etternamn.equalsIgnoreCase(at[i].getNamn()) && fornamn.equalsIgnoreCase(at[i].getNamn()) ) {
				System.out.println();
				Arbeidstaker.tabellOverskrift();
				at[i].finnOvertidsTimar();
				at[i].finnBruttolon();
				at[i].finnSkatt();
				at[i].finnNettolon();
				at[i].skrivUt();
				return true;
			
			} // if
			else if(etternamn.equalsIgnoreCase(at[i].getNamn()) && !fornamn.equalsIgnoreCase(at[i].getNamn()) ) {
				System.out.println();
				Arbeidstaker.tabellOverskrift();
				at[i].finnOvertidsTimar();
				at[i].finnBruttolon();
				at[i].finnSkatt();
				at[i].finnNettolon();
				at[i].skrivUt();
				return true;
			} // if
		} // for
		System.out.println("Fant ikke navnet du søkte på!");
		return false;		
	} // metode
	public void skrivFirmanavn() {
		System.out.println("Firmanavn: " + getFirmanamn() +"\n");
	}
}
