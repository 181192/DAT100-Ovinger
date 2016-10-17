package no.hib.dat100.Oppgave_4;

public class KlientVarelager {
	public static void main(String[] args) {
		/* Oppretter varelager */
		Varelager vl = new Varelager(10);
		
		/* Oppretter varer */
		Vare v1 = new Vare(1, "Ost", 79.90);
		Vare v2 = new Vare(2, "Melk", 13.90);
		Vare v3 = new Vare(3, "Brød", 24.90);
		Vare v4 = new Vare(4, "Kjøtt", 89.90);
		Vare v5 = new Vare(5, "Egg", 40.49);
		
		/* Legger til varene i varelageret */
		vl.leggTil(v1);
		vl.leggTil(v2);
		vl.leggTil(v3);
		vl.leggTil(v4);
		vl.leggTil(v5);
		
		/* Viser alle varene i varelageret og regner totalpris*/
		vl.pynt();
		vl.visAlle();
		vl.totalPris();
		
		
		/* Sletter to varer og skriver ut vare lageret og regner ny totalpris */
		vl.pynt();
		vl.slett(1);
		vl.slett(5);
		vl.visAlle();
		vl.totalPris();
		

	}
}
