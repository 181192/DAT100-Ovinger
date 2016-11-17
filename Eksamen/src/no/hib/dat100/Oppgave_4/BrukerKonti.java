package no.hib.dat100.Oppgave_4;

import java.util.HashMap;

public class BrukerKonti {
	private HashMap<String, String> konti;

	public BrukerKonti() {
		konti = new HashMap<String, String>();
	}

	public void registrerBruker(String brukernavn, String passord) {
		konti.put(brukernavn, passord);
	}

	public boolean skjekkPassord(String brukernavn, String passord) {
		boolean tilstand = false;
		if (konti.containsKey(brukernavn)) {
			tilstand = true;
		}

		return tilstand;
	}
}
