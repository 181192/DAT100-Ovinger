package no.hib.dat100.V16_4;

public class Varesamling {
	private Vare[] samling;
	private int antall;

	public Varesamling(int maxantall) {
		samling = new Vare[maxantall];
		this.antall = 0;
	}
	
	public void leggTil(Vare v) {
		if (antall < samling.length) {
			samling[antall] = v;
			antall++;
		} else {
			System.out.println("Ikke plass i varesamling. ");
		}
	}
	
	public Vare finnVare(int nummer) {
		int teller = 0;
		Vare v = null;
		while (teller < antall /* && nummer != samling[teller].getVarenummer()*/) {
			if (nummer == samling[teller].getVarenummer()) {
				v = samling[teller];
				v.toString();
			}
			teller++;
		}
		return v;
	}
	
//	public Vare lesFraFil() {
//		
//	}
	

} // class
