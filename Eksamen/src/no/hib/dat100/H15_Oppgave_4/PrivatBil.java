package no.hib.dat100.H15_Oppgave_4;

public class PrivatBil extends Kjoretoy {
	private int fodselsnummer;

	public PrivatBil(String regnr, int saldo, int fodselnr) {
		super(regnr, saldo);
		this.fodselsnummer = fodselnr;
	}

	public int getFodselsnummer() {
		return fodselsnummer;
	}

	public void setFodselsnummer(int fodselsnummer) {
		this.fodselsnummer = fodselsnummer;
	}

	@Override
	public boolean passer() {
		int belop = 25;
		super.setSaldo(super.getSaldo() - belop);
		return (this.getSaldo() >= 0);
	}

}
