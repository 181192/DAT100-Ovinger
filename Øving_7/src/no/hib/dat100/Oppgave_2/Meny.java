package no.hib.dat100.Oppgave_2;

import java.util.Scanner;

public class Meny extends Lonnskjoring {
	public static void meny() {
		/* Opprette en tabell for ansatte, med firmanamn og antall plasser */
		Lonnskjoring lk = new Lonnskjoring("kiwi", 10);
		
		/* Oppretter ansatte */
		Arbeidstaker a1 = new Arbeidstaker("Ole", "Mannen", 180, 60, 19);
		Arbeidstaker a2 = new Arbeidstaker("Per", "Olsen", 255, 30, 27);
		Arbeidstaker a3 = new Arbeidstaker("Anna", "Andresen", 160, 44, 17);
		Arbeidstaker a4 = new Arbeidstaker("Ida", "Gundersen", 127, 37.5, 22);
		Arbeidstaker a5	= new Arbeidstaker("Jens", "Jensemann", 285, 55, 30);
		
		/* Skriver ut firmanamn, og legger til ansatte i Lonnskjoring tabell */		
		lk.lesArbeidstakarar(a1);
		lk.lesArbeidstakarar(a2);
		lk.lesArbeidstakarar(a3);
		lk.lesArbeidstakarar(a4);
		lk.lesArbeidstakarar(a5);

		String meny = "1- Personsøk fornamn, etternamn eller fulltnamn\n" + "2- Avslutt\n" + "\nValg: ";

		Scanner tast = new Scanner(System.in);
		String valg = "0";
		do {
			System.out.print(meny);
			valg = tast.next();
			switch (valg) {
			case "1":
				System.out.println();
				lk.finnOgSkrivPerson();
				System.out.println();
				break;
			case "2":
				break;
			default:
				System.out.println("\nUkjent menyvalg\n");
			}
		} while (!valg.equals("2")); // do-while
		tast.close();

	}
}
