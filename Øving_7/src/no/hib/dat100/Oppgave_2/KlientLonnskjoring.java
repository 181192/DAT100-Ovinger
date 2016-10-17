package no.hib.dat100.Oppgave_2;

public class KlientLonnskjoring {

	public static void main(String[] args) {
		Arbeidstaker.passandeOverskrift();

		Lonnskjoring lk = new Lonnskjoring("Kiwi", 10);

		Arbeidstaker a1 = new Arbeidstaker("Ole", "Olsen", 180, 60, 19);
		Arbeidstaker a2 = new Arbeidstaker("Per", "Olsen", 255, 30, 27);
		Arbeidstaker a3 = new Arbeidstaker("Anna", "Andresen", 160, 44, 17);
		Arbeidstaker a4 = new Arbeidstaker("Ida", "Gundersen", 127, 37.5, 22);
		Arbeidstaker a5	= new Arbeidstaker("Jens", "Jensemann", 285, 55, 30);
		
		lk.skrivFirmanavn();
		Arbeidstaker.tabellOverskrift();		
		lk.lesArbeidstakarar(a1);
		lk.lesArbeidstakarar(a2);
		lk.lesArbeidstakarar(a3);
		lk.lesArbeidstakarar(a4);
		lk.lesArbeidstakarar(a5);

		lk.skrivLonsoversikt();
		Arbeidstaker.linje('-');
		System.out.println();
		lk.finnTotalOvertid();
		lk.finnTotalBruttoløn();
		lk.skrivHogasteBrutto();
		Arbeidstaker.linje('-');

		lk.finnOgSkrivPerson();
	}
}
