package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * Realizá un programa que permita ingresar dos números enteros e indique
	 * cuál de ellos es el mayor. [EC]
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Variables:
		int num1, num2, mayor;

		// Se solicita ingresar datos:

		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro numero");
		num2 = Integer.parseInt(input.nextLine());

		// Condicion
		if (num1 > num2) {
			mayor = num1;
		} else {
			mayor = num2;
		}

		// Muestro por pantalla:
		System.out.println("El mayor del los numeros ingresados es " + mayor);
		input.close();

	}

}
