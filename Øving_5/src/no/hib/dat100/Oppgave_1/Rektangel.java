package no.hib.dat100.Oppgave_1;

public class Rektangel {
	private int h�yde;
	private int bredde;
	private int areal;
	private int omkrets;
	private char fyll;

	public Rektangel() {
		h�yde = 0;
		bredde = 0;
		areal = 0;
		fyll = ' ';
	}

	public Rektangel(int h�yde, int bredde, char fyll) {
		this.h�yde = h�yde;
		this.bredde = bredde;
		this.fyll = fyll;
	}

	public int getH�yde() {
		return h�yde;
	}

	public void setH�yde(int h�yde) {
		this.h�yde = h�yde;
	}

	public int getBredde() {
		return bredde;
	}

	public void setBredde(int bredde) {
		this.bredde = bredde;
	}

	public int getOmkrets() {
		return omkrets;
	}

	public void setOmkrets(int omkrets) {
		this.omkrets = omkrets;
	}

	public int getAreal() {
		return areal;
	}

	public void setAreal(int areal) {
		this.areal = areal;
	}

	public char getFyll() {
		return fyll;
	}

	public void setFyll(char fyll) {
		this.fyll = fyll;
	}

	public int regnOmkrets() {
		omkrets = h�yde + h�yde + bredde + bredde;
		return omkrets;
	}

	public int regnAreal() { // regn ut areal
		areal = h�yde * bredde;
		return areal;
	}

	public void fyllAreal() { // skriv areal ut med variabelen fyll
		for (int i = 0; i < h�yde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print(fyll + " ");
			}
			System.out.print("\n");
		}
	}

	public void Resultat() {
		System.out.println("Bredden er: " + bredde);
		System.out.println("H�yden er: " + h�yde);
		System.out.println("\nArealet er: " + regnAreal());
		System.out.println("Omktretsen er: " + regnOmkrets() + "\n");
	}

}
