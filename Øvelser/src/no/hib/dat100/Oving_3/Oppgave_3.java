package no.hib.dat100.Oving_3;

import java.util.Scanner;

public class Oppgave_3 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Skriv en x verdi: ");
		double x = tastatur.nextInt();

		System.out.print("Skriv inn en n verdi: ");
		double n = tastatur.nextInt();
		tastatur.close();

		System.out.printf("%n%s %.2f %s %.2f %s %.2f %n", 
				"x-verdien", x, "med potensen", n, "=", Math.pow(x, n));
		

		double resultat = 1;

		/*
		 * "i" vil skjekke opp mot nverdi, og gange "x" med resultat til i er
		 * det samme som "n" resultat vil få ny verdi for hver gang løkken
		 * kjører. en simulerer da x ganger med seg selv n-ganger.
		 */
		for (int i = 1; i <= n; i++) {
			resultat = resultat * x;
		}
		System.out.printf("%n%s%n%s %.2f %s %.2f %s %.2f", "Uten Math.pow:", "x-verdien", x, "med potensen", n, "=",
				resultat);
	}
}
