package no.hib.dat100.Oppgave_1;

public class Juletre implements ITegnbar {

	/**
	 * @author Kristoffer-Andre Kalliainen
	 * @version V.0.1.0
	 * 
	 */

	/**
	 * Tegner opp juletre
	 */

	@Override
	public void tegnOpp() {
		int i;
		int j;
		int k;
		int hoyde = 5;
		for (i = 1; i <= hoyde; i++) {
			for (j = hoyde - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int m = 0; m < 2; m++) {
			for (int n = 0; n <= (2 * hoyde - 4); n++) {
				System.out.print(" ");
			}
			System.out.println("* *");
		}
		System.out.println();
	}
}
