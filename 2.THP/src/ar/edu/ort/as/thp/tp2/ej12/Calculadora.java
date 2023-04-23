package ar.edu.ort.as.thp.tp2.ej12;

public class Calculadora {

	public static int sumar(int nroA, int nroB) {
		int resultado;
		resultado = nroA + nroB;
		return resultado;
	}

	public static int restar(int nroA, int nroB) {
		int resultado;
		resultado = nroA - nroB;
		return resultado;
	}

	public static int multiplicar(int nroA, int nroB) {
		int resultado;
		resultado = nroA * nroB;
		return resultado;
	}

	public static int dividir(int nroA, int nroB) {
		int resultado;
		if (nroB == 0) {
			resultado = 0;
		} else {
			resultado = nroA / nroB;
		}
		return resultado;
	}
}
