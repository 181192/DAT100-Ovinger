package no.hib.dat100.Oppgave_5;

public class RomKlient {
	public static void main(String[] args) {
		Rom[] r = new Rom[] { new Møterom(100, "navn", 10), new Kontor(101, "navn1", "Ole") };

		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i].toString());
		}
	}
}
