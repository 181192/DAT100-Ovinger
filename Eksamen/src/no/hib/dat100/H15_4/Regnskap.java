package no.hib.dat100.H15_4;

public class Regnskap {
	public static void main(String[] args) {

	}

	public static int total(Kjoretoy[] kjoretoy) {
		int total = 0;

		for (Kjoretoy k : kjoretoy) {
			int saldo = k.getSaldo();

			if (saldo < 0) {
				total += saldo;
			}
		}
		return total;
	}
}
