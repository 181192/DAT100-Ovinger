package no.hib.dat100.Oppgave_5;

public class Kontor extends Rom {
	private String navnEier;

	public String getNavnEier() {
		return navnEier;
	}

	public void setNavnEier(String navnEier) {
		this.navnEier = navnEier;
	}

	public Kontor(int nummer, String navn, String navnEier) {
		super(nummer, navn);
		this.navnEier = navnEier;
	}

	@Override
	public String toString() {
		return "Kontor [navnEier: " + navnEier + ", " + super.toString() + "]";
	}
	
	

}
