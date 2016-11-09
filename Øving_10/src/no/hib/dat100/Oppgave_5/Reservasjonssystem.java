package no.hib.dat100.Oppgave_5;

public class Reservasjonssystem {
	public static void main(String[] args) {
		Person[] p	= new Person[] {
			new Person("epost", "Per"),
			new Person("epost1", "Ole")
		};
		
		Reservasjon[] res = new Reservasjon[] {
			new Reservasjon(202, 2, 3, 1001, p[1])
		};
		
		res[0].opprettMidlertidig(102, 1, 2, 1000, 2, p[0]);
		
		
	} // main
} // klasse
