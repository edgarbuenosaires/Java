package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class ORTKarts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TOPE_VUELTAS = 5;
		final char VERDE = 'V';
		final char ROJO = 'R';
		final char FIN = 'F';
		char colorKarting;
		int cantVecesPianitoEnVuelta;
		boolean colorValido;
		int cantVueltasV = 0;
		int cantPianitoV = 0;
		int cantVueltasR = 0;
		int cantPianitoR = 0;
		double promedioV;
		double promedioR;
		String mensaje;
		System.out.println("\"Bienvenidos a ORTKarts!");

		do {
			System.out.println("Ingrese el color del karting:");
			colorKarting = input.nextLine().trim().toUpperCase().charAt(0);
			colorValido = (colorKarting == ROJO) || (colorKarting == VERDE) || (colorKarting == FIN);
		} while (!colorValido);

		while ((colorKarting != FIN) && (cantVueltasV < TOPE_VUELTAS) && (cantVueltasR < TOPE_VUELTAS)) {
			do {
				System.out.println("Ingrese la cantidad de veces que piso el pianito: ");
				cantVecesPianitoEnVuelta = Integer.parseInt(input.nextLine());
			} while (cantVecesPianitoEnVuelta < 0);

			if (colorKarting == VERDE) {
				cantVueltasV++;
				cantPianitoV += cantVecesPianitoEnVuelta;
			} else {
				cantVueltasR++;
				cantPianitoR += cantVecesPianitoEnVuelta;
			}

			if ((cantVueltasV != TOPE_VUELTAS) && (cantVueltasR != TOPE_VUELTAS)) {
				do {
					System.out.println("Ingrese el color del karting:");
					colorKarting = input.nextLine().trim().toUpperCase().charAt(0);
					colorValido = (colorKarting == ROJO) || (colorKarting == VERDE) || (colorKarting == FIN);
				} while (!colorValido);
			}
		}

		input.close();
		
		if (colorKarting == FIN) {
			mensaje = "Carrera INDEFINIDA!";
		} else if (cantVueltasV > cantVueltasR) {
			mensaje = "Gano el VERDE!";
		} else {
			mensaje = "Gano el ROJO!";
		}

		System.out.println(mensaje);
		if (cantVueltasV > 0) {
			promedioV = (double)cantPianitoV/cantVueltasV;
		} else {
			promedioV = 0;
		}
		if (cantVueltasR > 0) {
			promedioR = (double)cantPianitoR/cantVueltasR;
		} else {
			promedioR = 0;
		}
		if (promedioV != promedioR) {
			if (promedioV < promedioR) {
				mensaje = "El karting verde en promedio piso menos veces el pianito";
			} else {
				mensaje = "El karting rojo en promedio piso menos veces el pianito";
			}
		} else {
			mensaje = "Ambos tuvieron el mismo promedio de veces que pisaron el pianito.";
		}
		System.out.println(mensaje);
	}
}
