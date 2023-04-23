package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num1, num2, mayor, menor;

		// Se ingresan datos:
		System.out.println("Ingrese un 1er numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un 2do numero");
		num2 = Integer.parseInt(input.nextLine());

		// Calculo
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}

		// Muestro por pantalla
		if (mayor % menor == 0) {
			System.out.println(mayor + " es divisible por " + menor);
		} else {
			System.out.println(mayor + " NO es divisible por " + menor);
		}
		input.close();
	}

}
