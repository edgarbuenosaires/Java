package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio25 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables:
		int ancho, alto;
		int i = 0;
		int a = 1;

		// Se solicitan los ingresos
		do {
			System.out.println("Ingrese el ancho de la matriz");
			ancho = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese el alto de la matriz");
			alto = Integer.parseInt(input.nextLine());
		} while (ancho < 1 || alto < 1);

		// Se dibuja la matriz:
		while (i < alto) {
			a = 1;
			while (a <= ancho) {
				System.out.print("X ");
				a++;
			}
			System.out.println("");
			i++;
		}
		input.close();
	}

}
