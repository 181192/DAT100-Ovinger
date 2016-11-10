package no.hib.dat100.Oppgave_5;

public class Person {
	private String epost;
	private String navn;

	public Person(String epost, String navn) {
		this.epost = epost;
		this.navn = navn;
	}

	public String getEpost() {
		return epost;
	}

	public void setEpost(String epost) {
		this.epost = epost;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String skrivData() {
		return "Navn: " + getNavn() + ", Epost: " + getEpost();
	}
	

} // klasse
