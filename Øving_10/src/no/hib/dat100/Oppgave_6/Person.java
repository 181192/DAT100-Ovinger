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

	public String skrivData() {
		return "Etternamn: " + etternamn + "\t Fornamn: " + fornamn + "\t F�dsels�r: " + f�dsels�r + "\t Kj�nn: " + kj�nn;
	}

}
