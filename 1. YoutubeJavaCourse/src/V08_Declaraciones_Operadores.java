
public class V08_Declaraciones_Operadores {

	public static void main(String[] args) {

		/* Constante, no se pueden modificar */

		final double apulgadas = 2.545;
		double cm = 6;
		double resultado = cm / apulgadas;
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

		/* Se incrementa en 6 */

		int b = 1;
		b += 6;
		System.out.println(b);

		// Declaro varias variables en una sola linea.

		int operador1, operador2, suma;
		operador1 = 8;
		operador2 = 7;
		suma = operador1 + operador2;
		System.out.println("El resultado de la suma es: " + suma);

	}

}
