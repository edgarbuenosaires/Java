package ar.edu.ort.as.thp.tp1.actividad3;

import java.util.Scanner;

public class Ejercicio30 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		char operacion;
		boolean salida = false;
		boolean operacionCorrecta;
		double num1, num2, resul;

		while (!salida) {
			do {
				System.out.println("Operacion a realizar: '+' '-' '*' '/' 'f'(para finalizar)");
				operacion = input.nextLine().trim().toLowerCase().charAt(0);
				operacionCorrecta = (operacion == '+' || operacion == '-' || operacion == '/' || operacion == '*'
						|| operacion == 'f');
				;
			} while (!operacionCorrecta);

			if (operacion != 'f') {
				System.out.println("Ingrese el 1er valor");
				num1 = Double.parseDouble(input.nextLine());
				System.out.println("Ingrese el 2do valor");
				num2 = Double.parseDouble(input.nextLine());

				switch (operacion) {
				case '+':
					resul = num1 + num2;
					System.out.println("La suma es: " + resul);
					break;

				case '-':
					resul = num1 - num2;
					System.out.println("La resta es: " + resul);
					break;

				case '*':
					resul = num1 * num2;
					System.out.println("La multiplicacion es: " + resul);
					break;

				case '/':
					if (num2 != 0) {
						resul = num1 / num2;
						System.out.println("La division es: " + resul);
					} else {
						System.out.println("ERROR");
					}
					break;
				}
			} else {
				System.out.println("Usted abandono la calcu");
				salida = true;
			}
		}

		input.close();
	}

}
