package no.hib.dat100.Oppgave_6;

public class Student extends Person {
	private int studentnummer;
	private String klasse;

	public Student() {
		studentnummer = 0;
		klasse = "";
	}

	public Student(String etternamn, String fornamn, int f�dsels�r, Kj�nn kj�nn, int studentnummer, String klasse) {
		super(etternamn, fornamn, f�dsels�r, kj�nn);
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
		return "Etternamn: " + super.getEtternamn() + "\t Fornamn: " + super.getFornamn() + "\t F�dsels�r: "
				+ super.getF�dsels�r() + "\t Kj�nn: " + super.getKj�nn() + "\t Studentnummer: " + studentnummer
				+ "\t Klasse: " + klasse;
	}

}
