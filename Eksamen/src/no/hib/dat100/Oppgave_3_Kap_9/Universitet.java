package no.hib.dat100.Oppgave_3_Kap_9;

import java.util.HashMap;

import easyIO.In;

public class Universitet {
	private static HashMap<String, Student> studenter;
	private static HashMap<String, Kurs> kurs;
	private static In tast = new In();

	public static void main(String[] args) {
		studenter = new HashMap<String, Student>();
		kurs = new HashMap<String, Kurs>();
		char valg;
		String meny = "S - Legg til student\n" + "K - Legg til kurs\n" + "P - Legg til student og kurs\n"
				+ "V - S�k p� student\n" + "E - S�k p� kurs\n" + "Q - Avslutt\n\n" + "Valg: ";

		// S K P V E Q
		System.out.print(meny);
		valg = tast.inLine().charAt(0);
		while (valg != 'Q') {
			switch (valg) {
			case 'S' :
				opprettStudent();
				break;
			case 'K' :
				opprettKurs();
				break;
			case 'P' :
				p�melding();
				break;
			case 'V' :
				visStudent();
				break;
			case 'E' :
				visKurs();
				break;
			}
			System.out.print(meny);
			valg = tast.inLine().charAt(0);
		}
	}

	public static void opprettStudent() {
		Student s = new Student(tast);
		if (studenter.containsKey(s.visNavn())) {
			System.out.println("Studenter er allerede registrert.");
		} else {
			studenter.put(s.visNavn(), s);
		}
	}

	public static void opprettKurs() {
		Kurs k = new Kurs(tast);
		if (studenter.containsKey(k.visKode())) {
			System.out.println("Kurset er allerede registrert.");
		}
		kurs.put(k.visKode(), k);
	}

	public static void p�melding() {
		Student s;
		Kurs k;
		System.out.println("Oppgi studentens navn: ");
		String navn = tast.inLine().trim();
		if (studenter.containsKey(navn)) {
			System.out.println("Oppgi kurskode: ");
			{
				String kode = tast.inLine().trim();
				if (kurs.containsKey(kode)) {
					s = studenter.get(navn);
					k = kurs.get(kode);
					s.leggTilKurs(k);
					k.leggTilStudent(s);
					System.out.println(s.visNavn() + " er p�meldt " + k.visKode());
				} else {
					System.out.println("Ukjent kurs.");
				}
			}
		} else {
			System.out.println("Ukjent student.");
		}
	}
	public static void visStudent() {
		Student s;
		System.out.println("Oppgi studentens navn: ");
		String navn = tast.inLine().trim();
		if (studenter.containsKey(navn)) {
			s = studenter.get(navn);
			s.finnKurs();
		} else {
			System.out.println("Ukjent student.");
		}
	}
	public static void visKurs() {
		Kurs k;
		System.out.println("Oppgi kurskode: ");
		String kode = tast.inLine().trim();
		if (kurs.containsKey(kode)) {
			k = kurs.get(kode);
			k.finnStudenter();
		} else  {
			System.out.println("Ukjent kurs.");
		}
	}
}
