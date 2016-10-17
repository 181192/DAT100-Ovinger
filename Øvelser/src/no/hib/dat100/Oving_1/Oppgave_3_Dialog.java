package no.hib.dat100.Oving_1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Oppgave_3_Dialog {

	
	public static void main(String[] args) {
		String melding = "";
		String totalsekTxt = showInputDialog("Oppgi antall sekunder");
		int sekunder = parseInt(totalsekTxt);
		int totalsekunder = sekunder;
		int timer = sekunder / 3600;
		int minutter = (sekunder % 3600) / 60;
		sekunder = sekunder % 60;
		
		melding =(totalsekunder + " sekunder er: "+ "\n" + timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder");		
		
		
		showMessageDialog(null, melding);
	}

}
