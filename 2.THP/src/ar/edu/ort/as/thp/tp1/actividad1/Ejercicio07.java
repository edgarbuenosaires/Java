package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variables
		double ancho, largo, valorMetroCuadrado, valorTotalTerreno, alambreParaCercar;

		// Scanner
		Scanner input = new Scanner(System.in);

		// Se solicita ingresos
		System.out.println("Ingrese el ancho del terreno");
		ancho = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el largo del terreno");
		largo = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el valor del M2 de tierra");
		valorMetroCuadrado = Double.parseDouble(input.nextLine());

		// Calculos
		valorTotalTerreno = ancho * largo * valorMetroCuadrado;
		alambreParaCercar = ((2 * ancho) + (2 * largo)) * 3;

		// Se muestra por pantalla
		System.out.println("El valor total del terreno es " + valorTotalTerreno);
		System.out.println("Los metros de alambre necesario para cercarlo son " + alambreParaCercar);

		input.close();

	}

}
