package no.hib.dat100.V16_3;

public class Kredittkort extends Betalingskort {
	private double kredittgrense;

	public Kredittkort(String navn, int aar, int mnd, double saldo, double kredittgrense) {
		super(navn, aar, mnd, saldo);
		this.kredittgrense = kredittgrense;
	}

	public double getKredittgrense() {
		return kredittgrense;
	}

	public void setKredittgrense(double kredittgrense) {
		this.kredittgrense = kredittgrense;
	}

	public boolean dekning(double belop) {
		boolean tilstand = false;
		if (belop <= getSaldo() + kredittgrense) {
			tilstand = true;
		}
		return tilstand;
	}
}
