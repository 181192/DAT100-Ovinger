package no.hib.dat100.Oppgave_6;

public class Student extends Person {
	private int studentnummer;
	private String klasse;

	public Student() {
		super("", "", 0, null);
		studentnummer = 0;
		klasse = "";
	}

	/**
	 * Konstrukt�r for student.
	 * 
	 * @param etternamn
	 *            Etternamn p� student
	 * @param fornamn
	 *            Fornamn p� student
	 * @param f�dsels�r
	 *            F�dsels�r p� student
	 * @param kj�nn
	 *            Kj�nn p� student
	 * @param studentnummer
	 *            Studentnummer
	 * @param klasse
	 *            Klasse
	 */
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

	/**
	 * Skriver ut data om en student: Etternamn, fornamn, f�dsels�r, kj�nn,
	 * studentnummer og klasse.
	 */
	public String skrivData() {
		return super.skrivData() + "\t Studentnummer: " + studentnummer + "\t Klasse: " + klasse;
	}
	
	/**
	 * Returnerer html-kode med info om student
	 */
	public String tilHTML() {
		return "<html><ul><li>" + super.getEtternamn() + " " + super.getFornamn() + "</li><li>" + super.getKj�nn() + " "
				+ super.getF�dsels�r() + "</li><li>" + studentnummer + " " + klasse + "</li></ul></html>";
	}

}
