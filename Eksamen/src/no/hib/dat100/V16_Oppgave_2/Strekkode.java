package no.hib.dat100.V16_Oppgave_2;

public class Strekkode {

	public static String land(String kode) {
		String land = "";
		if (kode.startsWith("57")) {
			land = "Danmark";
		} else if (kode.startsWith("59")) {
			land = "Sverige";
		} else if (kode.startsWith("64")) {
			land = "Finland";
		} else if (kode.startsWith("70")) {
			land = "Norge";
		} else if (kode.startsWith("569")) {
			land = "Danmark";
		} else {
			land = "Andre";
		}
		return land;
	} // metode

	public static boolean lovligKode(String kode) {
		boolean tilstand = false;
		int partall = 0;
		int oddetall = 0;
		int kontrollsiffer = Character.digit(kode.charAt(kode.length() - 1), 10);
		for (int i = 0; i < kode.length() - 1; i++) {
			int tall = Character.digit(kode.charAt(i), 10);
			
			if (i % 2 == 0) {
				// partall
				partall += tall;
			}
			else if (i % 2 != 0) {
				// oddetall
				oddetall += tall;
			}
		}
		int total = partall + (oddetall * 3) + kontrollsiffer;
		if (total % 10 == 0) {
			tilstand = true;
		}
		return tilstand;
	} // metode
	
	public static boolean alleLovlige (String[] koder) {
		boolean tilstand = false;
		for (String tall : koder) {
			if (lovligKode(tall)) {
				tilstand = true;
			}
		}
		return tilstand;
	} // metode

} // class
