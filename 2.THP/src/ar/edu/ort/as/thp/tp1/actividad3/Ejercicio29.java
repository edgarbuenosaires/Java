package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio29 {
	final static Scanner input = new Scanner(System.in);
	final static int NOTA_MIN = 0;
	final static int NOTA_MAX = 10;

	public static void main(String[] args) {
		// Variables:
		int nota;
		
		do {
			System.out.println("Ingrese la nota del examen: ");
			nota = Integer.parseInt(input.nextLine());

		} while (nota < NOTA_MIN || nota > NOTA_MAX);
		System.out.println("La nota " + nota + " es VALIDA.");
		input.close();
	}

}
