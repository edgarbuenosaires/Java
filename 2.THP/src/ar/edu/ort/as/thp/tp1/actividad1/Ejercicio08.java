package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num1, num2, suma, resta, multiplicacion;
		double division;

		// Se solicita ingresos
		System.out.println("Ingrese un 1er numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un 2do numero");
		num2 = Integer.parseInt(input.nextLine());

		// Calculos
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;

		// Se muestra por pantalla
		System.out.println("La suma de los numeros es " + suma);
		System.out.println("La resta de los numeros es " + resta);
		System.out.println("La multiplicacion de los numeros es " + multiplicacion);

		// Se evalua los valores para la division
		if (num2 != 0) {
			division = (double) num1 / (double) num2;
			System.out.println("La division de los numeros es " + division);
		} else {
			System.out.println("No se puede divivir por cero");
		}

		input.close();

	}

}
