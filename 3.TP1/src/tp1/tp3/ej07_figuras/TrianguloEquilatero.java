package tp1.tp3.ej07_figuras;

public class TrianguloEquilatero extends Figura {

	private double lado;

	public TrianguloEquilatero(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	public double altura() {
		return Math.sqrt(lado * lado - (lado / 2) * (lado / 2));
	}

	@Override
	public double calcularArea() {
		return (this.lado * this.altura()) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return 3 * this.lado;
	}

	public double getLado() {
		return lado;
	}

}
