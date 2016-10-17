package no.hib.dat100.Oppgave_4;

import java.util.Scanner;

public class Rektangel {
	private static int høyde;
	private static int bredde;
	private static int areal;
	private static char fyll = '*';

	public static void skrivInn() { // skriv inn bredde og høyde
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Angi høyde og bredde: ");
		høyde = tastatur.nextInt();
		bredde = tastatur.nextInt();
		tastatur.close();
	}

	public static int regnAreal() { // regn ut areal
		areal = høyde * bredde;
		return areal;
	}

	public static void printAreal() { // skriv ut areal, samt høyde og bredde
		System.out.println("Arealet er: " + regnAreal());
	}

	public static void fyllAreal() { // skriv areal ut med variabelen fyll
		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print(fyll + " ");
			}
			System.out.print("\n");
		}
	}
}
