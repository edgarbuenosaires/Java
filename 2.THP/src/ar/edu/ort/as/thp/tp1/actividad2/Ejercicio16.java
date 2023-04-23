package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int inscriptos, asientos, asientosExtra;

		// Solicito datos:
		System.out.println("Por favor, ingrese la cantidad de inscriptos");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la cantidad de asientos del auditorio");
		asientos = Integer.parseInt(input.nextLine());

		// Calculos y muestro por pantalla
		if (inscriptos < asientos) {
			System.out.println("Los asientos alcanzan para todos los inscriptos");
		} else {
			asientosExtra = inscriptos - asientos;
			System.out.println("Faltan " + asientosExtra + " asientos para cubrir los inscriptos.");
		}
		input.close();
	}

}
