package no.hib.dat100.L�kker;

import java.util.Scanner;

public class l�kker {

public static void main (String[] args) {
	int n;
	int sum1 = 0; // OBS! En lokal variabel m� gis verdi f�r vi bruker den
	// int sum2 = 0;
	boolean gyldigInndata;

	Scanner input = new Scanner(System.in);
			// do while-l�kke ved innlesing
			do {
				System.out.print("Tast inn n (Et tall mellom 2 og 20): ");
				n = input.nextInt();
				gyldigInndata= (n >= 2) && (n <= 20);
			
			if (!gyldigInndata)
				System.out.println("Feil inndata. " + n + " er ikke et tall mellom 2 og 20! ");
		
			} while (!gyldigInndata); 
				//while-l�kke ved summering
				int teller = 1;
				while (teller < n) {
					sum1= sum1 + teller;
					System.out.print(teller + " + ");
					teller = teller + 1; 	//etv teller++;
					}
				System.out.println(n + " = " + (sum1 + n));		
			input.close();
		}
	}

	

