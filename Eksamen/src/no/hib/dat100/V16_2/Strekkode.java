package no.hib.dat100.V16_2;

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
			land = "Island";
		} else {
			land = "Annet";
		}
		return land;
	} // metode

	public static boolean lovligKode(String kode) {
		boolean tilstand = false;
		int parSum = 0;
		int oddeSum = 0;
		int kontrollsiffer = Character.digit(kode.charAt(kode.length() - 1), 10);

		for (int i = 0; i < kode.length() - 1; i++) {
			int tall = Character.digit(kode.charAt(i), 10);
			if (i % 2 == 0) {
				parSum = parSum + tall;
			} else if (i % 2 != 0) {
				oddeSum = oddeSum + tall;
			}
		}
		int totalSum = (parSum + (oddeSum * 3) + kontrollsiffer);

		if (totalSum % 10 == 0) {
			tilstand = true;
		}
		return tilstand;
	} // metode

	public static boolean alleLovlige(String[] koder) {
		boolean tilstand = false;
		for (String k : koder) {
			if (lovligKode(k)) {
				tilstand = true;
			}
		}
		return tilstand;
	}
} // class
