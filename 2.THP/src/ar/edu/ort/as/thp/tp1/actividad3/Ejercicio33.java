package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio33 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables:
		int num, numMax = Byte.MIN_VALUE, numMin = Byte.MAX_VALUE;

		// Ciclo y calculos
		do {
			System.out.println("Ingrese numero: ");
			num = Integer.parseInt(input.nextLine());

			if (num > numMax) {
				numMax = num;
			}
			if (num < numMin) {
				numMin = num;
			}
		} while (num != 0);
		System.out.println("El mayor valor fue: " + numMax);
		System.out.println("EL menor valor fue: " + numMin);

		input.close();

	}

}
