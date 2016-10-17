package no.hib.dat100.Oving_3;

import java.util.Scanner;

public class Oppgave_5 {
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		int uke = 8;
		double[] tabell = new double[uke];
		/*
		 * Lager arrayen "Tabell" med antall plasser "uke = 7"
		 */

		String linje = "************************";

		System.out.println("Analyse av temperaturer:");
		System.out.println(linje);
		System.out.println("Skriv inn temperaturene:");

		for (int i = 1; i < uke; i++) {
			/*
			 * Skriver inn så mange temperatur verdier som variabelen "uke" har
			 * angitt (7)
			 */
			System.out.print(i + ". Dag = ");
			tabell[i] = tastatur.nextDouble();
		}

		tastatur.close();
		/*
		 * Ferdig med innlesing
		 */
		System.out.println(linje);

		double maks = tabell[0];
		/*
		 * Sammenligner verdiene i tabellen, og henter ut max-temperatur
		 */
		for (int j = 1; j < tabell.length; j++) {
			if (tabell[j] > maks) {
				maks = tabell[j];
			}
		}
		System.out.println("Høyeste temperatur var: " + maks);

		double sum = 0;
		for (int k = 0; k < tabell.length; k++) {
			/*
			 * Summere arrayen, ved å lese en og en verdi og plusse på hverandre
			 */
			sum = sum + tabell[k];
		}
		double gjennomsnitt = sum / (uke - 1);
		/*
		 * Gjennomsnitt av temperatur
		 */
		System.out.printf("%s %.1f %s", "Gjennomsnittstemperaturen for uka var:", gjennomsnitt, "grader");

	}
}
