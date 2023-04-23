package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class PruebaAtletismoBis {
	final static Scanner input = new Scanner(System.in);
	final static int TIEMPO_MENOR = 15;
	final static int TOPE_TIEMPO_PRUEBA = 20;
	final static int TOPE_PROMEDIO = 18;
	final static int TOPE_TIEMPO = 100;
	final static int CANT_DIAS = 5;

	public static void main(String[] args) {
		int tiempoDePrueba;
		int nroDia = 1;
		int totalMinutos = 0;
		boolean esApto = false;
		int minTiempo = TOPE_TIEMPO;

		double promedio = 0;
		int diaDeMenorTiempo = 1;
		boolean esTiempoValido;

		do {
			do {
				System.out.println("Ingresa el tiempo de la prueba del dia: " + nroDia);
				tiempoDePrueba = Integer.parseInt(input.nextLine());
				esTiempoValido = (tiempoDePrueba > 0) && (tiempoDePrueba < TOPE_TIEMPO); 
			} while (!esTiempoValido);

			totalMinutos += tiempoDePrueba;
			//totalMinutos = totalMinutos + tiempoDePrueba;

			if (tiempoDePrueba < minTiempo) {
				minTiempo = tiempoDePrueba;
				diaDeMenorTiempo = nroDia;
			}

			nroDia++;
		} while ((nroDia <= CANT_DIAS) && (tiempoDePrueba <= TOPE_TIEMPO_PRUEBA));

		input.close();

		esApto = (nroDia > CANT_DIAS) && (minTiempo < TIEMPO_MENOR);

		if (esApto) {
			promedio = (double)totalMinutos / CANT_DIAS;
			esApto = promedio <= TOPE_PROMEDIO;
		}

		if (esApto) {
			System.out.println("El dia de menor tiempo fue: " + diaDeMenorTiempo + " con un tiempo de " + minTiempo);
			System.out.println("El atleta ESTA APTO con promedio: " + promedio);
		} else {
			System.out.println("El atleta NO ESTA APTO.");
		}

	}

}