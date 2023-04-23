package ar.edu.ort.as.thp.tp2.ej11;

public class Turnera {
	private static int ultimoNumero; // Static porque es un atributo de la
										// CLASE.

	// Un metodo STATIC no requiere constructores
	// public Turnera() {
	// this.ultimoNumero = 0;
	// }

	public static void otorgarProximoNumero() {
		Turnera.ultimoNumero += 1;
	}

	public static int obtenerUltimoNumeroOtorgado() {
		return Turnera.ultimoNumero;
	}

	public static void resetearContador() {
		Turnera.resetearContador(0);
	}

	public static void resetearContador(int num) {
		if (num >= 0) {
			Turnera.ultimoNumero = num;
		}
	}
}
