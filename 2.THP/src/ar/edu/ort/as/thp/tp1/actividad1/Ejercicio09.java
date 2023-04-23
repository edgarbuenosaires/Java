package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int angulo1, angulo2, angulo3;

		// Se pide ingreso de datos
		System.out.println("Ingrese los grados del 1er angulo ");
		angulo1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese los grados del 2do angulo ");
		angulo2 = Integer.parseInt(input.nextLine());

		// Condicion
		if ((angulo1 + angulo2) < 180) {
			angulo3 = 180 - angulo1 - angulo2;
			System.out.println("Los grados del 3er angulo son " + angulo3);
		} else {
			System.out.println("Los valores ingresados no son correctos");
		}

		input.close();

	}

}
