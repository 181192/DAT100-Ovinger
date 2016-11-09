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
	 * Konstruktør for student.
	 * 
	 * @param etternamn
	 *            Etternamn på student
	 * @param fornamn
	 *            Fornamn på student
	 * @param fødselsår
	 *            Fødselsår på student
	 * @param kjønn
	 *            Kjønn på student
	 * @param studentnummer
	 *            Studentnummer
	 * @param klasse
	 *            Klasse
	 */
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

	/**
	 * Skriver ut data om en student: Etternamn, fornamn, fødselsår, kjønn,
	 * studentnummer og klasse.
	 */
	public String skrivData() {
		return super.skrivData() + "\t Studentnummer: " + studentnummer + "\t Klasse: " + klasse;
	}
	
	/**
	 * Returnerer html-kode med info om student
	 */
	public String tilHTML() {
		return "<html><ul><li>" + super.getEtternamn() + " " + super.getFornamn() + "</li><li>" + super.getKjønn() + " "
				+ super.getFødselsår() + "</li><li>" + studentnummer + " " + klasse + "</li></ul></html>";
	}

}
