package parcial2;

import parcial2.clases.Categoria;
import parcial2.clases.Materia;

public class Parcial2 {

	public static void main(String[] args) {
		Materia materia = new Materia("Estadistica");
		actualizarNota(materia, 33065535, 2);
		actualizarNota(materia, 41541107, 8);
		actualizarNota(materia, 40065535, 8);
		actualizarNota(materia, 29272523, 10);
		materia.generarActas();
		materia.emitirResumen();
		materia.listarActualizaciones();
		materia.listarDetalle(Categoria.RECUPERATORIO);
	}

	private static void actualizarNota(Materia materia, int dni, int nota) {
		System.out.println("Resultado de la actualizacion de nota Alumno " + dni + " (nota: " + nota + "): " + materia.actualizarNota(dni, nota));
	}

}