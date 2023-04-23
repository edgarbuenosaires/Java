package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Constante
		final double SUELDOFIJO = 44000;

		// Variables
		double ventasTotales, sueldoVariable, sueldoTotal;

		// Se solicita ingreso
		System.out.println("Ingrese las ventas totales del vendedor");
		ventasTotales = Double.parseDouble(input.nextLine());

		// Calculos
		sueldoVariable = (ventasTotales * 16 / 100);
		sueldoTotal = SUELDOFIJO + sueldoVariable;

		// Se muestra por pantalla
		System.out.println("El monto total a cobrar por el vendedor es " + sueldoTotal);

		input.close();

	}

}
