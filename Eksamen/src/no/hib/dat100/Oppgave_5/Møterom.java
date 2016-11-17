package no.hib.dat100.Oppgave_5;

public class Møterom extends Rom{
	private int antall;

	public Møterom(int nummer, String navn, int antall) {
		super(nummer, navn);
		this.antall = antall;
	}
	

	public int getAntall() {
		return antall;
	}


	public void setAntall(int antall) {
		this.antall = antall;
	}


	@Override
	public String toString() {
		return "Møterom [antall: " + antall + ", " + super.toString() + "]";
	}
	
	
	
	
}
