package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio34 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		Double estatura, promedio, sumaEstaturas = 0.0;
		int cuentaJugadores = 0;

		// Ciclo y calculos:
		System.out.println("Estatura del jugador:");
		estatura = Double.parseDouble(input.nextLine());
		while (estatura != 0) {
			sumaEstaturas = sumaEstaturas + estatura;
			cuentaJugadores++;
			System.out.println("Estatura del jugador:");
			estatura = Double.parseDouble(input.nextLine());
		}

		promedio = sumaEstaturas / cuentaJugadores;
		System.out.println("Promedio de estaturas: " + promedio);
		input.close();
	}

}
