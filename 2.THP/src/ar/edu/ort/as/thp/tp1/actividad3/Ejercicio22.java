package ar.edu.ort.as.thp.tp1.actividad3;

public class Ejercicio22 {
	final static int INICIO = 1;
	final static int FIN = 5;

	public static void main(String[] args) {
		// Variables
		int num = 0;

		// Ciclo ascendente utilizando FOR
		System.out.println("<<<CICLO ASCENDENTE>>>");
		for (num = INICIO; num <= FIN; num++) {
			System.out.println(num);
		}

		// Ciclo descendente utilizando FOR
		System.out.println("<<<CICLO DESCENDENTE>>>");
		for (num = FIN; num >= INICIO; num--) {
			System.out.println(num);

		}
	}

}
