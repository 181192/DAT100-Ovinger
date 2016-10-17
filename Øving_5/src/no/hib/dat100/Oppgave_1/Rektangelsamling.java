package no.hib.dat100.Oppgave_1;

public class Rektangelsamling {
	private final int STD = 10;
	private Rektangel[] rs;
	private int antall;

	public Rektangelsamling() {
		rs = new Rektangel[STD];
		antall = 0;
	}

	public Rektangelsamling(int maksAntall) {
		rs = new Rektangel[maksAntall];
		this.antall = 0;
	}

	public Rektangel[] getRs() {
		return rs;
	}

	public void setRs(Rektangel[] rs) {
		this.rs = rs;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public int getSTD() {
		return STD;
	}

	// Forkrav: Ledig plass
	public void leggTil(Rektangel r) {
		rs[antall] = r;
		antall++;
	}

	public void visAlle() {
		for (int i = 0; i < antall; i++) {
			rs[i].fyllAreal();
			System.out.println();
		}
	}

	public void totAreal() {
		int sum = 0;
		for (int j = 0; j < antall; j++) {
			int totalareal = rs[j].regnAreal();
			sum += totalareal;
		}
		System.out.println("Totalarealet er: " + sum);
		
		
	}

}
