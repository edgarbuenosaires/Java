package tp1.parcial1.naves;

public abstract class Carga implements Manifestable {

	private String descripcion;
	private double volumen;

	public Carga(String descripcion, double volumen) {
		this.descripcion = descripcion;
		this.volumen = volumen;
	}

	@Override
	public void imprimirManifiesto() {
		System.out.println(" | " + descripcion + " (" + volumen + " m3)");
	}

	public boolean volumenSuperiorA(double volumen) {
		return this.volumen > volumen;
	}

	public abstract boolean isEsContaminante();
}
