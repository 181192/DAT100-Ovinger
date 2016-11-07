package no.hib.dat100.Oppgave_1;

public class Juletre implements Tegnbar {

	/**
	 * @author Kristoffer-Andre Kalliainen
	 * @version V.0.1.0
	 * 
	 */

	/**
	 * Printer ut stjerner.
	 * 
	 * @param b
	 *            Bredde
	 * @param h
	 *            Høyde
	 * @param t
	 *            Linjeskift
	 */

	public void skrivStjerne(int b, int h, boolean t) {
//		String s = "*";
//		for (int i = 0; i < h; i++) {
//			System.out.print(s);
//			for (int j = 0; j < b; j++) {
//				System.out.print(s);
//			}
//			if (t) {
//				System.out.println();
//			}
//		}
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * Tegner opp juletre
	 */

	@Override
	public String tegnOpp() {
		return null;

	}

}
