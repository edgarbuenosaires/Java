package p1.parcial1.naves;

public class NaveCargo extends Nave {

	private String descripcion;
	private double volumen;
	private static final int LIMITE_CARGO = 100;

	public NaveCargo(String nomCompania, String planetaOrigen, String planetaUltimo, int cantTripulantes,
			String descripcion, double volumen) {
		super(nomCompania, planetaOrigen, planetaUltimo, cantTripulantes);
		this.descripcion = descripcion;
		this.volumen = volumen;
	}

	@Override
	public void informarManifiesto() {
		super.manifiesto();
		System.out.println(this.descripcion + " (volumen " + this.volumen + " mts3");

	}

	@Override
	public boolean estaEnCondiciones(Nave nave) {
		return this.volumen >= LIMITE_CARGO;
	}

}
