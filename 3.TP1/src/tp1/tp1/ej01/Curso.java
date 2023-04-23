package tp1.tp1.ej01;

import java.util.ArrayList;

public class Curso {
	private String ID;
	private String titulo;
	private double precio;
	private String valoracion;
	private final static int MAX_BECADOS = 5;
	private ArrayList<Leccion> lecciones;
	private ArrayList<Usuario> suscriptos;
	private Usuario autor;

	public Curso(String iD, String titulo, double precio, String valoracion) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.lecciones = new ArrayList<>();
		this.suscriptos = new ArrayList<>();
	}

	public String getID() {
		return ID;
	}

	public Resultados suscribirACurso(String idUsuario) {
		Resultados resul = null;
		Usuario suscriptor = buscarSuscriptor(idUsuario);
		if (suscriptor == autor) {
			resul= Resultados.ES_AUTOR;
		}
// TODO XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		return resul;
	}

	private Usuario buscarSuscriptor(String idUsuario) {
		int i = 0;
		Usuario encontrado = null;
		Usuario usuario;
		while (i < this.suscriptos.size() && encontrado == null) {
			usuario = this.suscriptos.get(i);
			if (usuario.getID().equals(idUsuario)) {
				encontrado = usuario;
			}
			i++;
		}
		return encontrado;
	}

	private boolean maximoDeBecados() {
		boolean resultado = false;
		int cant = 0;
		for (Usuario suscripto : suscriptos) {
			if (suscripto.esBecado() == true) {
				cant++;
			}
		}
		if (cant >= MAX_BECADOS) {
			resultado = true;
		}
		return resultado;

	}

}
