package no.hib.dat100.H12_Oppgave_4;

public class test {
	public static void main(String[] args) {
		System.out.println(tilMinutter(100));
		int[] tab = { 1, 2, 4, 12, 5 };
		int tidsgrense = 17;
		int p = 0;
		int v = 0;
		boolean funnet = false;
		for (int i = tab.length - 1; i >= 0 && !funnet; i--) {
			for (int k = 0; k < i && !funnet; k++) {
				int ik = tab[i] + tab[k];
				if (ik == tidsgrense) {
					System.out.println("i + k = " + tab[i] + " + " + tab[k]);
					funnet = true;

				} else if (ik < tidsgrense && ik >= p + v) {
					p = tab[i];
					v = tab[k];
				}
			}
		}
		if (!funnet) {
			System.out.println(p + " og " + v);
		}

	}

	public static double tilMinutter(double s) {
		double sekunder = (s % 60);
		int minutter = (int) s / 60;
		double total = minutter + sekunder / 100;
		return total;
	}
}
