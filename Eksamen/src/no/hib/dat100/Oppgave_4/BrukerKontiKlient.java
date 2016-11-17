package no.hib.dat100.Oppgave_4;

public class BrukerKontiKlient {
	public static void main(String[] args) {
		BrukerKonti bk = new BrukerKonti();
		bk.registrerBruker("ole", "katt");
		bk.registrerBruker("kari", "hund");
		
		System.out.println(bk.skjekkPassord("ole", "katt"));
	}
}
