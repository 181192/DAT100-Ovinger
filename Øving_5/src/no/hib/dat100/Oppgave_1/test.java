package no.hib.dat100.Oppgave_1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {		
		System.out.println("Skriv inn char: ");
		Scanner tastatur = new Scanner(System.in);		
		char c = tastatur.next().charAt(0);
		
		tastatur.close();
		System.out.println("Du skrev: " + c);
		
		
	}
}