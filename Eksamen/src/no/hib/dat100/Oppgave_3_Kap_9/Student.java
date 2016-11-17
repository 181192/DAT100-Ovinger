package no.hib.dat100.Oppgave_3_Kap_9;

import java.util.ArrayList;

import easyIO.In;

public class Student {
	private String navn;
	private ArrayList<Kurs> kurs;
	
	public Student(In t) {
		System.out.println("Oppgi navn: ");
		navn = t.inLine();
		kurs = new ArrayList<Kurs>();
	}
	
	public void leggTilKurs(Kurs kurskode) {
		kurs.add(kurskode);
	}
	
	public String visNavn() {
		return navn;
	}
	
	public void finnKurs() {
		for (int i = 0; i < kurs.size(); i++) {
			Kurs k = kurs.get(i);
			System.out.println(k.visKode());
		}
	}
}
