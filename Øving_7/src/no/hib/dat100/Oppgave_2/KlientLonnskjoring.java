package no.hib.dat100.Oppgave_2;

public class KlientLonnskjoring {

	public static void main(String[] args) {
		Arbeidstaker.passandeOverskrift();

		/* Opprette en tabell for ansatte, med firmanamn og antall plasser */
		Lonnskjoring lk = new Lonnskjoring("firmanamn", 10);		

		/* Skriver inn og ut firmanamn, og legger til ansatte i Lonnskjoring tabell */		
		lk.skrivInnFirmaNamn();
		lk.skrivUtFirmaNamn();
				
		/* Oppretter ansatte */
		lk.registrerArbeidstakarar();		
		Arbeidstaker.tabellOverskrift();

		/* Skriver ut lønnsoversikt for de ansatte, 
		 * finner total overtid, brutto og høyeste brutto til ansatte */		
		lk.skrivLonsoversikt();
		Arbeidstaker.linje('-');
		System.out.println();
		lk.skrivTotalOversikt();
		Arbeidstaker.linje('-');

		/* Søk opp en ansatt i firmaet, og skriv ut informasjon om personen */
		lk.meny();
		
//		lk.finnOgSkrivPerson();

	}
}
