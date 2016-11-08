package no.hib.dat100.Oppgave_6;

public class Student extends Person {
	private int studentnummer;
	private String klasse;

	public Student() {
		studentnummer = 0;
		klasse = "";
	}

	public Student(String etternamn, String fornamn, int fødselsår, Kjønn kjønn, int studentnummer, String klasse) {
		super(etternamn, fornamn, fødselsår, kjønn);
		this.studentnummer = studentnummer;
		this.klasse = klasse;
	}

	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public String skrivData() {
		return "Etternamn: " + super.getEtternamn() + "\t Fornamn: " + super.getFornamn() + "\t Fødselsår: "
				+ super.getFødselsår() + "\t Kjønn: " + super.getKjønn() + "\t Studentnummer: " + studentnummer
				+ "\t Klasse: " + klasse;
	}

}
