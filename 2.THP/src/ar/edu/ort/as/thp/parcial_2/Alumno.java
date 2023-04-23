package ar.edu.ort.as.thp.parcial_2;

public class Alumno {

	private int dni;
	private boolean alumnoLibre;
	private int notaFinalCursada;
	
	public Alumno(int dni, boolean alumnoLibre, int notaFinalCursada) {
		this.dni = dni;
		this.alumnoLibre = alumnoLibre;
		this.notaFinalCursada = notaFinalCursada;
	}

	public boolean esAlumnoLibre() {
		return this.alumnoLibre;
	}

	public void actualizarNota(int nota) {
		this.notaFinalCursada=nota;
		
	}

	public int getDni() {
		return dni;
	}

	public int getNotaFinalCursada() {
		return this.notaFinalCursada;
	}

}
