package no.hib.dat100.Oppgave_2;

import easyIO.Out;

public class ArrayHashmapArrayList {

	public static void Oversikt() {
		final int bredde1 = 20;
		final int bredde2 = 25;
		final int bredde3 = 25;
		final int bredde4 = 25;
		String linje = "-----------------------------------------------------------------------------------------------";
		String linje1 = "***********************************************************************************************";
		
		Out skjerm = new Out();
		
		skjerm.out("Forskjeller", bredde1);
		skjerm.out("- Array", bredde2);
		skjerm.out("- HashMap", bredde3);
		skjerm.outln("- ArrayList", bredde4);
		
		skjerm.outln(linje1);
		
		skjerm.out("Lengde", bredde1);
		skjerm.out("- Fast", bredde2);
		skjerm.out("- Ubegrenset", bredde3);
		skjerm.outln("- Ubegrenset", bredde4);
		skjerm.outln(linje);
		
		skjerm.out("Lagring", bredde1);
		skjerm.out("- Primitive og objekt", bredde2);
		skjerm.out("- Kun objekt", bredde3);
		skjerm.outln("- Objektpekere", bredde4);
		skjerm.outln(linje);
		
		skjerm.out("Ordning", bredde1);
		skjerm.out("- 0 -> Maks-1", bredde2);
		skjerm.out("- Ingen ordning", bredde3);
		skjerm.outln("- ", bredde4);
		skjerm.outln(linje);
		
		skjerm.out("Gjennomløp", bredde1);
		skjerm.out("- Enkel for-løkke", bredde2);
		skjerm.out("- Iterator", bredde3);
		skjerm.outln("- ", bredde4);
		skjerm.outln(linje);
		
		skjerm.out("Innsetting av", bredde1);
		skjerm.out("- ", bredde2);
		skjerm.out("- ", bredde3);
		skjerm.outln("- ", bredde4);
		skjerm.out("objekt eller verdi", bredde1);
		skjerm.out("- Enkel tilordning", bredde2);
		skjerm.out("- Metoden put", bredde3);
		skjerm.outln("- ", bredde4);
		skjerm.outln(linje);
		
		skjerm.out("Søking", bredde1);
		skjerm.out("- Kun gjennomløp", bredde2);
		skjerm.out("- Metoden get", bredde3);
		skjerm.outln("- ", bredde4);
		skjerm.outln(linje);
		
	}

	public static void main(String[] args) {
		Oversikt();
	}
}
