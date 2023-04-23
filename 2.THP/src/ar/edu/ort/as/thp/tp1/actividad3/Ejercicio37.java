package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio37 {
	final static Scanner input = new Scanner(System.in);
	final static int TOTAL_MESES = 12;

	public static void main(String[] args) {
		// Variables:
		int cont = 0;
		Double sueldo = 0.0, sumaSueldos = 0.0;

		// Ciclo y calculos:

		cont++;
		System.out.println("Sueldo del mes: " + cont);
		sueldo = Double.parseDouble(input.nextLine());
		
		
		while (cont < TOTAL_MESES && sueldo > 0) {
			cont++;
			System.out.println("Sueldo del mes: " + cont);
			sueldo = Double.parseDouble(input.nextLine());
			if (sueldo > 0) {
				sumaSueldos = sumaSueldos + sueldo;
			}
		}
		System.out.println("El monto total o parcial percibido: " + sumaSueldos);
		input.close();
	}
}