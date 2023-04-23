package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio35 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables:
		String nombre, nomMenEdad = null;
		int edad = 0, edadMenor = Byte.MAX_VALUE;

		// Ciclo y calculos:

		do {
			System.out.println("Nombre:");
			nombre = input.nextLine();
			if (!(nombre.charAt(0) == '*')) {
				System.out.println("Edad:");
				edad = Integer.parseInt(input.nextLine());
				if (edad < edadMenor) {
					nomMenEdad = nombre;
				}
			}
		} while (!(nombre.charAt(0) == '*'));
		System.out.println("El menor es: " + nomMenEdad);
		input.close();
	}

}