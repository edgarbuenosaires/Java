package tp1.tp3.ej07_figuras;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public String getColor() {
		return color;
	}

}
