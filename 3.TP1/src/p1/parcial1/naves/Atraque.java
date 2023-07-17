package p1.parcial1.naves;

public class Atraque {

	private Nave nave;

	public Atraque(Nave nave) {
		super();
		this.nave = nave;
	}

	public boolean naveAtracada() {
		return this.nave != null;
	}

	public Nave getNave() {
		return this.nave;
	}

	public void agregarNave(Nave nav) {
		this.nave = nav;
	}

}
