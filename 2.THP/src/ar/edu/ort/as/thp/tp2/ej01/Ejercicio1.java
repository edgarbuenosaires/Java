package ar.edu.ort.as.thp.tp2.ej01;

import java.util.Scanner;

public class Ejercicio1 {
	private final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double res;
		int numero1;
		int numero2;
		// Explotacion metodo sumar:
		res = sumar(5, 10);
		System.out.println("El resultado es: " + res);

		res = sumar(53.2, 60.1);
		System.out.println("El resultado es: " + res);

		res = sumar(15, -7);
		System.out.println("El resultado es: " + res);

		// Explotacion metodo pedirNumero:

		numero1 = pedirNumero("Ingrese el 1er numero", 0, 500);
		numero2 = pedirNumero("Ingrese el 2do numero", 0, 400);
		res = sumar(numero1, numero2);
		System.out.println("La suma es " + res);

		input.close();
	}

	public static double sumar(double num1, double num2) {
		double resultado;
		resultado = num1 + num2;
		return resultado;
	}

	public static int pedirNumero(String mensaje, int desde, int hasta) {
		int numero;
		boolean esNumeroValido;
		do {
			System.out.println(mensaje + "(entre " + desde + " y " + hasta + ")");
			numero = Integer.parseInt(input.nextLine());
			esNumeroValido = numero >= desde && numero <= hasta;
		} while (!esNumeroValido);
		return numero;
	}
}
