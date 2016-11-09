package no.hib.dat100.Oppgave_6;

public class L�rar extends Person {
	private int m�nadsl�n;
	private int kontornummer;

	public L�rar() {
		super("", "", 0, null);
		m�nadsl�n = 0;
		kontornummer = 0;
	}

	/**
	 * 
	 * @param etternamn
	 *            Etternamn p� l�rer
	 * @param fornamn
	 *            Fornamn p� l�rer
	 * @param f�dsels�r
	 *            F�dsels�r til l�rer
	 * @param kj�nn
	 *            Kj�nn p� l�rer
	 * @param m�nadsl�n
	 *            M�nadsl�n til l�rer, etc 20000
	 * @param kontornummer
	 *            Kontornummer til l�rer, etc 503
	 */
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

	/**
	 * Skriver ut data om en l�rar: Etternamn, fornamn, f�dsels�r, kj�nn,
	 * m�nadsl�n og kontornummer.
	 */
	public String skrivData() {
		return super.skrivData() + "\t M�nadsl�n: " + m�nadsl�n + "\t Kontornummer: " + kontornummer;

	}

	public String tilHTML() {
		return "<html><ul><li>" + super.getEtternamn() + " " + super.getFornamn() + "</li><li>" + super.getKj�nn() + " "
				+ super.getF�dsels�r() + "</li><li>" + m�nadsl�n + " " + kontornummer + "</li></ul></html>";
	}

}
