package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num1, num2, resultado;
		char operacion;

		// Se ingresan datos
		System.out.println("Ingrese el 1er valor:");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el 2do valor:");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la operacion (+) Suma (-) Resta (*) Multiplicacion (/) Division");
		operacion = input.next().charAt(0);

		// Calculo
		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			System.out.println(num1 + " mas " + num2 + " es: " + resultado);
			break;

		case '-':
			resultado = num1 - num2;
			System.out.println(num1 + " menos " + num2 + " es: " + resultado);
			break;

		case '*':
			resultado = num1 * num2;
			System.out.println(num1 + " por " + num2 + " es: " + resultado);
			break;

		case '/':
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println(num1 + " dividido " + num2 + " es: " + resultado);
			} else {
				System.out.println("No se puede dividir por 0");
			}
			break;
		}

		input.close();
	}

}
