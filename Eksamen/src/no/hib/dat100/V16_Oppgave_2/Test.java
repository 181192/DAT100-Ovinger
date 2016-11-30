package no.hib.dat100.V16_Oppgave_2;

public class Test {
	public static void main(String[] args) {
		int[] tabell = { 1, 2, 3, 4, 5 };
		String tabell2 = "12345678";
		int kontrollsiffer = Character.digit(tabell2.charAt(tabell2.length() - 1), 10);
		System.out.println(tabell[tabell.length - 2]);
		System.out.println(tabell[tabell.length - 1]);
		System.out.println(kontrollsiffer);
	}
}
