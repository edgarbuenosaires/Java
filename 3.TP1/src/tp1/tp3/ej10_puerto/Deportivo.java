package tp1.tp3.ej10_puerto;

public class Deportivo extends Embarcacion {
	private int potenciaMotor;
	private int factorAerodinamico;
	private final static double INDICE_CALC_POTENCIA = 0.35;

	public Deportivo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.potenciaMotor = potenciaMotor;
		this.factorAerodinamico = factorAerodinamico;
	}

	@Override
	public double precioAdicional() {
		return getValorAdicional() * (this.potenciaMotor * 0.5);
	}

	public double getConsumo() {
		return this.potenciaMotor / this.factorAerodinamico * this.INDICE_CALC_POTENCIA;
	}

	public double getIndiceCalcPotencia() {
		return INDICE_CALC_POTENCIA;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

}
