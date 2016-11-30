package no.hib.dat100.H12_Oppgave_4;

public class Videoarkiv {
	private Video[] vTab;
	private int antall;

	public Videoarkiv(int maksAntall) {
		vTab = new Video[maksAntall];
	}

	public void leggTil(Video v) {
		if (antall < vTab.length) {
			vTab[antall] = v;
			antall++;
		}
	}

	public int finnTotalTid() {
		int total = 0;
		for (int i = 0; i < vTab.length; i++) {
			if (vTab[i] != null) {
				total += vTab[i].getSekund();
			}
		}
		return total;
	}

	public void listAlle(String produsent) {
		System.out.println("Filmer produsert av: " + produsent);
		for (int i = 0; i < vTab.length; i++) {
			if (vTab[i] != null && produsent.equals(vTab[i].getProdusent())) {
				System.out.print(vTab[i].getTittel() + ", ");
			}
		}
	}

	public void slett(String tittel) {
		boolean funnet = false;
		for (int j = 0; j < vTab.length; j++) {
			if (vTab[j] != null && tittel.equals(vTab[j].getTittel())) {
				funnet = true;
				System.out.println("Sletter tittelen: " + vTab[j].getTittel() + "\n");
				for (int i = 1; i < vTab.length - 1; i++) {
					vTab[i] = vTab[i + 1];
				}	
			}
		}
		if (!funnet) {
			System.out.println("\n\nTittelen '" + tittel + "' finnes ikke i arkivet\n");
		}
	}

	public void bestePar(int tidsgrense) {
		double p = 0;
		double v = 0;
		String g = "";
		String h = "";
		boolean funnet = false;
		for (int i = antall - 1; i >= 0 && !funnet; i--) {
			for (int k = 0; k < i && !funnet && vTab[i] != null; k++) {
				double ik = vTab[i].getSekund() + vTab[k].getSekund();
				if (ik == tidsgrense) {
					System.out.println(vTab[i].getTittel() + " og " + vTab[k].getTittel());
					funnet = true;
				} else if (ik < tidsgrense && ik >= p + v) {
					p = vTab[i].getSekund();
					v = vTab[k].getSekund();
					g = vTab[i].getTittel();
					h = vTab[k].getTittel();
				}
			}
		}
		if (!funnet) {
			System.out.println(h + " og " + g +" kan du se innenfor tidsgrensen.");
		}
	}
}
