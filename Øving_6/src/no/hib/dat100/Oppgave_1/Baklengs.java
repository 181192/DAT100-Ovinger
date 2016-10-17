package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

/* 
 * Oppgave: 
 * Lag ein metode som skriv ut ein streng baklengs.
 */

/* Skrive inn ett ord */
public class Baklengs {
	public static String fyllInn(Scanner tastatur) {
		System.out.println("Oppgave a) Baklengs:");
		System.out.print("Skriv inn: ");
		String s = tastatur.next();

		return s;
	} // Metode

	/* Skriver ut ordet tegn for tegn, men baklengs */
	public static void Resultat(String ord) {
		System.out.print("Svar: ");
		int lengde = ord.length();

		for (int i = lengde - 1; i >= 0; i--) {
			char resultat = ord.charAt(i);
			System.out.print(resultat);
		} // for
	} // Metode
} // Klasse Baklengs