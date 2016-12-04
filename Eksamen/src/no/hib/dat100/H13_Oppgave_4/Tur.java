package no.hib.dat100.H13_Oppgave_4;

public class Tur {
	private Dato dato;
	private int kode;

	public Tur(Dato dato, int kode) {
		this.dato = dato;
		this.kode = kode;
	}

	public Dato getDato() {
		return dato;
	}

	public void setDato(Dato dato) {
		this.dato = dato;
	}

	public int getKode() {
		return kode;
	}

	public void setKode(int kode) {
		this.kode = kode;
	}
}
