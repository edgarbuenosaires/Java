package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		String nombre;
		int edad;
		double altura;

		// Solicito ingreso
		System.out.println("Por favor, ingrese el nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese la edad de " + nombre);
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la altura de " + nombre);
		altura = Double.parseDouble(input.nextLine());

		// Calculo y condiciones
		if ((edad > 6) || (altura > 1.50)) {
			System.out.println(nombre + " puede ingresar a Miedo a las Alturas.");
		} else {
			System.out.println(nombre + " No puede ingresar a la montana rusa.");
		}
		input.close();
	}

}
