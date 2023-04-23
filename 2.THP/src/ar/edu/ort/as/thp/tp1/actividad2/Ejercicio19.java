package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;

		// Se ingresan datos
		System.out.println("Ingrese un numero:");
		num = Integer.parseInt(input.nextLine());

		// Calculos y asignaciones
		esDeUnSoloDigito = ((num > -10) && (num < 10));
		esImpar = num % 2 != 0;
		estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		noEstaEnNingunGrupo = !esDeUnSoloDigito && !esImpar;

		// Se muestra por consola
		System.out.println("El numero ingresado es: " + num);
		System.out.println("Es de un solo digito: " + esDeUnSoloDigito);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Esta en ambos grupos: " + estaEnAmbosGrupos);
		System.out.println("No esta en ningun grupo: " + noEstaEnNingunGrupo);

		input.close();
	}

}
