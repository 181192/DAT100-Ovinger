package no.hib.dat100.Oppgave_5;

public class Main {

	public static void main(String[] args) {
		Reservasjonssystem rs = new Reservasjonssystem();
		Person[] p = new Person[] { new Person("per@epost.no", "per"), new Person("petter@epost.no", "petter") };

		rs.opprettMidlertidig(102, 1, 2, 1000, 2, p[0]);
		rs.opprettPermanent(102, 2, 3, 1001, BordogStoler.REKKE, p[1]);
		
		System.out.println(p[0].skrivData());
		

	}

}
