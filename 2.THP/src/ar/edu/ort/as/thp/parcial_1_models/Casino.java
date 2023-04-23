package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class Casino {
	final static Scanner input = new Scanner(System.in);
	final static double MONTO_MAXIMO = 5000;
	final static double VALOR_RUL = 100;
	final static double VALOR_BJK = 200;
	final static double VALOR_PKR = 500;
	final static char RUL = 'R';
	final static char BJK = 'B';
	final static char PKR = 'P';
	final static double PORC_MIN = 0.2;
	final static double MONTO_MIN = 500;
	final static int GANO = 2;
	final static int EMPATO = 1;
	final static int PERDIO = 0;

	public static void main(String[] args) {
		
		String nombre;
		double montoInicial;
		boolean llegoAlMinimo;
		boolean puedeJugarAlgunJuego;
		boolean llegoAlMaximo;
		double montoMinimo;
		double montoRestante;
		boolean esJuegoValido;
		boolean alcanzaMonto;
		char juegoActual;
		double costoJuego = 0;
		int resultadoJuego;
		double multiplicadorJuego = 0;
		int contRUL = 0;
		int contBJK = 0;
		int contPKR = 0;
		int cantTotal;
		double porcRUL;
		double porcBJK;
		double porcPKR;
		char respuesta;
		boolean sigueJugando;
		boolean respuestaValida;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();

		do {
			System.out.println("Ingrese el monto inicial");
			montoInicial = Double.parseDouble(input.nextLine());
		} while (montoInicial < MONTO_MIN);

		montoMinimo = montoInicial * PORC_MIN;
		montoRestante = montoInicial;

		do {

			do {
				esJuegoValido = true;
				alcanzaMonto = true;
				System.out.println("Seleccione el juego que desea jugar (R=Ruleta, B=Blackjack, P=Poker):");
				juegoActual = input.nextLine().trim().toUpperCase().charAt(0);

				switch (juegoActual) {
				case RUL:
					costoJuego = VALOR_RUL;
					break;
				case BJK:
					costoJuego = VALOR_BJK;
					break;
				case PKR:
					costoJuego = VALOR_PKR;
					break;
				default:
					esJuegoValido = false;
				}

				if (esJuegoValido) {
					System.out.println("Valor de juego: " + costoJuego);
					if (montoRestante < costoJuego) {
						alcanzaMonto = false;
						System.out.println("No le alcanza el dinero para este juego.");
					}
				} else {
					System.out.println("Juego invalido.");
				}

			} while (!esJuegoValido || !alcanzaMonto);

			switch (juegoActual) {
			case RUL:
				contRUL++;
				break;
			case BJK:
				contBJK++;
				break;
			case PKR:
				contPKR++;
				break;
			}

			montoRestante = montoRestante - costoJuego;
			resultadoJuego = obtenerResultadoJuego();

			switch (resultadoJuego) {
			case GANO:
				System.out.println("Gana");
				multiplicadorJuego = GANO;
				break;
			case EMPATO:
				System.out.println("Empata");
				multiplicadorJuego = EMPATO;
				break;
			case PERDIO:
				System.out.println("Pierde");
				multiplicadorJuego = PERDIO;
				break;
			}

			montoRestante = montoRestante + costoJuego * multiplicadorJuego;
			System.out.println("Monto Actual: $" + montoRestante);

			llegoAlMinimo = (montoRestante < montoMinimo);
			puedeJugarAlgunJuego = (montoRestante > VALOR_RUL || 
								    montoRestante > VALOR_BJK || 
								    montoRestante > VALOR_PKR);

			llegoAlMaximo = ((montoRestante - montoInicial) >= MONTO_MAXIMO);

			//Agregado para que le pregunte al jugador si quiere seguir jugando o no
			do {
				System.out.println("¿Desea seguir jugando (S/N)?");
				respuesta = input.nextLine().trim().toUpperCase().charAt(0);
				respuestaValida = (respuesta == 'S' || respuesta == 'N');
			} while (!respuestaValida);
			sigueJugando = (respuesta == 'S');
			//Hasta aca

		} while (!llegoAlMinimo && puedeJugarAlgunJuego && !llegoAlMaximo && sigueJugando);
		
		System.out.println(nombre + " se quedo con $" + montoRestante + " restante al terminar de jugar");
		System.out.println("Cantidad de veces que jugo Ruleta: " + contRUL + " - Cantidad de veces que jugo Blackjack: " + contBJK + " - Cantidad de veces que jugo Poker: " + contPKR);
		cantTotal = contRUL + contBJK + contPKR;
		porcRUL = contRUL * 100 / cantTotal;
		porcBJK = contBJK * 100 / cantTotal;
		porcPKR = contPKR * 100 / cantTotal;
		System.out.println("Porcentaje Ruleta: " + porcRUL + " - Porcentaje Blackjack: " + porcBJK + " - Porcentaje Poker: " + porcPKR);
	}

	private static int obtenerResultadoJuego() {
		/*
		0.3 * 3 = 0.9 => (int): 0
		0.6 * 3 = 1.8 => (int): 1
		0.9 * 3 = 2.7 => (int): 2
		*/
		return (int)(Math.random() * 3);
		//return 0;
	}
}
