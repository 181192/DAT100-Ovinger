package no.hib.dat100.Oppgave_6;

public class Person {
	private String etternamn;
	private String fornamn;
	private int fødselsår;
	private Kjønn kjønn;

	public Person() {
		etternamn = "";
		fornamn = "";
		fødselsår = 0;
		kjønn = null;
	}

	/**
	 * 
	 * @param etternamn
	 *            Etternamn til person
	 * @param fornamn
	 *            Fornamn til person
	 * @param fødselsår
	 *            Fødselsår til person
	 * @param kjønn
	 *            Kjønn til person
	 */
	public Person(String etternamn, String fornamn, int fødselsår, Kjønn kjønn) {
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.fødselsår = fødselsår;
		this.kjønn = kjønn;
	}

	public String getEtternamn() {
		return etternamn;
	}

	public void setEtternamn(String etternamn) {
		this.etternamn = etternamn;
	}

	public String getFornamn() {
		return fornamn;
	}

	public void setFornamn(String fornamn) {
		this.fornamn = fornamn;
	}

	public int getFødselsår() {
		return fødselsår;
	}

	public void setFødselsår(int fødselsår) {
		this.fødselsår = fødselsår;
	}

	public Kjønn getKjønn() {
		return kjønn;
	}

	public void setKjønn(Kjønn kjønn) {
		this.kjønn = kjønn;
	}

	/**
	 * Skriver ut data om person
	 * 
	 * @return Etternamn, fornamn, fødselsår og kjønn
	 */
	public String skrivData() {
		return "Etternamn: " + etternamn + "\t Fornamn: " + fornamn + "\t Fødselsår: " + fødselsår + "\t Kjønn: "
				+ kjønn;
	}

	/**
	 * 
	 * @param p
	 *            Person objekt
	 * @return True om person er eldre en person "p"
	 */
	public boolean erEldreEnn(Person p) {
		return this.fødselsår < p.getFødselsår();
	}

	/**
	 * 
	 * @param p
	 *            Person objekt
	 * @return String om hvem som er eldst og alder i år.
	 */
	public String skrivEldste(Person[] p) {
		return "\nDen eldste personen er " + getFornamn() + " " + getEtternamn() + " på "
				+ (2016 - getFødselsår() + " år.");
	}
	
	/**
	 * Streng av html-kode
	 * @return returnerer ut data i html-kode
	 */
	public String tilHTML() {
		return "<html><ul><li>" + etternamn + " " + fornamn + "</li><li>" + kjønn + " " + fødselsår
				+ "</li></ul></html>";
	}

}
