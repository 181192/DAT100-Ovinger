package no.hib.dat100.Oppgave_3;

public class Kino {
	private boolean[][] seter = { 
			{ true, true, false, false, false, true, true, false },
			{ true, true, true, true, true, true, true, true }, 
			{ true, true, true, true, true, true, true, true } };
	
	
	public boolean erLedig(int r, int s) {
		boolean tilstand = false;
		if (seter[r][s]) {
			tilstand = true;
		}
		return tilstand;
	}
	
	public int AntallLedige() {
		int antallLedige = 0;
		for (int r = 0; r < seter.length; r++) {
			for (int k = 0; k < seter[r].length; k++) {
				if (seter[r][k]) {
					antallLedige += 1;
				}
			}
		}
		
		return antallLedige;
	}
	
	public void finnLedig() {
		for (int r = 0; r < seter.length; r++) {
			for (int k = 0; k < seter[r].length; k++) {
				if (seter[r][k]) {
					System.out.println("Ledig sete på rad: " + (r + 1) + " plass: " + (k + 1));
				}
			}
		}
	}
}
