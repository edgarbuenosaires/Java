package ar.edu.ort.as.thp.tp2.ej11;

public class Test {

	public static void main(String[] args) {
		System.out.println("El 1er numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 2do numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 3er numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 4to numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 5to numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 6to numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println("El 7mo numero es: " + Turnera.obtenerUltimoNumeroOtorgado());

		// RESETEO EL CONTADOR
		Turnera.resetearContador(100);
		Turnera.otorgarProximoNumero();
		System.out.println("El 8vo numero es: " + Turnera.obtenerUltimoNumeroOtorgado());
	}

}
