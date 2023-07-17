package tp1.tp3.ej10_puerto;

public class Velero extends Embarcacion {
	private int cantMastiles;

	public Velero(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int cantMastiles) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.cantMastiles = cantMastiles;
	}

	@Override
	public double precioAdicional() {
		return getValorAdicional() * this.cantMastiles;
	}

}
