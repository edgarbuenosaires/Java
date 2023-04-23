package ar.edu.ort.as.thp.parcial_2;

public class Acta {
	@Override
	public String toString() {
		return "Acta [categoria=" + categoria + "]";
	}

	private CategoriaExamen categoria;

	public Acta(CategoriaExamen categoria) {
		this.categoria = categoria;
	}

	public void mostrarActas() {
		System.out.println(this);
	}

}
