package no.hib.dat100.Oving_4;

public class Bil {
	String merke;
	int aarsmodell;
	double pris;

	// Standard konstruktør
	Bil() {
		merke = "";
		aarsmodell = 1900;
		pris = 0.0;
	}

	Bil(String merke, int m) {
		this.merke = merke;
		if (m < 1900 || m > 2100) {
			aarsmodell = m;
		} else {
			aarsmodell = m;
		}
		pris = 0.0;
	}

	Bil(String merke, int aarsmodell, double pris) {
		this.merke = merke;
		if (aarsmodell < 1900 || aarsmodell > 2100) {
			this.aarsmodell = 1900;
		} else {
			this.aarsmodell = aarsmodell;
		}
		if (pris >= 0 && pris <= 1000000) {
			this.pris = pris;
		} else {
			pris = 0.0;
		}
	}

}
