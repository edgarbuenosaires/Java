package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Variables
		String socio1, socio2, socio3;
		double aporte1, aporte2, aporte3, capital, porcentajeSocio1, porcentajeSocio2, porcentajeSocio3;

		// Se solicitan ingesar datos
		System.out.println("Ingrese el nombre del 1er socio");
		socio1 = input.nextLine();
		System.out.println("Ingrese el nombre del 2do socio");
		socio2 = input.nextLine();
		System.out.println("Ingrese el nombre del 3er socio");
		socio3 = input.nextLine();
		System.out.println("Ingrese el capital integrado por " + socio1);
		aporte1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el capital integrado por " + socio2);
		aporte2 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el capital integrado por " + socio3);
		aporte3 = Double.parseDouble(input.nextLine());

		// Calculos
		capital = aporte1 + aporte2 + aporte3;
		porcentajeSocio1 = aporte1 * 100 / capital;
		porcentajeSocio2 = aporte2 * 100 / capital;
		porcentajeSocio3 = aporte3 * 100 / capital;

		// Se muestra por pantalla
		System.out.println("El total del capital aportado es " + capital);
		System.out.println(socio1 + " aporto el " + porcentajeSocio1 + " %");
		System.out.println(socio2 + " aporto el " + porcentajeSocio2 + " %");
		System.out.println(socio3 + " aporto el " + porcentajeSocio3 + " %");
		input.close();
	}

}
