package no.hib.dat100.V15_2;

public class Innboks implements IInnboks {
	private Epost[] eposter;
	private final int MAXTEGN = 10000;

	public Innboks(int antall) {
		this.eposter = new Epost[antall];
	}

	public int maxAntall() {
		return eposter.length;
	}

	public int antallLedige() {
		int antall = 0;
		for (int i = 0; i < eposter.length; i++) {
			if (eposter[i] == null) {
				antall++;
			}
		}
		return antall;
	}

	public boolean erFull() {
		int innhold = 0;
		Epost epost;
		int i = 0;
		
		while (i < eposter.length) {
			epost = eposter[i];
			
			if (epost != null) {
				innhold += epost.getInnhold().length();
			}
			i++;
		}
		return (innhold > MAXTEGN);
	}

	public boolean leggTil(Epost epost) {
		boolean sattInn = false;
		int ledige = antallLedige();
		
		if ((ledige > 0) && (!erFull())) {
			int i = maxAntall() - ledige;
			while(i > 0) {
				eposter[i] = eposter[i - 1];
				i--;
			}
			eposter[0] = epost;
			sattInn = true;
		}
		return sattInn;
	}

}
