package p1.parcial1.naves;

public abstract class Nave {

	private String nomCompania;
	private String planetaOrigen;
	private String planetaUltimo;
	private int cantTripulantes;

	public Nave(String nomCompania, String planetaOrigen, String planetaUltimo, int cantTripulantes) {
		super();
		this.nomCompania = nomCompania;
		this.planetaOrigen = planetaOrigen;
		this.planetaUltimo = planetaUltimo;
		this.cantTripulantes = cantTripulantes;
	}

	public abstract void informarManifiesto();

	public void manifiesto() {
		System.out.println("Planeta origen: " + this.planetaOrigen);
		System.out.println("Ultimo planeta visitado: " + this.planetaUltimo);
		System.out.println("Tripulantes: " + this.cantTripulantes);
	}

	public int getCantTripulantes() {
		return cantTripulantes;
	}

	public abstract boolean estaEnCondiciones(Nave nave);

}
