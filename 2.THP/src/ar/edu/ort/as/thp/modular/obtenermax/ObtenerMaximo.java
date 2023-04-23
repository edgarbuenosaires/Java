package ar.edu.ort.as.thp.modular.obtenermax;

import java.util.Scanner;

public class ObtenerMaximo {
	private final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int maximo;
		int entreRangos;

		numero1 = pedirNumeroPositivo("Ingrese el 1er numero:");
		numero2 = pedirNumeroPositivo("Ingrese el 2do numero:");
		maximo = dameMaximo(numero1, numero2);
		mostrarMaximo(maximo);
		entreRangos = pedirNumeroEntreRango("Ingrese un numero entre ", 10, 30);
		System.out.println("El numero entre rangos: " + entreRangos);
		input.close();
	}

	public static int pedirNumeroPositivo(String mensaje) {
		int numero;
		do {
			numero = pedirNumero(mensaje);
		} while (numero <= 0);
		return numero;
	}

	public static int pedirNumero(String mensaje) {
		int num;
		System.out.println(mensaje);
		num = Integer.parseInt(input.nextLine());
		return num;
	}

	public static int pedirNumeroEntreRango(String mensaje, int desde, int hasta) {
		int num;
		do {
			num = pedirNumero(mensaje + desde + " y " + hasta);
		} while (num < desde || num > hasta);
		return num;
	}

	public static int dameMaximo(int num1, int num2) {
		int max;
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		return max;
	}

	public static void mostrarMaximo(int maximo) {
		System.out.println("El maximo es: " + maximo);
	}
}