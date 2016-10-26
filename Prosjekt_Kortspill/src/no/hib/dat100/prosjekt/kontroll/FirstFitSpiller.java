package no.hib.dat100.prosjekt.kontroll;

import java.util.ArrayList;

import no.hib.dat100.prosjekt.modell.Kort;

/**
 * Klasse som for å representere en vriåtter spiller. Strategien er å lete
 * gjennom kortene man har på hand og spille det første som er lovlig.
 *
 */
public class FirstFitSpiller extends Spiller {

	/**
	 * Konstruktør.
	 * 
	 * @param spiller
	 *            posisjon for spilleren (nord eller syd).
	 */
	public FirstFitSpiller(Spillere spiller) {
		super(spiller);
	}

	/**
	 * Metode for å implementere strategi. Strategien er å spille det første
	 * kortet som er lovlig (også en åtter selv om man har andre kort som også
	 * kan spilles). Dersom man ikke har lovlige kort å spille, trekker man om
	 * man ikke allerede har trukket maks antall ganger. I så fall sier man
	 * forbi.
	 * 
	 * @param topp
	 *            kort som ligg øverst på til-bunken.
	 */
	@Override
	public Handling nesteHandling(Kort topp) {

		// kort som spilleren har (FirstFitSpiller arver fra Spiller)
		ArrayList<Kort> h = getHand().toArrayList();

		// kort som kan spilles
		Kort kort = null;

		/* first-fit strategi */
		
		// finn det forste kort på handen som kan spilles (legges ned)
		// Hint: klassen Regler har en metode som gitt en kort sjekker om det kan legges ned
		
		// TODO
		
		// Hint: konstruer et handlingsobjekt som beskiver hva spilleren vil gjøre
		// se klassen RandomSpiller som implementerer en Random spiller
		
		Handling handling = null;
		
		// TODO
		throw new RuntimeException("Metode nesteHandling ikke implementert");
	}
}
