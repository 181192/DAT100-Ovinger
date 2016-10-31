package no.hib.dat100.prosjekt.modell;

import java.util.ArrayList;
import java.util.Random;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * konstanter i klassen som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public abstract class KortSamling {

	public static final int MAKS_KORT_FARGE = 3;
	private final int MAKS_KORT = 4 * MAKS_KORT_FARGE;

	// tabell for representasjon av samling av kort
	private Kort[] samling;

	// index på forste ledige plass
	private int forsteledig;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		samling = new Kort[MAKS_KORT];
		forsteledig = 0;
	}

	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		return forsteledig == 0;
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved å‚ bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i eventuelle subklasser. Om man trenger
	 * kortene utenfor arvehierarkiet, anbefales metoden toArrayList().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		return samling;
	}

	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		int sum = 0;
		for (int i = 0; i < samling.length; i++) {
			if (!(samling[i] == null)) {
				sum++;
			}
		} // for
		return sum;
	} // get

	/**
	 * Legger alle korta (hele kortstokken) til samlnga. Korta vil være sortert
	 * slik at de normalt må stokkes får bruk.
	 */
	public void leggTilAlle() {
		// Hint: Kortfarge.values() gir en tabell med alle kortfarger
		fjernAlle();
		Kortfarge[] kr = Kortfarge.values();
		for (Kortfarge k : kr) {
			for (int i = 1; i <= MAKS_KORT_FARGE; i++) {
				leggTil(new Kort(k, i));
			}
		}
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		for (int i = forsteledig; i < 0; i++) {
			samling[i] = null;
			forsteledig++;
		}
		forsteledig = 0;
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		samling[forsteledig] = kort;
		forsteledig++;
	}

	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet.
	 */
	public Kort seSiste() {
		return samling[forsteledig - 1];
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		if (erTom()) {
			return null;
		} else {
			Kort ta = samling[forsteledig - 1];
			samling[forsteledig - 1] = null;
			forsteledig--;
			return ta;
		}
	}

	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {

		boolean har = false;
		for (int i = 0; i < forsteledig && !har; i++) {
			if (samling[i].equals(kort)) {
				har = true;
			}
		}
		return har;
	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting.
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 */
	public void fjern(Kort kort) {
		// Hint: finn forst ut hvor kortet er i samlingen hvis det finnes

		// Hint: fjern kortet - men husk kortet kan sitte på en plass i midten
		Kort slett = null;
		for (int i = 0; i < forsteledig; i++) {
			if (kort.lik(samling[i])) {
				slett = samling[i];
				samling[i] = samling[forsteledig - 1];
				samling[forsteledig - 1] = null;
				forsteledig--;
			}
		}
	}

	/**
	 * Stokkar en kortsamling ved å bytte rundt på kort
	 */
	public void stokk() {
		// Hint: en mulighet er bruk av klassen Random for å generere tilfeldige
		// index
		Random random = new Random();

		for (int i = forsteledig + 1; i < 0; i--) {
			int p = random.nextInt(MAKS_KORT);
			Kort k = samling[i];
			
			samling[i] = samling[p];
			samling[p] = k;
		}
	}

	/**
	 * Gir kortene som en ArrayList.
	 * 
	 * @return samlinga av kort som en ArrayList. Korta vil ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public ArrayList<Kort> toArrayList() {
		ArrayList<Kort> list = new ArrayList<Kort>();
		if (!erTom()) {
			for (int i = 0; i < forsteledig; i++) {
				list.add(samling[i]);
			}
		}
		return list;
		// Hint: legg hvert kort fra samling over i arraylisten list
	}
}
