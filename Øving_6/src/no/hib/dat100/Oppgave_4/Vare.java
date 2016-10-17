package no.hib.dat100.Oppgave_4;

public class Vare {
	private int varenr;
	private String navn;
	private double pris;
	private double moms;

	public Vare() { // Standard konstruktør
		varenr = 0;
		navn = "";
		pris = 0;
	} //

	public Vare(int varenr, String navn, double pris) { // Konstruktør med parameter
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}

	public int getVarenr() {
		return varenr;
	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public double getMoms() {
		return moms;
	}

	public void setMoms(double moms) {
		this.moms = moms;
	}

	public double moms() { // Regne ut moms, retunere verdien "moms"
		this.moms = (pris * 0.2);
		return moms;
	}

	public void billigereEnn(Vare v) { // finne forskjell i pris
		System.out.print(" Pris forskjell: ");
	    if (this.pris < v.getPris()) { // Er pris på vare v1 mindre enn pris på vare v2?
	    	System.out.println("Varen er billigere!");	    	
	    } 
	    else if (this.pris == v.getPris()) { // Er prisene like?
	    	System.out.println("Varene koster det samme!");
	    }
	    else { // Varen er dyrere visst ingen av de andre stemmer
	    	System.out.println("Varen er dyrere!"); 
	    }		
	}

	public void skriv() { // Utskrift med litt formatering
		String linje = "-----------------------------";
		System.out.printf("%s%S%n", " Varenummer: " , varenr);
		System.out.println(linje);
		System.out.printf("%s%8s%n", " Navn på vare\t : " , navn);
		System.out.printf(" %s%6.2f%s%n", "Pris\t\t :", pris, " kr");
		System.out.printf(" %s%6.2f%s%n%n","Moms\t\t :", moms() , " kr");
		System.out.println(linje);
	}

}// Class
