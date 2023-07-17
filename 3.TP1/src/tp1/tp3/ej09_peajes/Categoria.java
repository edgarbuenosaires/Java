package tp1.tp3.ej09_peajes;

public enum Categoria {
	AUTO(100), MOTO(50), CAMION(200);

	private double tarifa;

	Categoria(int t) {
		this.tarifa = t;
	}

	double getTarifa() {
		return this.tarifa;
	}
}
