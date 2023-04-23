package ar.edu.ort.as.thp.tp1.actividad2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int dia;

		// Se solicita ingreso de datos
		System.out.println("Ingrese el día de la semana ('1' a '7')");
		dia = Integer.parseInt(input.nextLine());

		switch (dia) {
		case 1:
			System.out.println("El dia es DOMINGO");
			break;

		case 2:
			System.out.println("El dia es LUNES");
			break;

		case 3:
			System.out.println("El dia es MARTES");
			break;

		case 4:
			System.out.println("El dia es MIERCOLES");
			break;

		case 5:
			System.out.println("El dia es JUEVES");
			break;

		case 6:
			System.out.println("El dia es VIERNES");
			break;

		case 7:
			System.out.println("El dia es SABADO");
			break;

		default:
			System.out.println("error");
			break;
		}
		input.close();
	}

}
