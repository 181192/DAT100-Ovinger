package no.hib.dat100.V16_Oppgave_2;

public class StrekkodeKlient {
	public static void main(String[] args) {
		String[] test = { "7038010002151", "6428010002151" };
		System.out.println("Koden er i fra " + Strekkode.land(test[0]));
		System.out.println("Koden er i fra " + Strekkode.land(test[1]));
		System.out.println("Er koden lovlig? " + Strekkode.lovligKode(test[0]));
		System.out.println("Er koden lovlig? " + Strekkode.lovligKode(test[1]));
		System.out.println("Er alle kodene lovlige? " + Strekkode.alleLovlige(test));
	}

}
