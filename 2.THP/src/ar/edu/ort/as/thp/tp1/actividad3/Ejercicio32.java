package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio32 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int nota;
		boolean notaValida;

		// Calculos
		do {
			System.out.println("Nota del examen:");
			nota = Integer.parseInt(input.nextLine());
			notaValida = nota == 0 || nota == 2 || (nota >= 4 && nota <= 10);
		} while (!notaValida);
		System.out.println("La nota " + nota + " es valida.");
		input.close();
	}

}
