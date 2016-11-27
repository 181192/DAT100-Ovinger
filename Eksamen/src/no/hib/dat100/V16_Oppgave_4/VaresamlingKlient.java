package no.hib.dat100.V16_Oppgave_4;

import java.util.Scanner;

public class VaresamlingKlient {
	public static void main(String[] args) {
		Varesamling vs = new Varesamling(1000);

		Vare v1 = new Vare("lettmelk", 3230, 15);
		Vare v2 = new Vare("brød", 3232, 20);
		vs.leggTil(v1);
		vs.leggTil(v2);

		Scanner tast = new Scanner(System.in);

		do {
			System.out.print("Tast varenummer: ");
			int varenr = tast.nextInt();
			System.out.print("Tast antall: ");
			int antall = tast.nextInt();
			if (vs.finnVare(varenr) == null) {
				System.out.println("Ukjent varenummer. ");
			} else {
				System.out.println(antall + " " + vs.finnVare(varenr).getNavn() + " " + vs.finnVare(varenr).getPris() * antall);
			}
		} while (tast.nextInt() != 0);

		tast.close();

	}
	
}
