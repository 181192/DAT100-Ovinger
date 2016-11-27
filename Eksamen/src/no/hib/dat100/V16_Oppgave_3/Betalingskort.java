package no.hib.dat100.V16_Oppgave_3;

import java.util.Calendar;

public abstract class Betalingskort {
	private String navn;
	private int aar;
	private int mnd;
	private double saldo;

	public Betalingskort(String navn, int aar, int mnd, double saldo) {
		this.navn = navn;
		this.aar = aar;
		this.mnd = mnd;
		this.saldo = saldo;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAar() {
		return aar;
	}

	public void setAar(int aar) {
		this.aar = aar;
	}

	public int getMnd() {
		return mnd;
	}

	public void setMnd(int mnd) {
		this.mnd = mnd;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void innskudd(double belop) {
		this.saldo = saldo + belop;
	}

	public boolean erGyldig() {
		boolean tilstand = false;

		Calendar c = Calendar.getInstance();
		int m = c.get(Calendar.MONTH);
		int y = c.get(Calendar.YEAR);
		
		if (y < aar || y == aar && m + 1 <= mnd) {
			tilstand = true;
		}
		return tilstand;
	}

	public abstract boolean dekning(double belop);
	
	public boolean trekk(double belop) {
		boolean tilstand = false;
		if (dekning(belop) && erGyldig()) {
			saldo = saldo - belop;
			tilstand = true;
		}
		return tilstand;
	}

}
