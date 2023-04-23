package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio23 {
	final static int MULTIPLOS = 10;

	public static void main(String[] args) {
		// Scanner:
		Scanner input = new Scanner(System.in);
		// Variables:
		int num, i = 1;

		// Se solicita ingreso:
		System.out.println("Por favor, ingrese un numero entero:");
		num = Integer.parseInt(input.nextLine());

		// Se procesa y muestra por pantalla:
		System.out.println("Los primeros 10 multiplos son:");
		while (i <= MULTIPLOS) {
			System.out.println("El multiplo No " + i + " es: " + (num * i));
			i++;
		}
		input.close();
	}

}
