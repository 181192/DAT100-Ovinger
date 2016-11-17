package no.hib.dat100.Oppgave_3_Kap_9;

import java.util.ArrayList;

import easyIO.In;

public class Kurs {
	private String kurskode;
	private String kursnavn;
	private ArrayList<Student> studenter;
	
	public Kurs(In tastatur) {
		System.out.println("Oppgi kurskode: ");
		kurskode = tastatur.inLine();
		System.out.println("Oppgi kursnavn: ");
		kursnavn = tastatur.inLine();
		studenter = new ArrayList<Student>();
	}
	
	public void leggTilStudent(Student s) {
		studenter.add(s);
	}
	
	public String visKode() {
		return kurskode;
	}
	
	public void finnStudenter() {
		for (int i = 0; i < studenter.size(); i++) {
			Student s = studenter.get(i);
			System.out.println(s.visNavn());
		}
	}
	
}
