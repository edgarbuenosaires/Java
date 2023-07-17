package tp1.tp4.ej07_Asistencia_ConEnum;

public enum TipoAsistencia {
	PRESENTE('p', 0), TARDE('T', 0.5), AUSENTE('A', 1);

	private char letra;
	private double cantFalta;

	private TipoAsistencia(char letra, double cantFalta) {
		this.letra = letra;
		this.cantFalta = cantFalta;
	}

	public static TipoAsistencia charToTipoAsistencia(char letra) {
		TipoAsistencia tipo = null;

		switch (letra) {
		case 'P': {
			tipo = TipoAsistencia.PRESENTE;
			break;
		}
		case 'T': {
			tipo = TipoAsistencia.TARDE;
			break;
		}
		case 'A': {
			tipo = TipoAsistencia.AUSENTE;
			break;
		}
		}
		return tipo;
	}

	public char getLetra() {
		return letra;
	}

	public double getCantFalta() {
		return cantFalta;
	}

}
