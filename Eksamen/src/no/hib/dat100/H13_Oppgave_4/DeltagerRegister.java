package no.hib.dat100.H13_Oppgave_4;

import java.util.HashMap;

import easyIO.In;

public class DeltagerRegister {
	public static void main(String[] args) {
		HashMap<String, Deltaker> deltakere = new HashMap<String, Deltaker>();
		Deltaker deltaker = null;
		Tur tur;
		Dato dato;
		String meny = "Meny\n" + "1: Registrer deltaker\n" + "2: Registrere tur for deltaker\n" + "9: Avslutt\n"
				+ "Valg? ";
		In tast = new In();
		String valg = "";
		do {
			System.out.print(meny);
			valg = tast.inWord();
			switch (valg) {
			case "1":
				System.out.print("Oppgi navn på deltaker: ");
				String navn = tast.inWord();
				System.out.println();
				deltaker =  new Deltaker(navn);
				deltakere.put(navn, deltaker);
				break;
			case "2":
				System.out.print("Oppgi deltaker: ");
				String navn1 = tast.inWord();
				deltakere.get(navn1);
				System.out.print("Oppgi tur kode: ");
				int kode = tast.inInt();
				System.out.print("Oppgi dag: ");
				int dag = tast.inInt();
				System.out.print("Oppgi mnd: ");
				int mnd = tast.inInt();
				System.out.print("Oppgi aar: ");
				int aar = tast.inInt();
				dato = new Dato(dag, mnd, aar);
				tur = new Tur(dato, kode);
				deltaker.leggTil(tur);
				break;
			case "9":
				break;
			default:
				System.out.println("Ukjent valg");
			}
		} while (valg != "9");
	}
}
