package tp1.parcial1.naves;

public abstract class NaveComercial extends Nave {

	private String companiaNaviera;

	public NaveComercial(String matricula, String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes,
			String companiaNaviera) {
		super(matricula, planetaOrigen, ultimoPlanetaVisitado, cantTripulantes);
		this.companiaNaviera = companiaNaviera;
	}

	public String getCompaniaNaviera() {
		return companiaNaviera;
	}

//	public NaveComercial(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes,
//			String companiaNaviera, String matricula) {
//		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, matricula);
//		this.companiaNaviera = companiaNaviera;
//	}

}
