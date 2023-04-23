package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables:
		String nombre;
		int edad;
		double altura;

		// Solicito ingresos
		System.out.println("Por favor, ingrese el nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese la edad de " + nombre);
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la altura de " + nombre);
		altura = Double.parseDouble(input.nextLine());

		// Calculos
		if ((edad > 7) && (altura > 1.5)) {
			System.out.println(nombre + " puede ingresar a Infierno en las alturas");
		} else {
			System.out.println(nombre + " NO puede ingresar a la montana rusa.");
		}
		input.close();
	}

}
