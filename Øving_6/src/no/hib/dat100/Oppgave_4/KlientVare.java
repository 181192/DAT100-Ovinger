package no.hib.dat100.Oppgave_4;

public class KlientVare {

	public static void main(String[] args) {
		Vare v1 = new Vare(1, "Ost", 79.90); // Opprette objektet v1
		v1.skriv(); // Skrive ut resultatene

		Vare v2 = new Vare(2, "Melk", 16.95);
		v2.skriv();
		
		// Sammenligne varer
		v1.billigereEnn(v2);
	}

}

