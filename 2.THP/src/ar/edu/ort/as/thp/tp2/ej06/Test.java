package ar.edu.ort.as.thp.tp2.ej06;

public class Test {

	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();

		int valoDado1 = dado1.getValor();
		int valoDado2 = dado2.getValor();
		int acumValDados = 0;

		if (valoDado1 == valoDado2) {
			System.out.println("El resultado es el mismo: " + valoDado1);
		} else if (valoDado1 > valoDado2) {
			System.out.println("El dado valor mayor fue el 1 con " + valoDado1);
		} else {
			System.out.println("El dado valor mayor fue el 2 con " + valoDado2);
		}

		for (int i = 0; i < 100; i++) {
			valoDado1 = dado1.getValor();
			valoDado2 = dado2.getValor();
			System.out.println("Dado: " + valoDado1 + " Dado: " + valoDado2);
			acumValDados += (valoDado1 + valoDado2);
		}
		System.out.println("El promedio de los dados es: " + acumValDados / 200);
	}

}
