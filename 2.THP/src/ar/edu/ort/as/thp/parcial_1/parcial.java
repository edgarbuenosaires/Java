package ar.edu.ort.as.thp.parcial_1;

import java.util.Scanner;

public class parcial {
	final static Scanner input = new Scanner(System.in);
	final static String MAYOR = "MA";
	final static String MENOR = "ME";
	final static String IGUAL = "IG";
	final static int TOPE_MINIMO = 1;
	final static int TOPE_MAXIMO = 1000;

	public static void main(String[] args) {
		// Variables:
		int numero;
		int numeroSiguiente;
		int acumAcierto = 0;
		String opElegida;
		boolean opCorrecta;
		boolean coincidencia;
		boolean esIgual;
		boolean esMayor;
		boolean esMenor;

		// Se genera el primer valor aleatorio		
		numero = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
		System.out.println("Mi primer numero fue el " + numero);
		do {
			do {
				System.out.println("Como sera el proximo numero respecto a este? ([MA]yor, [ME]nor o [IG]ual)");
				opElegida = input.nextLine().trim().toUpperCase();
				opCorrecta = opElegida.equals(MAYOR) || opElegida.equals(MENOR) || opElegida.equals(IGUAL);
			} while (!opCorrecta);
			// Se genera el siguiente valor aleatorio
			numeroSiguiente = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
			
			// Se restaura el valor false a las booleanas, para evitar errores de arrastre. 
			coincidencia = false;
			esIgual = false;
			esMayor = false;
			esMenor = false;
			if (numero == numeroSiguiente) {
				esIgual = true;
				System.out.println("Mi numero actual es el " + numeroSiguiente + ". Igual al numero anterior.");

			} else if (numero > numeroSiguiente) {
				esMenor = true;
				System.out.println("Mi numero actual es el " + numeroSiguiente + ". Menor al numero anterior.");

			} else {
				esMayor = true;
				System.out.println("Mi numero actual es el " + numeroSiguiente + ". Mayor al numero anterior.");
			}

			switch (opElegida) {
			case MAYOR:
				if (esMayor) {
					coincidencia = true;
					acumAcierto++;
					System.out.println("Acertaste!");
				}
				break;

			case MENOR:
				if (esMenor) {
					coincidencia = true;
					acumAcierto++;
					System.out.println("Acertaste!");
				}
				break;
			case IGUAL:
				if (esIgual) {
					coincidencia = true;
					acumAcierto++;
					System.out.println("Acertaste!");
				}
				break;
			}
			numero = numeroSiguiente;
		} while (coincidencia);
		System.out.println("Perdiste. Acertaste durante " + acumAcierto + " rondas!");
		input.close();
	}

}
