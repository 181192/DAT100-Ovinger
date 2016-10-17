package no.hib.dat100.Oving_1;

import java.util.Scanner;


public class Oppgave_3 {
	

	private static Scanner tastatur;

	public static void main(String[] args) {
		tastatur = new Scanner(System.in);
		System.out.print("Oppgi sekunder: "); 
		int sekunder = tastatur.nextInt();
		int totalsekunder = sekunder;
		int timer = sekunder / 3600;
		int minutter = (sekunder % 3600) / 60;
		sekunder = sekunder % 60;
		
		System.out.println(totalsekunder + " sekunder er: "+ timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder");		
		
		

	}

}
