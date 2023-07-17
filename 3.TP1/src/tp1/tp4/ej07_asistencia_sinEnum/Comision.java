package tp1.tp4.ej07_asistencia_sinEnum;

public class Comision {
	private String codigo;
	private int cantAlumnos;
	private int cantClases;
	private char[][] asistencia;
	private Alumno[] alumnos;

	public Comision(String codigo, int cantAlumnos, int cantClases) {
		this.codigo = (codigo);
		this.cantAlumnos = cantAlumnos;
		this.cantClases = cantClases;
		this.asistencia = new char[cantAlumnos][cantClases];
		this.alumnos = new Alumno[cantAlumnos];
		// faltaria llenar alumnos y asistencia con datos concretos
	}

	public void mostrarAptosParaFinal() {
		double faltas;
		double porcPresentismo;

		for (int a = 0; a < cantAlumnos; a++) {
			char[] filaAsistencia = this.asistencia[a];
			faltas = cantFaltas(filaAsistencia);
			porcPresentismo = 100 - Matematica.getPorcentaje(faltas, this.cantClases);
			if (porcPresentismo >= Constantes.PORC_MIN_FINAL) {
				System.out.println(this.alumnos[a].getApellido() + "\t" + porcPresentismo + "%");
			}
		}
	}

	public int llegadasTardesTotales() {
		int cantTardes = 0;

		for (int a = 0; a < this.cantAlumnos; a++) {
			for (int c = 0; c < this.cantClases; c++) {
				if (this.asistencia[a][c] == Constantes.TARDE) {
					cantTardes++;
				}
			}
		}
		return cantTardes;
	}

	public int cantClasesPerfectas() {
		int cantPerfectas = 0;

		for (int c = 0; c < this.cantClases; c++) {
			if (esClaseConAsistenciaPerfecta(c)) {
				cantPerfectas++;
			}
		}
		return cantPerfectas;
	}

	public double[] porcPresentismoXClase() {
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

	public void mostrarDesertores() {
		for (int a = 0; a < this.cantAlumnos; a++) {
			char[] filaAsistencia = this.asistencia[a];
			if (esDesertor(filaAsistencia)) {
				this.alumnos[a].getApellido();
			}
		}
	}

	private double cantFaltas(char[] arrayAsistencia) {
		double acuFaltas;
		int cant = arrayAsistencia.length;

		acuFaltas = 0;
		for (int c = 0; c < cant; c++) {
			char letra = arrayAsistencia[c];
			if (letra == Constantes.AUSENTE) {
				acuFaltas += Constantes.FALTA_COMPLETA;
			} else if (letra == Constantes.TARDE) {
				acuFaltas += Constantes.MEDIA_FALTA;
			}
		}
		return acuFaltas;
	}

	private boolean esClaseConAsistenciaPerfecta(int idxClase) {
		int a = 0;
		boolean esPerfecta = true;

		while (a < this.cantAlumnos && esPerfecta) {
			esPerfecta = this.asistencia[a][idxClase] != Constantes.AUSENTE;
			a++;
		}
		return esPerfecta;
	}

	private int cantPresentes(int idxClase) {
		int alumnosPresentes = 0;

		for (int a = 0; a < this.cantAlumnos; a++) {
			if (this.asistencia[a][idxClase] != Constantes.AUSENTE) {
				alumnosPresentes++;
			}
		}
		return alumnosPresentes;
	}

	private boolean esDesertor(char[] arrayAsistencia) {
		int i;
		boolean esDesertor = true;
		int cantAusenciasBuscadas = Constantes.CANT_AUSENTES_DESERTOR;

		if (this.cantClases < cantAusenciasBuscadas) {
			cantAusenciasBuscadas = this.cantClases;
		}
		i = this.cantClases - cantAusenciasBuscadas;
		while (i < this.cantClases && esDesertor) {
			esDesertor = arrayAsistencia[i] == Constantes.AUSENTE;
			i++;
		}
		return esDesertor;
	}

}
