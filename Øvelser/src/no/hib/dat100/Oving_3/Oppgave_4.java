package no.hib.dat100.Oving_3;

import easyIO.Out;

public class Oppgave_4 {
	public static void main(String[] args) {
		Out skjerm = new Out();
		int BREDDE1 = 12;
		String linje = "--------------------------------------------";

		double i = 0;
		double y = 0;

		final double pi = Math.PI;
		double radian = (pi * i) / 180;

		double sin = Math.sin(radian);
		double cos = Math.cos(radian);

		skjerm.out("x i grader: ", BREDDE1, Out.LEFT);
		skjerm.out("Radianer: ", BREDDE1, Out.LEFT);
		skjerm.out("sin(x): ", BREDDE1, Out.LEFT);
		skjerm.outln("cos(x): ", BREDDE1, Out.LEFT);
		skjerm.outln(linje);

		while (i <= 180) {
			System.out.printf(" %9.0f ", i);
			System.out.printf(" %8.3f ", radian);
			System.out.printf(" %8.3f ", sin);
			System.out.printf(" %10.3f %n", cos);
			i = i + 15;
			y = y + 15;
			radian = (pi * i) / 180;
			sin = Math.sin(radian);
			cos = Math.cos(radian);
		}

		System.out.println(linje);

	}
}
