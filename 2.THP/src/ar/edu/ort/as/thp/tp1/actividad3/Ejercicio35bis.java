package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio35bis {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Vzriables:
		int edad, edadMin = Integer.MIN_VALUE, cantPersonas = 0;
		String nombre, nombreMin = null;

		do {
			System.out.println("Ingrese un nombre");
			nombre = input.nextLine();
		} while (nombre.equals(" "));

		while (!nombre.equals("*")) {
			cantPersonas++;
			do {
				System.out.println("Ingrese la edad");
				edad = Integer.parseInt(input.nextLine());
			} while (edad < 0);
			if (cantPersonas == 1 || edad < edadMin) {
				edadMin = edad;
				nombreMin = nombre;
			}
			do {
				System.out.println("Ingrese un nombre");
				nombre = input.nextLine();
			} while (nombre.equals(" "));
		}
		if (cantPersonas > 0) {
			System.out.println("La persona mas joven se llama " + nombreMin + " y tiene " + edadMin + " anos.");
		} else {
			System.out.println("No ingreso ninguna persona.");
		}
		input.close();
	}

}
