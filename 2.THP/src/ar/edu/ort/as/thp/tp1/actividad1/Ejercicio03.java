package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		int num;
		double division;

		// Se solicita ingreso
		System.out.println("Por favor, ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());

		// Se realizan los calculos y se muestra por pantalla
		System.out.println(num + " multriplicado por 5 es " + num * 5);
		division = (double) num / 2;
		System.out.println(num + " dividido por 2 es " + division);

		input.close();
	}
}
