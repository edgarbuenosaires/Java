package tp1.parcial1.naves;

public abstract class Nave implements Manifestable {
	
	private String matricula;
	private String planetaOrigen;
	private String ultimoPlanetaVisitado;
	private int cantTripulantes;
	

	public Nave(String matricula, String planetaOrigen, String ultimoPlanetaVisitado, int cantTripulantes) {
		super();
		this.matricula = matricula;
		this.planetaOrigen = planetaOrigen;
		this.ultimoPlanetaVisitado = ultimoPlanetaVisitado;
		this.cantTripulantes = cantTripulantes;
	}

	public int getCantTripulantes() {
		return cantTripulantes;
	}

	public void imprimirManifiesto() {
		//System.out.println("Planeta de origen: " + planetaOrigen);
		//System.out.println("Último planeta visitado: " + ultimoPlanetaVisitado);
		//System.out.println("Cantidad de tripulantes: " + cantTripulantes);
		completarManifiesto();
	}

	public abstract boolean sePuedeEstacionar();

	public abstract void completarManifiesto();

	public String getMatricula() {
		return matricula;
	}

	
	
}
