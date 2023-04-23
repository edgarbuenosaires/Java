package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio11 {

	// Realizá un programa que permita ingresar un número entero e indique si se
	// trata de un número par o impar. [EC]

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Variable
		int num;

		// Se solicita ingresar numero
		System.out.println("Ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());

		// Condicion

		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es un numero PAR");
		} else {
			System.out.println("El numero " + num + " es un numero IMPAR");
		}
		input.close();
	}

}
