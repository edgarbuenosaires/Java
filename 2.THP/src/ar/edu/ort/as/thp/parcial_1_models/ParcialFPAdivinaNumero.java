package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class ParcialFPAdivinaNumero {
	final static Scanner input = new Scanner(System.in);
	final static int TOPE_MINIMO = 1;
	final static int TOPE_MAXIMO = 10;

	public static void main(String[] args) {
		// Variables
		String jugadorA;
		String jugadorB;
		int rondasTotales;
		int ronda = 0;
		int numero;
		int numJugA;
		int numJugB;
		boolean hayAcierto = false;

		// Solicito jugadores:
		do {
			System.out.println("Nombre jugador 1");
			jugadorA = input.nextLine();
		} while (jugadorA.isEmpty());
		do {
			System.out.println("Nombre jugador 2");
			jugadorB = input.nextLine();
		} while (jugadorB.isEmpty());
		do {
			System.out.println("Nro de rondas:");
			rondasTotales = Integer.parseInt(input.nextLine());
		} while (rondasTotales < 1);

		do {
			ronda++;
			System.out.println("RONDA NUMERO: " + ronda);
			numero = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
			do {
				System.out.println(jugadorA + " elige un numero entre 1 y 10: ");
				numJugA = Integer.parseInt(input.nextLine());
			} while (numJugA < TOPE_MINIMO || numJugA > TOPE_MAXIMO);
			do {
				System.out.println(jugadorB + " elige un numero entre 1 y 10: ");
				numJugB = Integer.parseInt(input.nextLine());
			} while (numJugB < TOPE_MINIMO || numJugB > TOPE_MAXIMO);
			if (numero == numJugA && numero == numJugB) {
				System.out.println("Hay empate");
				hayAcierto = true;
			} else if (numero == numJugA) {
				System.out.println("Gano " + jugadorA);
				hayAcierto = true;
			}else if (numero==numJugB){
				System.out.println("Gano "+jugadorB);
				hayAcierto=true;
			}else{
				System.out.println("Ninguno acerto.");
			}
			System.out.println("El numero elegido era " + numero);
		} while (!hayAcierto && ronda < rondasTotales);

		input.close();
	}

}
