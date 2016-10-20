package no.hib.dat100.Oppgave_2;

import java.util.Scanner;

import easyIO.Out;

public class Arbeidstaker {
	private String namn;
	private String etternamn;
	private double timelon;
	private final double MAXTIMERUKE = 37.5;
	private double antalTimar;
	private int skatteprosent;

	public Arbeidstaker() {
		namn = "";
		etternamn = "";
		timelon = 0;
		antalTimar = 0;
		skatteprosent = 0;
	} // metode

	public Arbeidstaker(String namn, String etternamn, double timelon, double antalTimar, int skatteprosent) {
		this.namn = namn;
		this.etternamn = etternamn;
		this.timelon = timelon;
		this.antalTimar = antalTimar;
		this.skatteprosent = skatteprosent;
	} // metode

	/* Setters and getters */
	public String getNamn() {
		return namn;
	} // get

	public void setNamn(String namn) {
		this.namn = namn;
	} // set

	public String getEtternamn() {
		return etternamn;
	}

	public void setEtternamn(String etternamn) {
		this.etternamn = etternamn;
	}

	public double getTimelon() {
		return timelon;
	} // get

	public void setTimelon(double timelon) {
		this.timelon = timelon;
	} // set

	public double getAntalTimar() {
		return antalTimar;
	}

	public void setAntalTimar(double antalTimar) {
		this.antalTimar = antalTimar;
	}

	public double getMAXTIMERUKE() {
		return MAXTIMERUKE;
	}

	public int getSkatteprosent() {
		return skatteprosent;
	} // get

	public void setSkatteprosent(int skatteprosent) {
		this.skatteprosent = skatteprosent;
	} // set

	public double finnOvertidsTimar() {
		double overtid = 0;
		if (antalTimar > MAXTIMERUKE) {
			overtid = antalTimar - MAXTIMERUKE;
		}
		return overtid;
	} // metode

	public double finnBruttolon() {
		double bruttolon = getTimelon() * (getAntalTimar() + finnOvertidsTimar());
		double overtidslon = 0;
		double overtidsats = 0;
		if (finnOvertidsTimar() > 0) {
			overtidsats = 1.50;
		} else {
			overtidsats = 1;
		}
		overtidslon = finnOvertidsTimar() * getTimelon() * overtidsats;
		bruttolon = (getTimelon() * getAntalTimar()) + overtidslon;

		return bruttolon;
	} // metode

	public int finnSkatt() {
		return (getSkatteprosent() * (int) finnBruttolon()) / 100;
	} // metode

	public double finnNettolon() {
		return finnBruttolon() - finnSkatt();
	} // metode

	public void skrivUt() {
		/*
		 * namn timar timeløn overtid bruttolønn skatt nettolønn
		 */
		final int b1 = 15;
		final int b2 = 12;

		Out ut = new Out();

		ut.out(getNamn(), b1-7);
		ut.out(getEtternamn(), b1-6);
		ut.out(getAntalTimar(), 2, b2-2, Out.RIGHT);
		ut.out(getTimelon(), 2, b2, Out.RIGHT);
		ut.out(finnOvertidsTimar(), 2, b2, Out.RIGHT);
		ut.out(finnBruttolon(), 2, b2, Out.RIGHT);
		ut.out(finnSkatt(), b2, Out.RIGHT);
		ut.outln(finnNettolon(), 2, b2, Out.RIGHT);
	} // metode

	public static void linje(char c) {
		int antall = 88;
		for (int i = 0; i < antall; i++) {
			System.out.print(c);
		}
		System.out.println();
	}

	public static void passandeOverskrift() {
		Out skjerm = new Out();
		skjerm.outln("LØNNSOVERSIKT", 88, Out.CENTER);
		linje('*');
	}

	public static void tabellOverskrift() {
		final int b1 = 15;
		final int b2 = 12;

		Out ut = new Out();

		ut.out("Ansatte: ", b1, Out.LEFT);
		ut.out("Timer: ", b2, Out.RIGHT);
		ut.out("Timesats: ", b2, Out.RIGHT);
		ut.out("Overtid: ", b2, Out.RIGHT);
		ut.out("Brutto: ", b2, Out.RIGHT);
		ut.out("Skatt: ", b2, Out.RIGHT);
		ut.outln("Netto: ", b2, Out.RIGHT);
		linje('-');
	}

	public void lesArbeidtakar() {
		Scanner tast = new Scanner(System.in);
		System.out.print("Ansatt: ");
		setNamn(tast.nextLine());
		System.out.print("Timesats: ");
		setTimelon(tast.nextDouble());
		System.out.print("Antal Timar: ");
		setAntalTimar(tast.nextDouble());
		System.out.print("Skatteprosent: ");
		setSkatteprosent(tast.nextInt());
		System.out.println();
//		tast.close();
	} // metode
} // class
