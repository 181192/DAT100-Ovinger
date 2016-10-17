package no.hib.dat100.Oppgave_2;

import java.util.Arrays;

public class Tid {
	private static double[] tall;
	private static int STD = 1000000;

	public static double[] getTall() {
		return tall;
	} // get

	public static void setTall(double[] tall) {
		Tid.tall = tall;
	} // set

	public static int getSTD() {
		return STD;
	} // get

	public static void setSTD(int sTD) {
		STD = sTD;
	} // sett

	/* Generere tilfeldige tall mellom 0-1 */
	public static void Random() {
		tall = new double[STD];

		for (int i = 0; i < STD; i++) {
			tall[i] = Math.random();
		} // for
	} // metode

	/* Sorterer arrayen, i tillegg tar vi systemtiden før 
	 * og etter sorteringen, og regner ut forskjellen */	
	public static void sortArray() {
		long start = System.currentTimeMillis();
		Arrays.sort(tall);
		long stop = System.currentTimeMillis();
		
		long totalTid = stop - start;
		System.out.print(totalTid);
	} // metode
	
	/* Mulighet for å printe ut usortert array */
	public static void printArray() {

		for (int i = 0; i < STD; i++) {
			System.out.println(tall[i]);
		} // for
		System.out.println();
	} // metode
	
	/* Mulighet for å printe ut sortert array */
	public static void printSortertArray() {
		 for (int j = 0; j < STD; j++) {
		 System.out.println(tall[j]);
		 } // for
		 System.out.println();
	} // metode
} //class
