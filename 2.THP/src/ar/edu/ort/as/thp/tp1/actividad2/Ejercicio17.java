package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 120;
		final int EDAD_JUBIL_MASC = 65;
		final int EDAD_JUBIL_FEM = 60;
		int edad;
		char genero;
		boolean esEdadValida;
		boolean esGeneroValido;
		boolean puedeJubilarseFemenino;
		boolean puedeJubilarseMasculino;

		// Se solicita ingresar datos

		System.out.println("Ingrese su edad (entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + ")");
		edad = Integer.parseInt(input.nextLine());

		// Se valida la edad:
		esEdadValida = edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA;

		if (esEdadValida) {
			System.out.println("Ingrese el genero ('m') Masculino o ('f') Femenino");
			// El lower case convierne cualquier caracter en minuscula
			// El trim, saca todos los espacios vacios
			genero = input.nextLine().toLowerCase().trim().charAt(0);
			esGeneroValido = (genero == 'f' || genero == 'm');
			if (esGeneroValido) {
				puedeJubilarseFemenino = (genero == 'f' && edad >= EDAD_JUBIL_FEM);
				puedeJubilarseMasculino = (genero == 'm' && edad >= EDAD_JUBIL_MASC);
				if (puedeJubilarseFemenino || puedeJubilarseMasculino) {
					System.out.println("Puede jubilarse");

				} else {
					System.out.println("A seguir trabajando");
				}
			} else {
				System.out.println("Genero invalido");
			}
		} else {
			System.out.println("Edad fuera de rango");
		}


		input.close();
	}

}
