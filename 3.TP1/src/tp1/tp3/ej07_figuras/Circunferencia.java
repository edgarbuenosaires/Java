package tp1.tp3.ej07_figuras;

public class Circunferencia extends Figura {

	private double radio;

	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return this.radio * Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}

	public double getRadio() {
		return radio;
	}

}