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

	public String skrivData() {
		return "Etternamn: " + etternamn + "\t Fornamn: " + fornamn + "\t Fødselsår: " + fødselsår + "\t Kjønn: " + kjønn;
	}

}
