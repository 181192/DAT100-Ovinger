package no.hib.dat100.H15_Oppgave_2;

public class Innboks implements IInnboks {
	private Epost[] eposter;
	private final int MAXTEGN = 10000;

	public Innboks(int antall) {
		this.eposter = new Epost[antall];
	}

	@Override
	public int maxAntall() {
		return eposter.length;
	}

	@Override
	public int antallLedige() {
		int ledig = 0;
		for (Epost epost : eposter) {
			if (epost == null) {
				ledig++;
			}
		}
		return ledig;
	}

	@Override
	public boolean erFull() {
		int innhold = 0;
		for (Epost epost : eposter) {
			if (epost != null) {
				innhold = innhold + epost.getInnhold().length();
			}
		}
		return (innhold > MAXTEGN);
	}

	@Override
	public boolean leggTil(Epost epost) {
		boolean sattinn = false;
		int ledige = antallLedige();
		// også ok ikke å test på erFull (ikke fuldt beskrevet i oppgaven
		if ((ledige > 0) && (!erFull())) {
			int i = maxAntall() - ledige;
			// flytt alle eposter en plass mot slutten av tabellen
			while (i > 0) {
				eposter[i] = eposter[i - 1];
				i--;
			}
			// innsett den nye epost forrest
			eposter[0] = epost;
			sattinn = true;
		}
		return sattinn;
	}

}
