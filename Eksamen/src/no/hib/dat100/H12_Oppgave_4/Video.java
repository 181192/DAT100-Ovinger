package no.hib.dat100.H12_Oppgave_4;

public class Video {
	private String tittel;
	private String produsent;
	private int sekund;

	public Video(String tittel, String produsent, int sekund) {
		this.tittel = tittel;
		this.produsent = produsent;
		this.sekund = sekund;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public int getSekund() {
		return sekund;
	}

	public void setSekund(int sekund) {
		this.sekund = sekund;
	}

	public static double tilMinutter(double s) {
		double sekunder = (s % 60);
		int minutter = (int) s / 60;
		double total = minutter + sekunder / 100;
		return total;
	}

	public String toString() {
		return "Tittel: " + tittel + ", Produsent: " + produsent + ", Tid: " + tilMinutter(sekund);
	}
}
