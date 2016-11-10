package no.hib.dat100.Oppgave_1;

public class Firkant implements ITegnbar {
	private static String[][] data = { { " ", "#", "#", "#", " " }, { "#", " ", " ", " ", "#" },
			{ "#", " ", " ", " ", "#" }, { "#", " ", " ", " ", "#" }, { " ", "#", "#", "#", " " } };

	public void tegnOpp() {
		for (String[] rad : data) {
			for (String kol : rad) {
				System.out.printf("%-2s",kol);
			}
			System.out.println();
		}
		System.out.println();
	}
}
