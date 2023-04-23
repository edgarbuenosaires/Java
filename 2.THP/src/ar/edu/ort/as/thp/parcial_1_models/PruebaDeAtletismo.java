package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class PruebaDeAtletismo {
	final static Scanner input = new Scanner(System.in);
	final static int DIA_PRIMERO = 1;
	final static int DIA_ULTIMO = 10;
	final static int TIEMPO_MINIMO = 0;
	final static int TIEMPO_MAXIMO = 100;

	public static void main(String[] args) {
		// Variables:
		int dia;
		double tiempo;
		double tiempoMayor = Double.MIN_VALUE;
		double tiempoMenor = Double.MAX_VALUE;
		boolean tiempoValido;
		int diaMenorTiempo = 0;
		double acumTiempo = 0;
		boolean tiempoMayorAVeinte;
		boolean tiempoMenorAQuince;
		boolean promedioMenorADieciocho;

		// Ciclo exacto
		for (dia = DIA_PRIMERO; dia <= DIA_ULTIMO; dia++) {
			do {
				System.out.println("Tiempo de la prubea dia " + dia);
				tiempo = input.nextDouble();
				tiempoValido = tiempo > TIEMPO_MINIMO && tiempo < TIEMPO_MAXIMO;
			} while (!tiempoValido);
			if (tiempo > tiempoMayor) {
				tiempoMayor = tiempo;
			}
			if (tiempo < tiempoMenor) {
				tiempoMenor = tiempo;
				diaMenorTiempo = dia;
			}
			acumTiempo += tiempo;
		}
		tiempoMayorAVeinte = tiempoMayor > 20;
		tiempoMenorAQuince = tiempoMenor < 15;
		promedioMenorADieciocho = (acumTiempo / DIA_ULTIMO) <= 18;

		if (!tiempoMayorAVeinte && tiempoMenorAQuince && promedioMenorADieciocho) {
			System.out.println("APTO");
			System.out.println("Promedio de tiempo diario: " + acumTiempo / DIA_ULTIMO);
			System.out.println("Dia de menor tiempo: " + diaMenorTiempo);

		} else {
			System.out.println("NO APTO");
		}
		input.close();
	}

}
