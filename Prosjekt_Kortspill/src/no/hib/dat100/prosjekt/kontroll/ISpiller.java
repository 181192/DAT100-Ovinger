package no.hib.dat100.prosjekt.kontroll;

import no.hib.dat100.prosjekt.modell.Hand;
import no.hib.dat100.prosjekt.modell.Kort;

public interface ISpiller {
	/**
	 * Henter spillerens hand.
	 * 
	 * @return handen til spilleren
	 */
	public Hand getHand();

	/**
	 * Gir antall kort spilleren har på hand.
	 * 
	 * @return antall kort spilleren har på hand.
	 */
	public int getAntallKort();

	/**
	 * Hvem spilleren er (nord, syd).
	 * 
	 * @return hvem spilleren er.
	 */
	public Spillere hvem();

	/**
	 * Avgjør om spiller er ferdig (har ingen kort).
	 * 
	 * @return true om spilleren er ferdig, false ellers.
	 */
	public boolean erFerdig();

	/**
	 * Legger et kort til spillerens hand.
	 * 
	 * @param kort
	 *            kortet som legges til.
	 */
	public void leggTilKort(Kort kort);

	/**
	 * Fjerner et kort fra spillerens hand. Kortet skal finnes ved hjelp av
	 * equals() metonden i kort.
	 * 
	 * @param kort
	 *            som skal fjernes fra handen.
	 */
	public void fjernKort(Kort kort);

	/**
	 * Fjerner alle kort fra handen slik at man er klar for neste spill.
	 */
	public void fjernAlleKort();

	/**
	 * Trekker et kort fra bunken.
	 * 
	 * @param kort
	 *            som trekkes.
	 */
	public void trekker(Kort kort);

	/**
	 * Antall ganger spiller har trukket fra bunken mens han har vært i tur.
	 * 
	 * @return antall ganger spilleren har trukket.
	 */
	public int getAntallTrekk();

	/**
	 * Kan angi hvor mange ganger spilleren har trukket. Spesielt aktuelt for å
	 * kunne sette antall trekk til 0 (etter spilleren har spilt et kort eller
	 * sagt forbi).
	 * 
	 * @param trekk
	 *            antal ganger spilleren har trukket.
	 */
	public void setAntallTrekk(int trekk);

	/**
	 * Gir neste handling (spill et kort, trekk et kort, eller forbi).
	 * 
	 * @param topp
	 *            kortet øverts i bunken til.
	 * @return neste handling.
	 */
	public Handling nesteHandling(Kort topp);

}
