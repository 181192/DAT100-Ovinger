package no.hib.dat100.H12_Oppgave_4;

public class VideoMain {
	public static void main(String[] args) {
		Videoarkiv va = new Videoarkiv(100);
		Video[] v = new Video[] { new Video("Test Tittel", "Ole Olsen", 600), new Video("yolo", "Ole Olsen", 124),
				new Video("yolo2", "Ole Olsen", 124), new Video("yolo3", "Ole Olsen", 124),
				new Video("yolo4", "Ole Olsen", 124) };

		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		va.leggTil(v[0]);
		va.leggTil(v[1]);
		va.leggTil(v[2]);
		va.leggTil(v[3]);
		va.leggTil(v[4]);

		System.out.println();
		System.out.println("Total tid i sekunder: " + va.finnTotalTid());
		System.out.println();
		va.listAlle("Ole Olsen");
		va.slett("yol0o");
		va.slett("yolo");
		va.listAlle("Ole Olsen");
		System.out.println();
		System.out.println();
		va.bestePar(600);

	}
}
