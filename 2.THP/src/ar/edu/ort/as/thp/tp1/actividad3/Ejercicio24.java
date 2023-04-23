package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num1, num2, numDesde, numHasta;

		// Calculos
		do {
			System.out.println("Ingrese un 1er numero");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese un 2do numero");
			num2 = Integer.parseInt(input.nextLine());
			if (num1 > num2) {
				System.out.println("El 1er numero debe ser menor o igual");
			}
		} while (num1 > num2);

		// Se muestra la secuencia INCLUYENDO los num ingresados
		System.out.println("Se muestra la secuencia INCLUYENDO los num ingresados");
		numDesde = num1;
		numHasta = num2;

		while (numDesde <= numHasta) {
			System.out.println(numDesde);
			numDesde++;
		}
		// Se muestra la secuencia EXCLUYENDO los numeros ingresados
		System.out.println("Se muestra la secuencia EXCLUYENDO los numeros ingresados");
		numDesde = num1 + 1;
		while (numDesde < numHasta) {
			System.out.println(numDesde);
			numDesde++;

		}
		input.close();
	}

}
