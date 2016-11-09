package no.hib.dat100.Oppgave_5;

public class MidlertidigReservasjon extends Reservasjon {
	private int sluttTid;

	public MidlertidigReservasjon(int romnr, int start, int slutt, int resnr, int sluttTid, Person p) {
		super(romnr, start, sluttTid, resnr, p);
		this.sluttTid = sluttTid;
	}

	public int getSluttTid() {
		return sluttTid;
	}

	public void setSluttTid(int sluttTid) {
		this.sluttTid = sluttTid;
	}

	public void slettReservasjon() {

	}

} // klasse
