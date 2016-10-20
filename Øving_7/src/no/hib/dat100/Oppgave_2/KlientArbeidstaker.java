package no.hib.dat100.Oppgave_2;

public class KlientArbeidstaker {
	public static void main(String[] args) {
		String linje = "***************************************";
		Arbeidstaker.passandeOverskrift();
		
		Arbeidstaker a1 = new Arbeidstaker("Ola","Olsen", 180, 60, 19);		
		Arbeidstaker.tabellOverskrift();
		a1.finnOvertidsTimar();
		a1.finnBruttolon();
		a1.finnSkatt();
		a1.finnNettolon();		
		a1.skrivUt();
		
		Arbeidstaker a2 = new Arbeidstaker();
		System.out.println();
		System.out.println(linje + " FYLL INN " + linje);
		a2.leggTil();
		Arbeidstaker.tabellOverskrift();
		a2.finnOvertidsTimar();
		a2.finnBruttolon();
		a2.finnSkatt();
		a2.finnNettolon();		
		a2.skrivUt();
	}

}
