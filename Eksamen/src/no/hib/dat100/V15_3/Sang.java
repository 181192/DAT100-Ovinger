package no.hib.dat100.V15_3;

public class Sang {
	private String tittel;
	private int tid;
	private Sjanger sjanger;
	
	public Sang(String tittel, int tid, Sjanger sjanger) {
		this.tittel = tittel;
		this.tid = tid;
		this.sjanger = sjanger;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setGenre(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	public void skrivUt() {
		System.out.println("Tittel: " + tittel);
		System.out.println("Tid   : " + tid);
		System.out.println("Genre : " + sjanger);
	}
}
