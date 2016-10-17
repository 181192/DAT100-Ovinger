package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

/* 
 * Lag ein metode som gitt ein tabell av tekststrengar, 
 * returnerer den strengen i tabellen som kjem først 
 * i (Unikode) alfabetet. 
 * Hint: sjå API dokumentasjon for String-klassen for 
 * metodar til samanlikning av strenger. 
 */

public class Unikode {
	private static String minste;

	public static String lesString(Scanner tastatur) {
		final int k = 5;
		String[] tabell = new String[k];
		System.out.println("\n" + "\n" + "Oppgave c)");
		System.out.println("Angi tabell: ");
		int i = 0;
		while (i < k) {
			tabell[i] = tastatur.next();
			i++;
		} // while-slutt
		
		
		minste = tabell[0];
		
		for (int j = 1; j < k; j++) {
			if (tabell[j].compareTo(minste) < 0) {
				minste = tabell[j];
			}
		}
		return minste;
	} // Metode lesInn
	public static void skrivString() {
		System.out.println(minste);
	}
	
	
}
