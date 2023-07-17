package tp1.tp4.ej07_Asistencia_ConEnum;

public class Comision {
	public final static int CANT_AUSENTES_DESERTOR = 4;
	public final static double PORC_MIN_FINAL = 75;
	private String codigo;
	private int cantAlumnos;
	private int cantClases;
	private char[][] asistencia;
	private Alumno[] alumnos;

	public Comision(String codigo, int cantAlumnos, int cantClases) {
		super();
		this.codigo = codigo;
		this.cantAlumnos = cantAlumnos;
		this.cantClases = cantClases;
		this.asistencia = new char[cantAlumnos][cantClases];
		this.alumnos = new Alumno[cantAlumnos];
	}

	public void mostrarAptosParaFinal() {

		// Mostrar los apellidos de los alumnos aptos para rendir final, junto al
		// porcentaje de presentismo de cada uno.

		double faltas;
		double porcPresentismo;

		for (int alu = 0; alu < cantAlumnos; alu++) {
			char[] aistenciaPorAlumno = this.asistencia[alu];
			faltas = cantFaltas(aistenciaPorAlumno);
			porcPresentismo = 100 - Matematica.getPorcentaje(faltas, this.cantClases);
			if (porcPresentismo >= PORC_MIN_FINAL) {
				System.out.println(this.alumnos[alu].getApellido() + "\t" + porcPresentismo + "%");
			}
		}
	}

	private double cantFaltas(char[] arrayDeAsistencia) {
		double acuFaltas = 0;
		int cant = arrayDeAsistencia.length;

		for (int c = 0; c < cant; c++) {
			char letra = arrayDeAsistencia[c];
			acuFaltas += TipoAsistencia.charToTipoAsistencia(letra).getCantFalta(); // suma Ausente 1, Tarde 0.5 y
																					// Presente 0.
		}
		return acuFaltas;
	}

	public int llegadasTardeTotales() {

		// Obtener el numero total de llegadas tarde para todo el periodo de cursada.

		int cantTardes = 0;

		for (int a = 0; a < this.cantAlumnos; a++) {
			cantTardes += cantDe(this.asistencia[a], TipoAsistencia.TARDE.getLetra());
		}
		return cantTardes;
	}

	private int cantDe(char[] caracteres, char caracter) {
		int cant = 0;

		for (int c = 0; c < caracteres.length; c++) {
			if (caracteres[c] == caracter) {
				cant++;
			}
		}
		return cant;
	}

	public int cantClasesPerfectas() {

		// Obtener la cantidad de clases con asistencia perfecta de la manera mas
		// eficiente posible.

		int cantPerfectas = 0;
		for (int columna = 0; columna < this.cantClases; columna++) {
			if (esClaseConAsistenciaPerfecta(columna)) {
				cantPerfectas++;
			}
		}
		return cantPerfectas;
	}

	private boolean esClaseConAsistenciaPerfecta(int idxClase) {
		int a = 0;
		boolean esPerfecta = true;

		while (a < this.cantAlumnos && esPerfecta) {
			char letra = this.asistencia[a][idxClase];
			esPerfecta = letra != TipoAsistencia.AUSENTE.getLetra();
			a++;
		}
		return esPerfecta;
	}

	public double[] porcPresentismoXClase() {

//		Devolver el porcentaje de presentismo por cada clase. Las llegadas tarde cuentan como presente.

		double porcPresentismo;
		int presentes;
		double[] porcentajes;

		porcentajes = new double[this.cantClases];
		for (int c = 0; c < this.cantClases; c++) {
			presentes = cantPresentes(c);
			porcPresentismo = Matematica.getPorcentaje(presentes, this.cantClases);
			porcentajes[c] = porcPresentismo;
		}
		return porcentajes;
	}

	private int cantPresentes(int idxClase) {
		int alumnosPresentes = 0;
		for (int a = 0; a < this.cantAlumnos; a++) {
			if (this.asistencia[a][idxClase] != TipoAsistencia.AUSENTE.getLetra()) {
				alumnosPresentes++;
			}
		}
		return alumnosPresentes;
	}

	public void mostrarDesertores() {
		
		// Mostrar los apellidos de los alumnos que dejaron la cursada (mas de 4 ausencias seguidas).
		
		for (int a = 0; a < this.cantAlumnos; a++) {
			char[] filaAsistencia = this.asistencia[a];
			if (esDesertor(filaAsistencia)) {
				System.out.println(this.alumnos[a].getApellido());
			}
		}
	}

	private boolean esDesertor(char[] arrayAsistencia) {
		
		int i;
		boolean esDesertor = true;
		int cantAusenciasBuscadas = CANT_AUSENTES_DESERTOR;

		if (this.cantClases < cantAusenciasBuscadas) {
			cantAusenciasBuscadas = this.cantClases;
		}
		
		i = this.cantClases - 1;
		
		int desde = this.cantClases - cantAusenciasBuscadas;
		while (i >= desde && esDesertor) {
			esDesertor = arrayAsistencia[i] == TipoAsistencia.AUSENTE.getLetra();
			i++;
		}
		return esDesertor;
	}

}
