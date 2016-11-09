package no.hib.dat100.Oppgave_6;

public class L�rar extends Person {
	private int m�nadsl�n;
	private int kontornummer;

	public L�rar() {
		super("", "", 0, null);
		m�nadsl�n = 0;
		kontornummer = 0;
	}

	public L�rar(String etternamn, String fornamn, int f�dsels�r, Kj�nn kj�nn, int m�nadsl�n, int kontornummer) {
		super(etternamn, fornamn, f�dsels�r, kj�nn);
		this.m�nadsl�n = m�nadsl�n;
		this.kontornummer = kontornummer;
	}

	public int getM�nadsl�n() {
		return m�nadsl�n;
	}

	public void setM�nadsl�n(int m�nadsl�n) {
		this.m�nadsl�n = m�nadsl�n;
	}

	public int getKontornummer() {
		return kontornummer;
	}

	public void setKontornummer(int kontornummer) {
		this.kontornummer = kontornummer;
	}

	public String skrivData() {
		return "Etternamn: " + super.getEtternamn() + "\t Fornamn: " + super.getFornamn() + "\t F�dsels�r: "
				+ super.getF�dsels�r() + "\t Kj�nn: " + super.getKj�nn() + "\t M�nadsl�n: " + m�nadsl�n + "\t Kontornummer: "
				+ kontornummer;

	}

}
