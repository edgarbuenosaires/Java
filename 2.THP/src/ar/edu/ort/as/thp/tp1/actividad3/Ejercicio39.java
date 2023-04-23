package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio39 {
	final static Scanner input = new Scanner(System.in);
	final static int MIN_JUGADORES = 2;

	public static void main(String[] args) {
		// Variables:
		int jugadores, jugador = 1, ptos, tiro, acumPtos, dist, acumCentro = 0, mayorPtos = 0;
		String nom, ganador = "";

		do {
			System.out.print("Nro de jugadores (minimo 2) ");
			jugadores = Integer.parseInt(input.nextLine());
		} while (jugadores < MIN_JUGADORES);

		while (jugador <= jugadores) {
			System.out.print("Nombre del jugador " + jugador + ": ");
			nom = input.nextLine().trim();
			tiro = 1;
			acumPtos = 0;
			ptos = 0;
			do {
				do {
					System.out.print("Distancia del tiro nro " + tiro + ": ");
					dist = Integer.parseInt(input.nextLine());
				} while (dist < 0);

				if (dist == 0) {
					ptos = 500;
					acumCentro++;
				} else if (dist >= 1 && dist <= 10) {
					ptos = 250;
				} else if (dist >= 11 && dist <= 50) {
					ptos = 100;
				} else {
					ptos = 0;
					System.out.println("Fuera del tablero");
				}
				acumPtos = acumPtos + ptos;
				tiro++;
			} while (tiro <= 3);
			if (acumPtos > mayorPtos) {
				ganador = nom;
				mayorPtos = acumPtos;
			}
			jugador++;
		}

		// Muestro por pantalla:
		System.out.println("JUEGO TIRO AL BLANCO");
		System.out.println("Ganador: " + ganador);
		System.out.println("Ptos totales: " + mayorPtos);
		System.out.println("La cantidad de tiros al centro de los " + jugadores + " jugadores fue: " + acumCentro);
		input.close();
	}

}
