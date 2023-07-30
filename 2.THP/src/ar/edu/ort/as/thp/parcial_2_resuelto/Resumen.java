package ar.edu.ort.as.thp.parcial_2_resuelto;

public class Resumen {

	private Categoria categoria;
	private int cantidadAlumnos;

	public Resumen(Categoria categoria, int cantidadAlumnos) {
		this.setCategoria(categoria);
		this.setCantidadAlumnos(cantidadAlumnos);
	}

	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	private void setCantidadAlumnos(int cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}

	private void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
