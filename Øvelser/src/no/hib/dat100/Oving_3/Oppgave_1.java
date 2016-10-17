package no.hib.dat100.Oving_3;

import easyIO.In;

public class Oppgave_1 {

	public static void main(String[] args) {			
		//boolean gjenta = true;
		int i = 0;
		while(i < 3) { 						/* While løkke for å kjøre loop på hele programmet til gjenta = false */
			
		System.out.print("Skriv inn din poengsum: ");
		
		In tastatur = new In();
		int poengsum = tastatur.inInt();
		// tastatur.close();					/* må være deaktivert, ellers så åpner ikke programmet tastaturet på neste runde av loopen */
		
		char karakter = 0;						/* Definerer char slik at hver karakter defineres som en bokstav/verdi */
		boolean sumUnder = (poengsum < 0); 		/* true or false om poengsum er under 0, altså negativ */
		boolean sumOver = (poengsum > 100); 	/* true or false om poengsum er over 100 */
		
		
		
		switch (sumUnder + "-" + sumOver) {		/* boolean's som kan brukes som "case" variabel */
			case "true-false": 					/* Negativt tall */
				System.out.println("Verdien er ugyldig, negativ verdi");
				break;
			case "false-true":  				/* Over Hundre */
				System.out.println("Verdien er ugyldig, over 100 poeng");
				break;
			case "false-false":					/* Karakter skala */
			
				if (poengsum >= 90) {
					karakter = 'A';
				}
				else if (poengsum >= 80) {
					karakter = 'B';
				}
				else if (poengsum >= 60) {
					karakter = 'C';
				}		
				else if (poengsum >= 50) {
					karakter = 'D';
				}		
				else if (poengsum >= 40) {
					karakter = 'E';
				}
				else if (poengsum >= 0) {
					karakter = 'F';
				}
				i++;
				/* utskrift av karakter, se på variabelen karakter (en char verdi) */				
				System.out.println("Karakteren din er " + karakter);
				break;
			}							
		}			
	}
}
