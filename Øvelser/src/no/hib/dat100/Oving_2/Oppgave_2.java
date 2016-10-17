package no.hib.dat100.Oving_2;

import java.util.Scanner;

public class Oppgave_2 {


	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in); // �pne tastatur
		System.out.print("Oppgi antall tall du vil sammeligne: ");
		
		int antall = tastatur.nextInt(); //definere tastatur-input
		int[] tabell = new int[antall]; //lage tabell
		
		for (int i = 1; i < antall; i++) { // sjekke om "i" er st�rre enn antall kolloner i tabell
			System.out.print("Tall nr." + i + " = ");
			tabell[i] = tastatur.nextInt(); 
			}
		
		tastatur.close(); //lukke tastatur
		
		int maks = tabell[0]; // definere max verdi
		for (int j = 1; j < tabell.length; j++) { 
			if (tabell[j] > maks) { // sjekke om "i" er st�rre enn den st�rste verdiern til n�
				maks = tabell[j]; // Legge til ny max verdi
			}
		} 
		
		System.out.println("St�rste tall er : " + maks);

		}
	}

