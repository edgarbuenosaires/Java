package ar.edu.ort.as.thp.parcial_2_resuelto;

public class Actualizacion {
	int dni;
	int nota;
	ResultadoActualizacion resultado;
	
	public Actualizacion(int dni, int nota, ResultadoActualizacion resultado) {
		this.dni = dni;
		this.nota = nota;
		this.resultado= resultado;
	}

	@Override
	public String toString() {
		return "Actualizacion [dni=" + dni + ", nota=" + nota + ", resultado=" + resultado + "]";
	}

}
