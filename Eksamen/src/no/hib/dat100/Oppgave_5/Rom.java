package no.hib.dat100.Oppgave_5;

public class Rom {
	private int nummer;
	private String navn;

	public Rom(int nummer, String navn) {
		super();
		this.nummer = nummer;
		this.navn = navn;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	@Override
	public String toString() {
		return "Nummer: " + nummer + ", navn: " + navn;
	}

}
