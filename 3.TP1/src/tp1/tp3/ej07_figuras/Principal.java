package tp1.tp3.ej07_figuras;

public class Principal {

	public static void main(String[] args) {

		GrupoDeFiguras gf = new GrupoDeFiguras();

		Circunferencia circu1 = new Circunferencia("Rosa", 25);
		Circunferencia circu2 = new Circunferencia("Azul", 15);
		Rectangulo rect3 = new Rectangulo("Verde", 20, 14);
		Rectangulo rect4 = new Rectangulo("Violeta", 34, 17);
		TrianguloEquilatero tri5 = new TrianguloEquilatero("Rojo", 45);
		TrianguloEquilatero tri6 = new TrianguloEquilatero("Amarillo", 23);

		gf.agregarFigura(circu1);
		gf.agregarFigura(circu2);
		gf.agregarFigura(rect3);
		gf.agregarFigura(rect4);
		gf.agregarFigura(tri5);
		gf.agregarFigura(tri6);

		gf.mostrarInfoDeFigura();
//		

	}

}
