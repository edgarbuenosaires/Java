package tp1.tp3.ej10_puerto;

public class DeportivoLujo extends Deportivo {

	public DeportivoLujo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional, potenciaMotor, factorAerodinamico);
		// TODO Auto-generated constructor stub
	}

	public double getConsumo() {
		return 2 * getPotenciaMotor() * getIndiceCalcPotencia();
	}
}
