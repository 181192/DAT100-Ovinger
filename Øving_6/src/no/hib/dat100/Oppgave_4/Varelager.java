package no.hib.dat100.Oppgave_4;

public class Varelager {
	private int antall;
	private Vare[] vl;
	
	/* Standard konstruktør */
	public Varelager() {
		vl = new Vare[antall];
		antall = 0;
	} // konstruktør
	
	/* Konstruktør med parameter */
	public Varelager(int maksAntall) {
		vl = new Vare[maksAntall];
		this.antall = 0;
	} // konstrukør
	
	/* Legg til en vare */
	public void leggTil(Vare v) {
		vl[antall] = v;
		antall++;
	} // metode
	
	/* Viser alle varene som ligger i varelageret */
	public void visAlle() {
		for (int i = 0; i < antall; i++) {
			vl[i].skriv();
		} // for
	} // metode
	
	/* Regner totalprisen på alle varene, med å hente prisen fra klassen Vare */ 
	public void totalPris() {
		double sum = 0;
		for (int j = 0; j < antall; j++) {
			double totalpris = vl[j].getPris();
			sum += totalpris;
		} // for
		System.out.printf("%s%.2f%s%n", " Totalpris\t : ", sum, " kr");
	} // metode

	/*
	 * Metoden sletter en vare, visst metoden finner vare-nummeret i tabellen
	 * "Varelager"
	 */
	public Vare slett(int Varenr) {
		Vare resultat = null;
		int indeks = 0;
		boolean funnet = false;
		/*
		 * Hvis vare-nummeret ikke er funnet eller indeks ikke er større enn
		 * antall varer, skal while-løkken kjøre
		 */
		while (!funnet && indeks < antall) {

			/*
			 * Hvis vare nummer er det samme som en søker etter, skal antallet
			 * til tabellen fjerne antallet til tabellen med -1. I tillegg skal
			 * funnet = true, slik at varen er blitt funnet
			 */
			if (vl[indeks].getVarenr() == Varenr) {
				resultat = vl[indeks];
				vl[indeks] = vl[antall - 1];
				antall--;
				funnet = true;
			} // if
			/*
			 * Hvis varen ikke ble funnet må indeks økes med 1, til vi treffer
			 * indeks-verdien som inneholder varenummeret varen med varenummeret
			 * vi søker etter.
			 */
			indeks++;
		} // while
		/* Returner varen som vi slettet */
		return resultat;
	} // metode
	
	public void pynt() {
		String linje = "*****************************\n";
		System.out.println("\n\n\tVARELAGER");
		System.out.println(linje);
	}
} // class
