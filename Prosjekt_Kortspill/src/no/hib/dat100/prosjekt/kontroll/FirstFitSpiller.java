package no.hib.dat100.prosjekt.kontroll;

import java.util.ArrayList;

import no.hib.dat100.prosjekt.modell.Kort;

/**
 * Klasse som for � representere en vri�tter spiller. Strategien er � lete
 * gjennom kortene man har p� hand og spille det f�rste som er lovlig.
 *
 */
public class FirstFitSpiller extends Spiller {

	/**
	 * Konstrukt�r.
	 * 
	 * @param spiller
	 *            posisjon for spilleren (nord eller syd).
	 */
	public FirstFitSpiller(Spillere spiller) {
		super(spiller);
	}

	/**
	 * Metode for � implementere strategi. Strategien er � spille det f�rste
	 * kortet som er lovlig (ogs� en �tter selv om man har andre kort som ogs�
	 * kan spilles). Dersom man ikke har lovlige kort � spille, trekker man om
	 * man ikke allerede har trukket maks antall ganger. I s� fall sier man
	 * forbi.
	 * 
	 * @param topp
	 *            kort som ligg �verst p� til-bunken.
	 */
	@Override
	public Handling nesteHandling(Kort topp) {

		// kort som spilleren har (FirstFitSpiller arver fra Spiller)
		ArrayList<Kort> h = getHand().toArrayList();

		// kort som kan spilles
		Kort kort = null;

		/* first-fit strategi */
		
		// finn det forste kort p� handen som kan spilles (legges ned)
		// Hint: klassen Regler har en metode som gitt en kort sjekker om det kan legges ned
		
		// TODO
		
		// Hint: konstruer et handlingsobjekt som beskiver hva spilleren vil gj�re
		// se klassen RandomSpiller som implementerer en Random spiller
		
		Handling handling = null;
		
		// TODO
		throw new RuntimeException("Metode nesteHandling ikke implementert");
	}
}
