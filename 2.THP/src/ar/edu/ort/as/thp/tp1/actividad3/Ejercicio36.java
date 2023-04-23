package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio36 {
	final static Scanner input = new Scanner(System.in);
	final static int TOPE = 20;

	public static void main(String[] args) {
		// Variables:
		int num, cant = 0, suma = 0;

		// Ciglo y calculos:
		do {
			System.out.println("Numero:");
			num = Integer.parseInt(input.nextLine());
			cant++;
			suma = suma + num;
		} while ((suma / cant) < TOPE);
		System.out.println("La cantidad de numeros fue: " + cant);
		input.close();
	}

}
