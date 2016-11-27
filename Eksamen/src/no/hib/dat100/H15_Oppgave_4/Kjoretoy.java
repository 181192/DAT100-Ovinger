package no.hib.dat100.H15_Oppgave_4;

public abstract class Kjoretoy {
	private String regnr;
	private int saldo;

	public Kjoretoy(String regnr, int saldo) {
		this.regnr = regnr;
		this.saldo = saldo;
	}

	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void betal(int belop) {
		saldo += belop;
	}

	public abstract boolean passer();

}
