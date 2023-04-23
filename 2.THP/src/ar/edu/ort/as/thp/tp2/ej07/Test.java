package ar.edu.ort.as.thp.tp2.ej07;

public class Test {

	public static void main(String[] args) {
		Computadora compu1;
		Procesador procesador = new Procesador("Intel", "i7");
		compu1 = new Computadora("IBM", procesador, TipoComputadora.DESKTOP);
		System.out.println("========== PRIMERA COMPUTADORA ==========\n" + compu1.toString());

		Computadora compu2;
		compu2 = new Computadora("HP", new Procesador("AMD", "Pepito"), TipoComputadora.ALL_IN_ONE);
		System.out.println("========== SEGUNDA COMPUTADORA ==========\n" + compu2.toString());

		System.out.println("========== MUESTRO EL ORDEN DENTRO DEL ENUM ==========");
		System.out.println("All in one: " + TipoComputadora.ALL_IN_ONE.ordinal());
		System.out.println("Desktop: " + TipoComputadora.DESKTOP.ordinal());
		System.out.println("Laptop: " + TipoComputadora.LAPTOP.ordinal());
	}

}
