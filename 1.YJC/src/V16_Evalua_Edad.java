import java.util.Scanner;

public class V16_Evalua_Edad {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad, por favor");
		int edad = entrada.nextInt();

		// If else compara entre mayor y menor de edad

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		// IF else if compara entre 4 situaciones

		if (edad < 18) {
			System.out.println("Eres un adolecente");
		} else if (edad < 40) {
			System.out.println("Eres un joven");
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		} else {
			System.out.println("Cuidate");
		}
		entrada.close();
	}
}
