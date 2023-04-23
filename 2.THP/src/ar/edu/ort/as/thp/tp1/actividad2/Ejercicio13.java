package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio13 {

	/*
	 * Realizá un programa para ingresar tres números enteros e indique cuál de
	 * ellos es el mayor y su valor. [EC]
	 */
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables:
		int num1, num2, num3, mayor = 0;
		String orden;

		// Solicito los datos:
		System.out.println("Ingrese un 1er valor:");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el 2do valor:");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el 3er valor");
		num3 = Integer.parseInt(input.nextLine());

		// Calculos;
		if (num1 > num2 & num1 > num3) {
			mayor = num1;
			orden = "1er";
		} else if (num2 > num3) {
			mayor = num2;
			orden = "2do";
		} else {
			mayor = num3;
			orden = "3er";
		}

		// Muestro por pantalla:
		System.out.println("El mayor numero es " + mayor + " y corresponde al " + orden + " valor.");

		input.close();

	}

}
