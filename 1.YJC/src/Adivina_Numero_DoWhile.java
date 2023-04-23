import java.util.Scanner;

public class Adivina_Numero_DoWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int aleatorio = (int) (Math.random() * 100);
		int numero = 0;
		int intentos = 0;
		do {
			intentos++;
			System.out.println("Introduce un numero, por favor:");
			numero = input.nextInt();
			if (aleatorio < numero) {
				System.out.println("Mas bajo");
			} else if (aleatorio > numero) {
				System.out.println("Mas alto");
			}
		} while (numero != aleatorio);
		System.out.println("CORRECTO, lo has conseguido en " + intentos);
		System.out.println(aleatorio);
		input.close();

	}
}
