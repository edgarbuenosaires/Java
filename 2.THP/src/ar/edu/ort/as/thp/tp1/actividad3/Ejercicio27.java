package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio27 {

	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables:
		int edad, acumEdades = 0, acumImparesMas18 = 0;

		// Ciclo de pedidos por teclado
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese la edad Nro " + i);
			edad = Integer.parseInt(input.nextLine());
			acumEdades = acumEdades + edad;
			if ((edad % 2 != 0) && (edad > 18)) {
				acumImparesMas18++;
			}

		}
		// Muestro por pantalla:
		System.out.println("El promedio de las edades ingresadas es " + (double) (acumEdades / 5));
		System.out.println("Las edades impares mayores de 18 fueron: " + acumImparesMas18);
		input.close();
	}

}
