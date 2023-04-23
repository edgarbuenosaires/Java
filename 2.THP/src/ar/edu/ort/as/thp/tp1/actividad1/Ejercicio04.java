package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		double valHora, horasDia, totalHoras;

		// Se solicitan ingresos
		System.out.println("Ingrese el valor de la hora de trabajo");
		valHora = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese la cantidad de horas por dia");
		horasDia = Double.parseDouble(input.nextLine());

		// Calculos
		totalHoras = horasDia * 5 + horasDia / 2;

		// Se muestra por pantalla
		System.out.println("El valor del salario semanal es " + (totalHoras * valHora));
		input.close();
	}

}
