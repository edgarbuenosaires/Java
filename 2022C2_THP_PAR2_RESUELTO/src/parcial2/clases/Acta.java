package parcial2.clases;

import java.util.ArrayList;

public class Acta {

	private Categoria categoria;
	private ArrayList<Alumno> alumnos;

	public Acta(Categoria categoria) {
		this.setCategoria(categoria);
		this.alumnos = new ArrayList<>();
	}

	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	private void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Resumen obtenerResumen() {
		return new Resumen(categoria, alumnos.size());
	}

	public void listarDetalle() {
		for (Alumno alumno : alumnos) {
			if (alumno.getNota() != Materia.SIN_NOTA)
				System.out.println(alumno.getDni() + ", " + alumno.getNota());
		}

	}
}
