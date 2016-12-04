package no.hib.dat100.H13_Oppgave_4;

public class Post {
	private String navn;
	private boolean merkaSti;
	private int kode;

	public Post(String navn, boolean merkaSti, int kode) {
		this.navn = navn;
		this.merkaSti = merkaSti;
		this.kode = kode;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public boolean isMerkaSti() {
		return merkaSti;
	}

	public void setMerkaSti(boolean merkaSti) {
		this.merkaSti = merkaSti;
	}

	public int getKode() {
		return kode;
	}

	public void setKode(int kode) {
		this.kode = kode;
	}
	
	public String utskriftSti(boolean merkaSti) {
		String tekst = "";
		if (merkaSti == true) {
			tekst = ", merka sti";
		} else {
			tekst = ", ikkje merka sti";
		}
		return tekst;
	}

	@Override
	public String toString() {
		return "navn: " + navn + ", kode: " + kode + utskriftSti(merkaSti);
	}

	
}
