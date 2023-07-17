package tp1.tp3.ej07_figuras;

import java.util.ArrayList;

public class GrupoDeFiguras {

	private ArrayList<Figura> figuras;

	public GrupoDeFiguras() {
		super();
		this.figuras = new ArrayList<>();
	}

	public void agregarFigura(Figura f) {
		this.figuras.add(f);
	}

	public void mostrarInfoDeFigura() {
		for (Figura f : figuras) {
			System.out.println(f);
			System.out.println("Color de la figura: " + f.getColor());
			System.out.println("Area de la figura: " + f.calcularArea());
			System.out.println("Perimetro de la figura: " + f.calcularPerimetro()+"\n");

		}
	}
}
