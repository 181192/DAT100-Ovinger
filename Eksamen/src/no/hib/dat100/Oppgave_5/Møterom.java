package no.hib.dat100.Oppgave_5;

public class M�terom extends Rom{
	private int antall;

	public M�terom(int nummer, String navn, int antall) {
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
		return "M�terom [antall: " + antall + ", " + super.toString() + "]";
	}
	
	
	
	
}
