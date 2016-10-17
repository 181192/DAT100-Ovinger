package no.hib.dat100.Oppgave_1;

public class KlientRektangel {

	public static void main(String[] args) {
		String linje = "----------------";
		// metode 1
		Rektangel rektangel = new Rektangel();
		rektangel.setBredde(7);
		rektangel.setHøyde(4);
		rektangel.setFyll('#');
		rektangel.Resultat();
		rektangel.fyllAreal();
		
		System.out.println("\n"+ linje + "\n");
		
		// metode 2
		System.out.println(linje + "\nOppgave 1: " + "\n" + linje);
		Rektangel rektangel1 = new Rektangel(5,6,'D');
		rektangel1.Resultat();
		rektangel1.fyllAreal();
		
		System.out.println("\n" + linje + "\n" + "Oppgave 2:\n" + linje + "\n");
		
		// Rektangelsamling
		Rektangelsamling rektangelsamling = new Rektangelsamling(10);
		
		Rektangel rek1 = new Rektangel(3,4,'*');
		Rektangel rek2 = new Rektangel(2,3,'%');
		Rektangel rek3 = new Rektangel(5,5,'^');
		Rektangel rek4 = new Rektangel(10,15,'€');
		Rektangel rek5 = new Rektangel(6,8,'?');
		
		rektangelsamling.leggTil(rek1);
		rektangelsamling.leggTil(rek2);
		rektangelsamling.leggTil(rek3);
		rektangelsamling.leggTil(rek4);
		rektangelsamling.leggTil(rek5);
		
		rektangelsamling.visAlle();
		rektangelsamling.totAreal();
			
		}
	}
