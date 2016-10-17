package no.hib.dat100.Løkker;

import java.util.Scanner;

public class løkker {

public static void main (String[] args) {
	int n;
	int sum1 = 0; // OBS! En lokal variabel må gis verdi før vi bruker den
	// int sum2 = 0;
	boolean gyldigInndata;

	Scanner input = new Scanner(System.in);
			// do while-løkke ved innlesing
			do {
				System.out.print("Tast inn n (Et tall mellom 2 og 20): ");
				n = input.nextInt();
				gyldigInndata= (n >= 2) && (n <= 20);
			
			if (!gyldigInndata)
				System.out.println("Feil inndata. " + n + " er ikke et tall mellom 2 og 20! ");
		
			} while (!gyldigInndata); 
				//while-løkke ved summering
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

	

