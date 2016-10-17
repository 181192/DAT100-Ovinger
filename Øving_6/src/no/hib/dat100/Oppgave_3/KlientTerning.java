package no.hib.dat100.Oppgave_3;

public class KlientTerning {

	public static void main(String[] args) {
		
		Terning t = new Terning(); // Opprette objekt
		t.fancyUtskrift(); // Tittel på oppgave
		t.kastTerning(); // Kaste terning
		t.antallKast(); // Antall hvor mange kast
		t.kastRes(); // Resultat av hvor mange av hver sort
		t.gjennomsnittVerdi(); // Gjennomsnittsverdi
		t.førsteSekser(); //Antall last for å få første 6'er
		t.flestVerdi(); // Terningverdi det var flest av
	}

}
