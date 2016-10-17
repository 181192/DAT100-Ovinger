package no.hib.dat100.Oving_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import easyIO.In;

public class Oppgave_2 {
	private static int antall = 0;

	public static void main(String[] args) {
		String linje = "******************************";
		System.out.println(linje);
		System.out.println("* En haug med ord i en fil:  *");
		System.out.println(linje);
		String[] words = readArray("test.txt");

		for (int i = 1; i < words.length; i++) {
			System.out.printf("%s %-26s %s %n", "*", words[i], "*");
		}
		/* System.out.println(Arrays.toString(words)); */
		/* Printe ut array for å skjekke fil */
		System.out.printf("%s%n", linje);

		System.out.printf("%-2s%-27s%s%n", "*", "Skriv inn ett mønster:", "*");
		System.out.printf("%s%n", linje);
		Scanner s3 = new Scanner(System.in);

		In tastatur = new In(); // funksjon for skrive inn string
		String faen = tastatur.inLine(); // string for å skrive inn ord'
		s3.close();

		int ant = 0;
		for (int ord = 0; ord < antall + 1; ord++) { //
			if (words[ord].contains(faen)) {
				ant++;
			}
		}
		System.out.printf("%s%n", linje);
		System.out.printf("%-2s%-26s%s%n", "*", "Antall ord som inneholder: ", "*");
		System.out.printf("%s%s%s%-21s%s%n", "* ", faen, " er: ", ant, "*");
		System.out.printf("%s%n", linje);

		skrivUtmidten(words);
		System.out.printf("%s%n", linje);
	} // slutt main

	// Regel: Det er kun ett ord per linje
	public static String[] readArray(String file) {

		// Del 1:
		// Telle hvor mange linjer det er i filen
		// Del 2:
		// Opprette en array og kopiere elementene fra filen inn i array'en
		In text = new In("test.txt");
		antall = text.inInt();

		try {

			String[] words = new String[antall + 1];

			Scanner s2 = new Scanner(new File(file));

			for (int i = 0; i <= antall; i++) {
				words[i] = s2.nextLine();
			}
			s2.close();
			return words;

		} catch (FileNotFoundException e) {
			System.out.println("fil ikke funnet");
		}

		return null;
	}

	public static void skrivUtmidten(String[] words) {
		for (int k = 1; k < antall + 1; k++) {
			// skriver ut hele ordet om lengden er 1.
			int lengde = words[k].length();
			if (lengde == 1) {

				System.out.println(words[k]);
			} else if ((lengde % 2) == 0) {
				// skriver ut partall
				System.out.print(words[k].charAt((lengde / 2) - 1));
				System.out.println(words[k].charAt(lengde / 2));
			} // partall
			else if ((lengde % 2) != 0 && lengde >= 3) {
				// skriver ut oddetall
				System.out.print(words[k].charAt(lengde % 2));
				System.out.print(words[k].charAt(lengde % 2 + 1));
				System.out.println(words[k].charAt(lengde % 2 + 2));
			}
		}
	}

}
