package tp1.parcial1.naves;

public class NaveCargo extends NaveComercial {

	private final static double VOL_MAX_ESTACIONAR = 100;

	private Carga carga;

//	public NaveCargo(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera, String matricula) {
//		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera, matricula);
//	}

	public void cargar(Carga c) {
		this.carga = c;
	}

	public NaveCargo(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera,
			String matricula) {
		super(matricula, planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera);
		this.carga = carga;
	}

	public Carga descargar() {
		Carga c = this.carga;
		this.carga = null;
		return c;
	}

	@Override
	public boolean sePuedeEstacionar() {
		return !volumenDeCargaSuperiorA(VOL_MAX_ESTACIONAR) && !carga.isEsContaminante();
	}

	@Override
	public void completarManifiesto() {
		System.out.println(super.getCompaniaNaviera());
		this.carga.imprimirManifiesto();
	}

	private boolean volumenDeCargaSuperiorA(double volumen) {
		boolean superior = false;
		if (carga != null) {
			superior = carga.volumenSuperiorA(volumen);
		}

		return superior;
	}
}
