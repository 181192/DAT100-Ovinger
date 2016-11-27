package no.hib.dat100.V15_4;

public class FirmaBil extends Kjoretoy {
	private String orgnr;

	public FirmaBil(String regnr, int saldo, String orgnr) {
		super(regnr, saldo);
		this.orgnr = orgnr;
	}

	public String getOrgnr() {
		return orgnr;
	}

	public void setOrgnr(String orgnr) {
		this.orgnr = orgnr;
	}

	@Override
	public boolean passer() {
		int belop = 15;
		super.setSaldo(super.getSaldo() - belop);
		return (getSaldo() >= 0);
	}

}
