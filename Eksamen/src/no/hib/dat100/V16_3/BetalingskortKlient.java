package no.hib.dat100.V16_3;

public class BetalingskortKlient {
	public static void main(String[] args) {
		Betalingskort dk =  new Debetkort("ole", 2018, 7, 100);
		Betalingskort kk = new Kredittkort("per", 2016, 12, 200, 1000);
	
		System.out.println("Debetkort er gyldig? " + dk.erGyldig());
		System.out.println("Kredittkort er gyldig? " + kk.erGyldig());
		
		dk.innskudd(200);
		System.out.println("Saldo: " + dk.getSaldo());
		dk.trekk(50);
		System.out.println("Saldo: " + dk.getSaldo());
		System.out.println("Trekker 400: " + dk.trekk(400));
		System.out.println("Saldo: " + dk.getSaldo());
		
		
		System.out.println("Er det dekning på 1200kr? " + kk.dekning(1200));
		kk.trekk(1200);
		System.out.println("Ny saldo: " + kk.getSaldo());
		
	}
}
