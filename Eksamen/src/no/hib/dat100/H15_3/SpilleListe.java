package no.hib.dat100.H15_3;

import java.util.ArrayList;

public class SpilleListe {
	private ArrayList<Sang> sanger;

	public SpilleListe() {
		sanger = new ArrayList<Sang>();
	}

	public void leggTil(Sang sang) {
		sanger.add(sang);
	}

	public boolean leggTilSjekk(Sang sang) {
		boolean tilstand = false;
		
		if (!sanger.contains(sang)) {
			sanger.add(sang);
			tilstand = true;
		}
		return tilstand;
	}

	public void visListe() {		
		for (Sang sang : sanger) {
			sang.skrivUt();
		}
	}

	public ArrayList<Sang> finnSanger(Sjanger sjanger) {
		ArrayList<Sang> nyliste = new ArrayList<Sang>();
		
		for (Sang sang : sanger) {
			if (sang.getSjanger() == sjanger) {
				nyliste.add(sang);
			}
		}
		return nyliste;		
	}

}
