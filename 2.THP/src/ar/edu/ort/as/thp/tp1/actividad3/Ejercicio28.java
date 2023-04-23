package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio28 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		int cant, var = 1, valor = 0, numMayor = 0, orden = 0;

		// Se solicita ingreso por teclado
		System.out.println("Cual es la cantidad de numeros a ingresar?");
		cant = Integer.parseInt(input.nextLine());

		// Ciclo de ingreso
		while (var <= cant) {
			System.out.print("Ingrese el nro." + var+": ");
			valor = Integer.parseInt(input.nextLine());
			if (numMayor < valor) {
				numMayor = valor;
				orden = var;
			}
			var++;
		}
		System.out.println("El mayor valor ingresado fue: " + numMayor);
		System.out.println("El valor ingreso en la posicion " + orden);
		input.close();
	}

}
