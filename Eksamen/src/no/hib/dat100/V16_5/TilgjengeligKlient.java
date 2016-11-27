package no.hib.dat100.V16_5;

public class TilgjengeligKlient {
	public static void main(String[] args) {
		Tilgjengelig tg= new Tilgjengelig();
		
		System.out.println(tg.kan(1, 1));
		tg.skrivUt();
		System.out.println(tg.kanAlle(2));
		System.out.println(tg.foreslaaTidspunkt());
	}
}
