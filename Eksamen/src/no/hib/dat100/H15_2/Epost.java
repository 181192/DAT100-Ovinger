package no.hib.dat100.H15_2;

public class Epost {
	private String til;
	private String fra;
	private String innhold;
	
	

	public Epost(String til, String fra, String innhold) {
		this.til = til;
		this.fra = fra;
		this.innhold = innhold;
	}

	public String getTil() {
		return til;
	}

	public void setTil(String til) {
		this.til = til;
	}

	public String getFra() {
		return fra;
	}

	public void setFra(String fra) {
		this.fra = fra;
	}

	public String getInnhold() {
		return innhold;
	}

	public void setInnhold(String innhold) {
		this.innhold = innhold;
	}

}
