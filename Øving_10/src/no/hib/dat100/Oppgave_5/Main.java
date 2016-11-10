package no.hib.dat100.Oppgave_5;

import java.util.Date;

import easyIO.In;
import easyIO.Out;

public class Main {

	public static void main(String[] args) {
		Reservasjonssystem rs = new Reservasjonssystem();
		Person p = new Person("per@epost.no", "per");
		Person p1 = new Person("petter@epost.no", "petter");
		
		Out skjerm = new Out();
		In tast = new In();

		String meny = "\n" + "1 - Opprett midlertidig reservasjon\n" + "2 - Opprett permanent reservasjon\n"
				+ "3 - Finn reservasjon\n" + "4 - List reservasjoner\n" + "5 - Endre reservasjon\n" + "6 - Avslutt\n\n"
				+ "valg: ";
		int valg = 0;

		do {
			skjerm.out(meny);
			valg = tast.inInt();		

			switch (valg) {
			case 1: // Opprett midlertidig reservasjon
				System.out.println("Skriv inn romnr, starttid, sluttid, reservasjonsnummer, navn og epost: ");
				int romnr = tast.inInt();
				Date start = Reservasjonssystem.settTid(tast.inInt());
				Date slutt = Reservasjonssystem.settTid(tast.inInt());
				int resnr = tast.inInt();
				Person person = Person.opprettPerson(tast.inWord(), tast.inWord());
				rs.opprettMidlertidig(romnr, start, slutt, resnr, person);
			
				break;
			case 2: // Opprett permanent reservasjon
				System.out.println("Skriv inn romnr, starttid, sluttid, reservasjonsnummer, innredning, navn og epost: ");
				int romnr1 = tast.inInt();
				Date start1 = Reservasjonssystem.settTid(tast.inInt());
				Date slutt1 = Reservasjonssystem.settTid(tast.inInt());
				int resnr1 = tast.inInt();
				
				Person person1 = Person.opprettPerson(tast.inWord(), tast.inWord());
//				rs.opprettPermanent(romnr1, start1, slutt1, resnr1, info, person1);
				break;
			case 3: // Finn reservasjoner
				Person finnNavn;
				rs.finnReservasjon(person2);
				break;
			case 4: // List reservasjoner
//				Rom r = tast.inWord();
//				rs.visReservasjon(r);
				break;
			case 5: // Endre reservasjoner
				System.out.println("Funksjonen er ikke implimentert");
				break;
			case 6: // avslutt
				break;
			default:
				skjerm.outln("Ukjent menyvalg");
			}
		} while (valg != 6);
		skjerm.close();
		tast.close();
	}

}
