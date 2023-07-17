package tp1.tp3.ej10_puerto;

public abstract class Embarcacion {
	private String matricula;
	private double eslora;
	private int anioFabricacion;
	private String duenio;
	private double valorBase;
	private double valorAdicional;

	public Embarcacion(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.duenio = duenio;
		this.valorBase = valorBase;
		this.valorAdicional = valorAdicional;
	}

	private double precioBase() {
		return this.valorBase * this.eslora;
	}

	public abstract double precioAdicional();

	public double montoAlquiler() {
		return this.precioBase() + this.precioAdicional();
	}

	public double getValorAdicional() {
		return 0;
	}

	public boolean sePuedeAmarrar() {
		// TODO Auto-generated method stub
		return false;
	}

}
