package no.hib.dat100.Oppgave_3;

import java.util.Random;

public class Terning {

	Random terning = new Random();
	private int[] STD = new int[100];
	private int[] kast = new int[6];
	private double gjennomsnitt;
	private int hiv;

	public void kastTerning() {
		for (int i = 0; i < STD.length; i++) { // L�kke for tilfeldige tall fra
												// 1-6 med 100 plasser i tabell
			hiv = terning.nextInt(6) + 1; // Genererer tilfeldige tall 1-6
			STD[i] = hiv;
			System.out.print(hiv + "  ");
			if ((i + 1) % 20 == 0) { // Linjeskift p� 20 tall
				System.out.println();
			}
			kast[hiv - 1] += 1; // Skriver til tabell kast
		}
		System.out.println();
	}

	public void antallKast() { // Antall last er lengden p� tabell
		System.out.println("Antall kast  : " + STD.length + "\n");
	}

	public void kastRes() { // Resutat p� hvor mange av hver
		for (int j = 0; j < kast.length; j++) {
			System.out.println("Antall " + (j + 1) + "-ere " + ": " + kast[j]);
		}
		System.out.println();
	}

	public void gjennomsnittVerdi() {
		double sum = 0;
		for (int i : STD) { // Summere array med forenklet for-l�kke
			sum += i;
		}
		gjennomsnitt = sum / STD.length; // Regne gjennomsnitt

		System.out.println("Gjennomsnittskast : " + gjennomsnitt +"\n");
	}

	public void f�rsteSekser() {
		int teller = 0;
		while (STD[teller] < 6) { // F�rste sekser
			teller++;
		}
		System.out.println("Antall kast for � f� den f�rste 6-eren : " + (teller + 1) +"\n");

	}

	public void flestVerdi() {
		int hoyeste = 0;
		int maks = kast[0];
		for (int i = 1; i < kast.length; i++) {
			if (kast[i] > maks) {
				maks = kast[i];
				hoyeste = i; // Terning som kom oftest, men m� legge til 1 p� utskrift
			}
			
		}
		System.out.println("Terningverdien det var flest av: " + (hoyeste + 1));
		
	}
	public void fancyUtskrift() {
		System.out.printf("\t\t" + "TERNINGKASTSIMULATOR" + "\n\n");
	}
}
