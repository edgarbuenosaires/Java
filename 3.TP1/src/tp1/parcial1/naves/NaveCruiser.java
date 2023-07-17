package tp1.parcial1.naves;

public class NaveCruiser extends NaveComercial {

	private int cantidadDePasajeros;

	public NaveCruiser(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera,
			int cantidadDePasajeros, String matricula) {
		super(matricula, planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera);
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

//	public NaveCruiser(String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes, String companiaNaviera,
//			int cantidadDePasajeros, String matricula) {
//		super(planetaOrigen, ultimoPlanetaVisitado, cantTripulantes, companiaNaviera, matricula);
//		this.cantidadDePasajeros = cantidadDePasajeros;
//	}

	@Override
	public boolean sePuedeEstacionar() {
		return this.cantidadDePasajeros > 0;
	}

	@Override
	public void completarManifiesto() {
		System.out.println(super.getCompaniaNaviera());
		System.out.printf(" | Pasaj: %.2f%%\n", porcPasajeros());
		// %.2f Muestra el porcentaje solo con dos decimales
		// %% Muestra un símbolo de porcentaje literal (el otro es para escaparlo)
		// \n Salto de línea
	}

	private double porcPasajeros() {
		return this.getCantTripulantes() * 100.0 / (this.getCantTripulantes() + this.cantidadDePasajeros);
	}

}
