package no.hib.dat100.H13_Oppgave_4;

public class test {
	private static int[] turer = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 4, 5 };

		boolean b = true;
		if (tab != null && turer != null) { // skjekker om tabellen innholder noe
			if (tab.length != turer.length) { // skjekker om tabellene er samme lengde
				b = false;
			} else {
				for (int i = 0; i < turer.length; i++) { 
					if (tab[i] != turer[i]) { // skjekker om elemtene er de samme
						b = false;
					}
				}
			}
		} else {
			b = false;
		}
		System.out.println(b);
	}
}
