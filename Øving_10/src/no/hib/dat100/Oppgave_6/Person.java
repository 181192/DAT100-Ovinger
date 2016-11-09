package no.hib.dat100.Oppgave_6;

public class Person {
	private String etternamn;
	private String fornamn;
	private int f�dsels�r;
	private Kj�nn kj�nn;

	public Person() {
		etternamn = "";
		fornamn = "";
		f�dsels�r = 0;
		kj�nn = null;
	}

	/**
	 * 
	 * @param etternamn
	 *            Etternamn til person
	 * @param fornamn
	 *            Fornamn til person
	 * @param f�dsels�r
	 *            F�dsels�r til person
	 * @param kj�nn
	 *            Kj�nn til person
	 */
	public Person(String etternamn, String fornamn, int f�dsels�r, Kj�nn kj�nn) {
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.f�dsels�r = f�dsels�r;
		this.kj�nn = kj�nn;
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

	public int getF�dsels�r() {
		return f�dsels�r;
	}

	public void setF�dsels�r(int f�dsels�r) {
		this.f�dsels�r = f�dsels�r;
	}

	public Kj�nn getKj�nn() {
		return kj�nn;
	}

	public void setKj�nn(Kj�nn kj�nn) {
		this.kj�nn = kj�nn;
	}

	/**
	 * Skriver ut data om person
	 * 
	 * @return Etternamn, fornamn, f�dsels�r og kj�nn
	 */
	public String skrivData() {
		return "Etternamn: " + etternamn + "\t Fornamn: " + fornamn + "\t F�dsels�r: " + f�dsels�r + "\t Kj�nn: "
				+ kj�nn;
	}

	/**
	 * 
	 * @param p
	 *            Person objekt
	 * @return True om person er eldre en person "p"
	 */
	public boolean erEldreEnn(Person p) {
		return this.f�dsels�r < p.getF�dsels�r();
	}

	/**
	 * 
	 * @param p
	 *            Person objekt
	 * @return String om hvem som er eldst og alder i �r.
	 */
	public String skrivEldste(Person[] p) {
		return "\nDen eldste personen er " + getFornamn() + " " + getEtternamn() + " p� "
				+ (2016 - getF�dsels�r() + " �r.");
	}
	
	/**
	 * Streng av html-kode
	 * @return returnerer ut data i html-kode
	 */
	public String tilHTML() {
		return "<html><ul><li>" + etternamn + " " + fornamn + "</li><li>" + kj�nn + " " + f�dsels�r
				+ "</li></ul></html>";
	}

}
