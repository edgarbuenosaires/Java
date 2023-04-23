package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio38bis {
	final static Scanner input = new Scanner(System.in);
	final static String USUARIO = "admin";
	final static String PASSWORD = "123456";
	final static int INTENTOS = 3;

	public static void main(String[] args) {
		// Variables:
		String ingreso;
		String clave;
		int intento = 1;
		boolean usuarioCorrecto;

		do {
			System.out.println("Intento: " + intento);
			System.out.println("Por favor, ingrese su usuario");
			ingreso = input.nextLine();
			System.out.println("Ingrese la password:");
			clave = input.nextLine();
			usuarioCorrecto = ingreso.equals(USUARIO) && clave.equals(PASSWORD);

			if (usuarioCorrecto) {
				System.out.println("Bienvenido");
			} else {
				if (intento <= INTENTOS) {
					System.out.println("Usuario o password incorrectas");
				} else {
					System.out.println("USUARIO BLOQUEADO");
				}
			}
			intento++;
		} while (!usuarioCorrecto && intento <= INTENTOS);

		input.close();
	}

}