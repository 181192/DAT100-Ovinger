package no.hib.dat100.Oppgave_3;

public class KinoKlient {
	public static void main(String[] args) {

		Kino kino = new Kino();
		System.out.println("Er setet ledig? " + kino.erLedig(1, 5));
		System.out.println("Antall ledige seter: " + kino.AntallLedige());
		kino.finnLedig();
	}

}
