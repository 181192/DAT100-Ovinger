package no.hib.dat100.Oppgave_2;

public class KlientTid {

	public static void main(String[] args) {
		System.out.print("Å sortere " + Tid.getSTD() + " tilfeldige tall, tar hele: ");
		Tid.Random(); // Random generert tall mellom 0-1
		Tid.sortArray(); // Sorter array		
		System.out.println(" ms.");
		
//		Tid.printArray(); // Skriv ut usortert
//		Tid.printSortertArray(); // Skriv ut sortert
		
	} // main
} // class
