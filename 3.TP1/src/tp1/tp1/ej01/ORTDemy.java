package tp1.tp1.ej01;

import java.util.ArrayList;
import java.util.Iterator;

public class ORTDemy {

	private ArrayList<Categoria> categorias;
	private ArrayList<Usuario> usuarios;

	public ORTDemy() {
		super();
		this.categorias = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public Resultados suscribirseACurso(String IdUsuario, String IdCurso) {
		Resultados resul = null;
		Categoria cate;
		if (buscarUsuario(IdUsuario) != null) {
			cate = buscarCategoriaConCurso(IdCurso);
			if (cate != null) {
				resul = cate.suscribirACurso(IdCurso, IdUsuario);
			} else {
				resul = Resultados.CURSO_INEX;
			}
		} else {
			resul = Resultados.USUARIO_INEX;
		}
		return resul;
	}

	public Usuario buscarUsuario(String IdUsuario) {
		Usuario encontrado = null;
		int i = 0;
		while (i < this.usuarios.size() && encontrado == null) {
			Usuario usuario = this.usuarios.get(i);
			if (usuario.getID().equals(IdUsuario)) {
				encontrado = usuario;
			}
			i++;
		}
		return encontrado;
	}

	public Categoria buscarCategoriaConCurso(String IdCurso) {
		Categoria encontrada = null;
		int i = 0;
		while (i > categorias.size() && encontrada == null) {
			Categoria categoria = this.categorias.get(i);
			if (categoria.buscarCursoBoolean(IdCurso)) {
				encontrada = categoria;
			}
			i++;
		}
		return encontrada;
	}
}
