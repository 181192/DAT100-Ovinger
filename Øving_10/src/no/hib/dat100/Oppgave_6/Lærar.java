package no.hib.dat100.Oppgave_6;

public class Lærar extends Person {
	private int månadsløn;
	private int kontornummer;

	public Lærar() {
		super("", "", 0, null);
		månadsløn = 0;
		kontornummer = 0;
	}

	/**
	 * 
	 * @param etternamn
	 *            Etternamn på lærer
	 * @param fornamn
	 *            Fornamn på lærer
	 * @param fødselsår
	 *            Fødselsår til lærer
	 * @param kjønn
	 *            Kjønn på lærer
	 * @param månadsløn
	 *            Månadsløn til lærer, etc 20000
	 * @param kontornummer
	 *            Kontornummer til lærer, etc 503
	 */
	public Lærar(String etternamn, String fornamn, int fødselsår, Kjønn kjønn, int månadsløn, int kontornummer) {
		super(etternamn, fornamn, fødselsår, kjønn);
		this.månadsløn = månadsløn;
		this.kontornummer = kontornummer;
	}

	public int getMånadsløn() {
		return månadsløn;
	}

	public void setMånadsløn(int månadsløn) {
		this.månadsløn = månadsløn;
	}

	public int getKontornummer() {
		return kontornummer;
	}

	public void setKontornummer(int kontornummer) {
		this.kontornummer = kontornummer;
	}

	/**
	 * Skriver ut data om en lærar: Etternamn, fornamn, fødselsår, kjønn,
	 * månadsløn og kontornummer.
	 */
	public String skrivData() {
		return super.skrivData() + "\t Månadsløn: " + månadsløn + "\t Kontornummer: " + kontornummer;

	}

	public String tilHTML() {
		return "<html><ul><li>" + super.getEtternamn() + " " + super.getFornamn() + "</li><li>" + super.getKjønn() + " "
				+ super.getFødselsår() + "</li><li>" + månadsløn + " " + kontornummer + "</li></ul></html>";
	}

}
