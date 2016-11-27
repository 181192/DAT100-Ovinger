package no.hib.dat100.H15_5;

public class Graf {
	// matrisen i eksemplet over
	private boolean[][] nabomatrise;

	public Graf(boolean[][] nabomatrise) {
		this.nabomatrise = nabomatrise;
	}
	
	public boolean erNaboer(int u, int w) {
		return nabomatrise[u][w];
	}

	public int grad(int v) {
		int grad = 0;
		
		for (boolean nabo : nabomatrise[v]) {
			if (nabo) {
				grad++;
			}
		}
		return grad;
	}

	public boolean regular(int k) {
		for (int i = 0; i < nabomatrise.length; i++) {
			int grad = grad(i);
			if (grad != k) {
				return false;
			}
		}
		return true;
	}

	public boolean klikk(int[] s) {
		boolean tilstand = true;
		for (int u : s) {
			for (int w : s) {
				if (!erNaboer(u, w) && u != w) {
					tilstand = false;
				}
			}
		}
		return tilstand;
	}

}
