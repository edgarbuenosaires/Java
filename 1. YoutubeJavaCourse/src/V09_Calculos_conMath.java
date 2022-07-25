
public class V09_Calculos_conMath {

	public static void main(String[] args) {

		// METODO RAIZ CUADRADA
		double raiz = Math.sqrt(9); // Recibe un double (9) y devuelve un double.

		System.out.println(raiz);

		// METODO ROUND (REDODNDEO)
		double num1 = 5.85F;
//		int resultado = Math.round(num1); da error porque recibe un double y devuelve un Long

		// REFUNDICION
		int resultado = (int) Math.round(num1); // como Math.round devuelve un double, se refundio en un int para que no
												// de error.
		System.out.println(resultado);

		// METODO POW (POTENCIA)

		double base = 5;
		double exponente = 3;
		int resultadoPotencia = (int) Math.pow(base, exponente); // como el metodo Math.pow deuvelve un double, se
																	// refundio en un int para que no de error.
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultadoPotencia);

	}

}
