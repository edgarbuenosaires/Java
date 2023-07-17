package p1.parcial1.naves;

public class NaveCruiser extends Nave {

	private int cantPasajeros;

	private static final int PASAJEROS_MINIMO = 1;

	public NaveCruiser(String nomCompania, String planetaOrigen, String planetaUltimo, int cantTripulantes,
			int cantPasajeros) {
		super(nomCompania, planetaOrigen, planetaUltimo, cantTripulantes);
		this.cantPasajeros = cantPasajeros;
	}

	public void informarManifiesto() {
		super.manifiesto();
		System.out.println("Porcentaje de pasajeros sobre tripulacion " + this.porceABordo());
	}

	private double porceABordo() {
		int totalSeres = 0;
		double porcent = 0;

		totalSeres = this.cantPasajeros + super.getCantTripulantes();
		if (totalSeres != 0) {
			porcent = cantPasajeros / totalSeres;
		}
		return porcent;
	}

	@Override
	public boolean estaEnCondiciones(Nave nave) {
		return this.cantPasajeros >= PASAJEROS_MINIMO;
	}

}
