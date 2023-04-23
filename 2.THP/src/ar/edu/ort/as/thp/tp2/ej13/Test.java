package ar.edu.ort.as.thp.tp2.ej13;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHeroe superHeroe1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superHeroe2 = new SuperHeroe("Superman", 95, 60, 70);

		System.out.println("BATMAN VS SUPERMAN\n" + superHeroe1.Competir(superHeroe2) + "\nSUPERMAN VS BATMAN\n"
				+ superHeroe2.Competir(superHeroe1) + "\nSUPERMAN VS SUPERMAN\n" + superHeroe2.Competir(superHeroe2));

	}

}
