package no.hib.dat100.H13_Oppgave_4;

public class Dato {
	private int dag;
	private int mnd;
	private int aar;

	public Dato(int dag, int mnd, int aar) {
		this.dag = dag;
		this.mnd = mnd;
		this.aar = aar;
	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMnd() {
		return mnd;
	}

	public void setMnd(int mnd) {
		this.mnd = mnd;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}
	
	public boolean paaEllerEtter(Dato d) {
		return true;
	}
	
	public boolean paaEllerFoer(Dato d) {
		return true;
	}

}
