package no.hib.dat100.Oppgave_1;

public class test {

	public static void Juletre() {
		String mellomrom = " ";
		String tegn = "*";
		int n = 10;
		String space = " ";
			
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j--) {
				;
				System.out.print(tegn + mellomrom);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juletre();

	}
}
