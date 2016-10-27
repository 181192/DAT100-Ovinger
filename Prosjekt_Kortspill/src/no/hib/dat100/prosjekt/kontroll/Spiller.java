package no.hib.dat100.prosjekt.kontroll;

import no.hib.dat100.prosjekt.modell.Hand;
import no.hib.dat100.prosjekt.modell.Kort;

/**
 * Abstrakt klasse som implementerer alle metodene i kontrakten ISpiller,
 * bortsett fra nesteHandling(). Dette er grunnen til at klassen er abstrakt.
 * For å lage "virkelige" spillere, må vi arve fra denne klassen og implmentere
 * nesteHandling (fra ISpiller).
 * 
 * Klassen har objektvariablene hand (Hand), antalltrekk (heltall) og spiller
 * (Spillere). Den har to konstruktører. Se beskrivelse av disse.
 * 
 */
public abstract class Spiller implements ISpiller {

	// Hand for spilleren
	private Hand hand;

	// antall trekk spilleren har gjort fra fra-bunken
	private int antalltrekk;

	// hvem spilleren er (Nord,Syd,Ingen) - se oppramsklassen Spillere
	private Spillere spiller;

	/**
	 * Standard konstruktør som oppretter en Spiller med en hand uten kort,
	 * antalltrekk som 0 og setter spiller til Spillere.INGEN.
	 */
	public Spiller() {
		hand = new Hand();
		antalltrekk = 0;
		spiller = Spillere.INGEN;
	}

	/**
	 * Konstruktør der vi kan sette hvilken spiller det er (NORD, SYD eller
	 * INGEN).
	 * 
	 * @param spiller
	 *            hvilken spiller det er.
	 */
	public Spiller(Spillere spiller) {
		this.spiller = spiller;
	}

	@Override
	public int getAntallKort() {
		return hand.getAntalKort();
	}

	@Override
	public Hand getHand() {
		return hand;
	}

	public int getAntallTrekk() {
		return antalltrekk;
	}

	public Spillere hvem() {
		return spiller;
	}

	public void setAntallTrekk(int t) {
		this.antalltrekk = t;
	}

	@Override
	public boolean erFerdig() {
		return hand.getAntalKort() == 0;
	}

	@Override
	public void leggTilKort(Kort kort) {
		hand.leggTil(kort);
	}

	@Override
	public void fjernKort(Kort kort) {
		hand.fjern(kort);
	}

	@Override
	public void fjernAlleKort() {
		hand.fjernAlle();
	}

	@Override
	public void trekker(Kort kort) {
		Kort k = kort;
		hand.leggTil(k);
		antalltrekk++;
	}
}
