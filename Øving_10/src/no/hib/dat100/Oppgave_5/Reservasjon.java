package no.hib.dat100.Oppgave_5;

import java.util.Date;

public class Reservasjon {
	private int romnummer;
	private Date startTid;
	private Date sluttTid;
	private int reservasjonsnummer;
	private Person person;

	public Reservasjon(int romnr, Date start, Date slutt, int resnr, Person p) {
		this.romnummer = romnr;
		startTid = start;
		sluttTid = slutt;
		this.reservasjonsnummer = resnr;
		this.person = p;
	}

	public int getRomnummer() {
		return romnummer;
	}

	public void setRomnummer(int romnummer) {
		this.romnummer = romnummer;
	}

	public Date getStartTid() {
		return startTid;
	}

	public void setStartTid(Date startTid) {
		this.startTid = startTid;
	}

	public Date getSluttTid() {
		return sluttTid;
	}

	public void setSluttTid(Date sluttTid) {
		this.sluttTid = sluttTid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
