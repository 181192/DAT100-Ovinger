package no.hib.dat100.Oppgave_5;

import java.util.Date;

public class PermanentReservasjon extends Reservasjon {
	private BordogStoler info;
	
	public PermanentReservasjon(int romnr, Date start, Date slutt, int resnr, BordogStoler info, Person p) {
		super(romnr, start, slutt, resnr, p);
		this.info = info;
	}

	public BordogStoler getInfo() {
		return info;
	}

	public void setInfo(BordogStoler info) {
		this.info = info;
	}
} // klasse
