package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio26 {
	final static int MULTIPLO = 3;
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		int natural, muestro = 1, cont = 1;
		int i = 0;

		// Se solicita ingreso
		do {
			System.out.println("Ingrese un numero natural");
			natural = Integer.parseInt(input.nextLine());
		} while (natural < 0);

		// Se muestran los multiplos

		while (i < natural) {
			muestro = cont * MULTIPLO;
			if (muestro % 5 != 0) {
				System.out.println(muestro);
				i++;
			}
			cont++;
		}
		input.close();
	}

}
