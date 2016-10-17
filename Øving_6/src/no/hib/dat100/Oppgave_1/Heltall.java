package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

/* 
 * Lag ein metode for å avgjere om ein array (tabell) 
 * av heiltal er sortert stigande (dvs. at alle tal
 * skal vere større enn det forrige).
 */


public class Heltall {
	private static boolean stigende;

	/* Leser inn tabell */
	public static int[] lesInn(Scanner tastatur) {
		final int k = 5;
		int[] tallTabell = new int[k];
//		Scanner tastatur = new Scanner(System.in);
		System.out.println("\n" + "\n" + "Oppgave b)");
		System.out.println("Angi tabell: ");
		int i = 0;
		while (i < k) {
			tallTabell[i] = tastatur.nextInt();
			i++;
		} // while
		//tastatur.close();
		return tallTabell;
	} // Metode

	public static boolean erStigende(int[] tall) {	
		stigende = true;
		for (int i = 1; i < tall.length; i++) {
			if (tall[i] <= tall[i - 1]) {
				stigende = false;
			} // if
		} // for
		return stigende;
	} // Metode
	
	
	public static void skrivStigende(){
		System.out.println("Er tallene i stigende rekkefølge? " + stigende);
	} // Metode
} // Klasse Heltall
