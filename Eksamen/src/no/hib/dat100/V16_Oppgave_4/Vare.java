package no.hib.dat100.V16_Oppgave_4;

public class Vare {
	private String navn;
	private int varenummer;
	private double pris;
	
	public Vare(String navn, int varenummer, double pris) {
		super();
		this.navn = navn;
		this.varenummer = varenummer;
		this.pris = pris;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVarenummer() {
		return varenummer;
	}

	public void setVarenummer(int varenummer) {
		this.varenummer = varenummer;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	@Override
	public String toString() {
		return "Vare [navn=" + navn + ", varenummer=" + varenummer + ", pris=" + pris + "]";
	}
	
	
	
}
