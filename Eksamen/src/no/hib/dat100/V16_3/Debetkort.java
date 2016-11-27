package no.hib.dat100.V16_3;

public class Debetkort extends Betalingskort{
	
	public Debetkort(String navn, int aar, int mnd, double saldo) {
		super(navn, aar, mnd, saldo);
	}
	
	public boolean dekning(double belop) {
		boolean tilstand = false;
		if (super.getSaldo() >= belop) {
			tilstand = true;
		}
		return tilstand;
	}
}
