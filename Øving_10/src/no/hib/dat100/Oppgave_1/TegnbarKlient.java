package no.hib.dat100.Oppgave_1;

public class TegnbarKlient {

	public static void main(String[] args) {
		ITegnbar[] tegn = new ITegnbar[] { new Firkant(), new Sirkel(), new Juletre()};
		
		tegn[0].tegnOpp();
		tegn[1].tegnOpp();
		tegn[2].tegnOpp();
		
		
	}


}
