package ar.edu.ort.as.thp.parcial_2;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Alumno> finalCorto;
	private ArrayList<Alumno> finalLargo;
	private ArrayList<Alumno> recuperatorio;

	public Materia(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
	}

	public void agregarAlumno(Alumno alum) {
	this.alumnos.add(alum);
	}

	public Resultado actualizarNota(int dni, int nota) {
		Alumno alumno;
		Resultado res = null;

		alumno = this.buscarAlumno(dni);

		if (alumno != null) {
			if (this.esNotaValida(nota)) {
				if (!alumno.esAlumnoLibre()) {
					alumno.actualizarNota(nota);
					this.finalCorto.clear();
					this.finalLargo.clear();
					this.recuperatorio.clear();
					this.generarActas();
					res = Resultado.ACTUALIZACION_OK;
				} else {
					res = Resultado.NO_ACTUALIZABLE;
				}
			} else {
				res = Resultado.NOTA_FUERA_DE_RANGO;
			}
		} else {
			res = Resultado.DNI_INEXISTENTE;
		}

		return res;
	}

	public void generarActas() {
		finalLargo = new ArrayList<Alumno>();
		recuperatorio = new ArrayList<Alumno>();
		finalCorto = new ArrayList<Alumno>();

		for (Alumno alumno : alumnos) {
			if (!alumno.esAlumnoLibre()) {
				if (alumno.getNotaFinalCursada() > 4) {
					if (alumno.getNotaFinalCursada() < 7) {
						this.finalLargo.add(alumno);
					} else {
						this.finalCorto.add(alumno);
					}
				} else {
					this.recuperatorio.add(alumno);
				}
			} else {
				this.finalLargo.add(alumno);
			}
		}

	}

	private boolean esNotaValida(int nota) {
		boolean esValida = false;
		if (nota >= 0 && nota <= 10) {
			esValida = true;
		}
		return esValida;
	}

	public Alumno buscarAlumno(int dni) {
		int i = 0;
		Alumno alumno;
		Alumno alumnoEncontrado = null;

		while (i < this.alumnos.size() && alumnoEncontrado == null) {
			alumno = this.alumnos.get(i);
			if (alumno.getDni() == dni) {
				alumnoEncontrado = alumno;
			} else {
				i++;
			}
		}
		return alumnoEncontrado;
	}

	public void emitirResumen() {
		System.out.println("Actas para FUNDAMENTOS DE PROGRAMACION");
		System.out.println("RECUPERATORIO: " + this.contarAlumnosAcreditados(CategoriaExamen.RECUPERATORIO));
		System.out.println("FINAL_LARGO: " + this.contarAlumnosAcreditados(CategoriaExamen.FINAL_LARGO));
		System.out.println("FINAL_CORTO: " + this.contarAlumnosAcreditados(CategoriaExamen.FINAL_CORTO));
	}

	private int contarAlumnosAcreditados(CategoriaExamen categoria) {
		int resultado=0;
		switch (categoria) {
		case RECUPERATORIO:
			resultado = this.recuperatorio.size();
			break;
		case FINAL_LARGO:
			resultado = this.finalLargo.size();
			break;
		case FINAL_CORTO:
			resultado = this.finalCorto.size();
			break;

		}
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

}
