package no.hib.dat100.Oppgave_2;

import java.util.Scanner;

public class Meny {
	public static void meny() {
		Lonnskjoring lk = new Lonnskjoring();

		String meny = "1- Personsøk fulltnamn\n" + "2- Personsøk fornamn eller etternamn\n" + "3- Avslutt\n" + "\nValg: ";

		Scanner tast = new Scanner(System.in);
		int valg = 0;
		do {
			System.out.print(meny);
			valg = tast.nextInt();
//			tast.close();
			switch (valg) {
			case 1:
				System.out.println();
				lk.finnOgSkrivPerson();
				System.out.println();
				break;
			case 2:
				System.out.println();				
				lk.finnOgSkrivPersonAvansert();
				System.out.println();
			case 3:
				break;
			default:
				System.out.println("\nUkjent menyvalg\n");
			}
		} while (valg != 3); // do-while
		

	}
}
