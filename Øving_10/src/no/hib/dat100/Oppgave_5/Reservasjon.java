package no.hib.dat100.Oppgave_5;

public class Reservasjon {
	private int romnummer;
	private int startTid;
	private int sluttTid;
	private int reservasjonsnummer;
	private Person person;

	public Reservasjon(int romnr, int start, int slutt, int resnr, Person p) {
		this.romnummer = romnr;
		this.startTid = start;
		this.sluttTid = slutt;
		this.reservasjonsnummer = resnr;
		this.person = p;
	}

	public int getRomnummer() {
		return romnummer;
	}

	public void setRomnummer(int romnummer) {
		this.romnummer = romnummer;
	}

	public int getStartTid() {
		return startTid;
	}

	public void setStartTid(int startTid) {
		this.startTid = startTid;
	}

	public int getSluttTid() {
		return sluttTid;
	}

	public void setSluttTid(int sluttTid) {
		this.sluttTid = sluttTid;
	}

	public int getReservasjonsnummer() {
		return reservasjonsnummer;
	}

	public void setReservasjonsnummer(int reservasjonsnummer) {
		this.reservasjonsnummer = reservasjonsnummer;
	}

	public Person getP() {
		return person;
	}

	public void setP(Person p) {
		this.person = p;
	}
	
	

} // klasse
