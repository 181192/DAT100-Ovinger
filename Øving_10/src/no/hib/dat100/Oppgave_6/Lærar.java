package no.hib.dat100.Oppgave_6;

public class Lærar extends Person {
	private int månadsløn;
	private int kontornummer;

	public Lærar() {
		super("", "", 0, null);
		månadsløn = 0;
		kontornummer = 0;
	}

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

	public String skrivData() {
		return "Etternamn: " + super.getEtternamn() + "\t Fornamn: " + super.getFornamn() + "\t Fødselsår: "
				+ super.getFødselsår() + "\t Kjønn: " + super.getKjønn() + "\t Månadsløn: " + månadsløn + "\t Kontornummer: "
				+ kontornummer;

	}

}
