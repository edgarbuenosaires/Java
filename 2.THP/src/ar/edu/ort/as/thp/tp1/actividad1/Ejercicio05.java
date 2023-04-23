package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num1, num2, puente;

		// Se ingresan valores
		System.out.println("Ingrese el primer valor ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo valor ");
		num2 = Integer.parseInt(input.nextLine());

		// Se muestra los valores originales
		System.out.println("ORIGINALMENTE, El 1er valor era " + num1 + " y el 2do valor era " + num2);

		// Calculos
		puente = num1;
		num1 = num2;
		num2 = puente;

		// Se muestra los valores invertidos
		System.out.println("AHORA, El 1er valor es " + num1 + " y el 2do valor es " + num2);

		input.close();

	}

}
