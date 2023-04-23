package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio31 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables:
		char eleccion;

		// Desarrollo con While
		System.out.println("CICLO UTILIZANDO WHILE");
		System.out.println("Desea continuar? [S/N]");
		eleccion = input.nextLine().trim().toLowerCase().charAt(0);
		while (eleccion != 's' && eleccion != 'n') {
			System.out.println("Opcion no valida. Desea continuar? [S/N]");
			eleccion = input.nextLine().trim().toLowerCase().charAt(0);
		}
		if (eleccion == 's') {
			System.out.println("Programa en ejecucion.");
		} else {
			System.out.println("Usted ha abandonado el sistema");
		}

		// Desarrollo cn Do While
		System.out.println("CICLO UTILIZANDO DO WHILE");
		do {
			System.out.println("Desea continuar? [S/N]");
			eleccion = input.nextLine().trim().toLowerCase().charAt(0);
		} while (eleccion != 's' && eleccion != 'n');
		if (eleccion == 's') {
			System.out.println("Programa en ejecucion.");
		} else {
			System.out.println("Usted ha abandonado el sistema");
		}
		input.close();
	}

}
