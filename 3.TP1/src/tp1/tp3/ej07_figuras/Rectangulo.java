package tp1.tp3.ej07_figuras;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * this.base + 2 * this.altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

}
