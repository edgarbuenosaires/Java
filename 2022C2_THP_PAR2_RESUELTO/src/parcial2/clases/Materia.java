package parcial2.clases;

import java.util.ArrayList;

public class Materia {

	public static final int LIMITE_CORTO = 7;
	public static final int NOTA_MAXIMA = 10;
	public static final int NOTA_MINIMA = 0;
	public static final int NOTA_MINIMA_APROBACION = 4;
	public static final int SIN_NOTA = -1;
	private ArrayList<Acta> actas;
	private ArrayList<Actualizacion> auditoria;
	private String nombre;
	private ArrayList<Alumno> padron;

	public Materia(String nombre) {
		this.nombre = nombre;
		this.actas = new ArrayList<>();
		this.padron = new ArrayList<>();
		this.auditoria = new ArrayList<>();
		precargarAlumnos();
	}

	public ResultadoActualizacion actualizarNota(int dni, int nota) {
		ResultadoActualizacion res;
		if (notaEnRango(nota)) {
			Alumno alumno = buscarAlumno(dni);
			if (alumno == null) {
				res = ResultadoActualizacion.DNI_INEXISTENTE;
			} else if (alumno.esPrevio()) {
				res = ResultadoActualizacion.PREVIO_NO_ACTUALIZABLE;
			} else {
				alumno.actualizarNota(nota);
				destruirActas();
				res = ResultadoActualizacion.ACTUALIZACION_OK;
			}
		} else {
			res = ResultadoActualizacion.NOTA_FUERA_DE_RANGO;			
		}
		auditoria.add(new Actualizacion(dni, nota, res));
		return res;
	}
	
	private void agregarEnActa(Alumno alumno, Categoria categoria) {
		actas.get(categoria.ordinal()).agregarAlumno(alumno);
	}

	private Alumno buscarAlumno(int dni) {
		int pos = 0;
		Alumno alumno = null;
		while (pos < padron.size() && padron.get(pos).getDni() != dni) {
			pos++;
		}
		if (pos < padron.size()) alumno = padron.get(pos);
		return alumno;
	}

	private void destruirActas() {
		actas.clear();
	}

	public void emitirResumen() {
		Resumen resumen;
		System.out.println("Actas para " + nombre);
		for (Acta acta : actas) {
			resumen = acta.obtenerResumen();
			System.out.println(resumen.getCategoria() + ": " + resumen.getCantidadAlumnos() + " alumnos acreditados");
		}
	}

	public void generarActas() {
		inicializarActas();
		for (Alumno alumno : padron) {
			if (alumno.esPrevio() || alumno.rindeCompleto())
				agregarEnActa(alumno, Categoria.FINAL_COMPLETO);
			else if (alumno.aprobado())
				agregarEnActa(alumno, Categoria.FINAL_CORTO);
			else
				agregarEnActa(alumno, Categoria.RECUPERATORIO);
		}
	}

	private void inicializarActas() {
		actas.clear();
		actas.add(new Acta(Categoria.RECUPERATORIO));
		actas.add(new Acta(Categoria.FINAL_COMPLETO));
		actas.add(new Acta(Categoria.FINAL_CORTO));
	}

	public void listarActualizaciones() {
		for (Actualizacion actualizacion : auditoria) {
			System.out.println(actualizacion);
		}		
	}

	public void listarDetalle(Categoria categoria) {
		actas.get(categoria.ordinal()).listarDetalle();
	}

	private boolean notaEnRango(int nota) {
		return nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA;
	}

	private void precargarAlumnos() {
		// Simula la carga de datos desde otro sistema.
		padron.add(new Alumno(33065535));
		padron.add(new Alumno(41541107));
		padron.add(new Alumno(39917643, 2));
		padron.add(new Alumno(34653633, 5));
		padron.add(new Alumno(29272523, 9));
		padron.add(new Alumno(31873633, SIN_NOTA));
		for (Alumno alumno : padron) {
			System.out.println(alumno);
		}
	}

}
