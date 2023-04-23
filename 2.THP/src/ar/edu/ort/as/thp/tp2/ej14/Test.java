package ar.edu.ort.as.thp.tp2.ej14;

public class Test {
	public static void main(String[] args) {

		Promedio prom = new Promedio();

		prom.incrementar(4);
		prom.incrementar(3);
		prom.incrementar(5);
		prom.incrementar(9);

		System.out.println("El promedio es: " + prom.obtenerValor());
	}
}
