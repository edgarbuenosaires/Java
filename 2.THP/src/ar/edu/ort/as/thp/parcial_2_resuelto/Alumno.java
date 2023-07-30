package ar.edu.ort.as.thp.parcial_2_resuelto;

public class Alumno {

	private int dni;
	private boolean deCuatriPrevio;
	private int nota;
	
	public Alumno(int dni) {
		this(dni, Materia.SIN_NOTA, true);
	}
	
	public Alumno(int dni, int nota) {
		this(dni, nota, false);
	}

	private Alumno(int dni, int nota, boolean esPrevio) {
		this.dni = dni;
		this.nota = nota;
		this.deCuatriPrevio = esPrevio;
	}

	public boolean esPrevio() {
		return deCuatriPrevio;
	}

	public int getDni() {
		return dni;
	}

	public void actualizarNota(int nota) {
		this.nota = nota;
	}

	public boolean rindeCompleto() {
		return aprobado() && !rindeCorto();
	}

	public boolean rindeCorto() {
		return nota >= Materia.LIMITE_CORTO;
	}

	public boolean aprobado() {
		return nota >= Materia.NOTA_MINIMA_APROBACION;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nota=" + nota + ", esPrevio()=" + esPrevio()
				+ ", rindeCompleto()=" + rindeCompleto() + ", rindeCorto()=" + rindeCorto() + ", aprobado()="
				+ aprobado() + "]";
	}

	public int getNota() {
		return nota;
	}

}
