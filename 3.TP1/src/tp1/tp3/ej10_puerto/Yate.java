package tp1.tp3.ej10_puerto;

public class Yate extends Embarcacion {
	private int camarotes;

	public Yate(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int camarotes) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.camarotes = camarotes;
	}

	@Override
	public double precioAdicional() {
		return getValorAdicional() * this.camarotes;
	}

}
