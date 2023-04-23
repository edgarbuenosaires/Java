package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nombre;

		int edad;
		double importe;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Bienvenid@ " + nombre);

		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Su edad es: " + edad + " anios");

		System.out.println("Ingrese el dinero que tiene en su billetera");
		importe = Double.parseDouble(input.nextLine());
		System.out.println("Usted tiene $" + importe + ".");
		input.close();

	}

}
