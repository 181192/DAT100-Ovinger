package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		Baklengs.Resultat(Baklengs.fyllInn(tastatur));

		int[] tabell = Heltall.lesInn(tastatur);
		Heltall.erStigende(tabell);
		Heltall.skrivStigende();
		
		Unikode.lesString(tastatur);
		Unikode.skrivString();
		
		tastatur.close();
	
	} // Metode main
} // Klasse Mail
