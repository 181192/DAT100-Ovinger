package no.hib.dat100.Oppgave_1;

public class Oppgave_1 {

	public static void main(String[] args) {
		System.out.println("OPPGAVE 1a");
		System.out.println(3 - 5 - 1); // -3
		System.out.println("OPPGAVE 1b");
		System.out.println("7 != 5 = " + (7 != 5)); // true
		
		System.out.println("OPPGAVE 1c");
		int k = 2; 
		switch (k) {
		case 1: 
			System.out.println("DAT100");
			break;
		case 2: 
			System.out.println("DAT101"); // Denne
			break;
		default: 
			System.out.println("ING101");
			break;
		}
		
		System.out.println("OPPGAVE 1d");
		int x = 3;
		int y = 4;
		if ((y < 0) || (x == 3)) {
			System.out.println("DAT100"); // Denne
		} else if (x != 3) {
			System.out.println("DAT101");
		} else {
			System.out.println("ING101");
		}
		
		System.out.println("OPPGAVE 1e");
		int b = 0;
		for (int i = 0; i < 5; i++) {
			b = 1 - b;
			System.out.println(b);
		}

	}

}
