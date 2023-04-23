package tp1.tp1.ej01;

import java.util.ArrayList;

public class Categoria {
	private String ID;
	private String nombre;
	private ArrayList<Curso> cursos;

	public Categoria(String iD, String nombre) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}

	public Curso buscarCurso(String idCurso) {
		Curso encontrado = null;
		Curso curso;
		int i = 0;
		while (i < this.cursos.size() && encontrado == null) {
			curso = this.cursos.get(i);
			if (curso.getID().equals(idCurso)) {
				encontrado = curso;
			}
		}
		return encontrado;
	}

	public boolean buscarCursoBoolean(String idCurso) {
		return this.buscarCurso(idCurso) != null;
	}

	public Resultados suscribirACurso(String idCurso, String idUsuario) {

		Resultados resul = null;
		Curso curso = this.buscarCurso(idCurso);
		resul = curso.suscribirACurso(idUsuario);

		return resul;
	}

}
