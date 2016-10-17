package no.hib.dat100.Oppgave_1;

public class Rektangel {
	private int høyde;
	private int bredde;
	private int areal;
	private int omkrets;
	private char fyll;

	public Rektangel() {
		høyde = 0;
		bredde = 0;
		areal = 0;
		fyll = ' ';
	}

	public Rektangel(int høyde, int bredde, char fyll) {
		this.høyde = høyde;
		this.bredde = bredde;
		this.fyll = fyll;
	}

	public int getHøyde() {
		return høyde;
	}

	public void setHøyde(int høyde) {
		this.høyde = høyde;
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
		omkrets = høyde + høyde + bredde + bredde;
		return omkrets;
	}

	public int regnAreal() { // regn ut areal
		areal = høyde * bredde;
		return areal;
	}

	public void fyllAreal() { // skriv areal ut med variabelen fyll
		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print(fyll + " ");
			}
			System.out.print("\n");
		}
	}

	public void Resultat() {
		System.out.println("Bredden er: " + bredde);
		System.out.println("Høyden er: " + høyde);
		System.out.println("\nArealet er: " + regnAreal());
		System.out.println("Omktretsen er: " + regnOmkrets() + "\n");
	}

}
