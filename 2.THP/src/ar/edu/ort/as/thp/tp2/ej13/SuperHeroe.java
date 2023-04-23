package ar.edu.ort.as.thp.tp2.ej13;

public class SuperHeroe {
	private final static int VALOR_MIN = 0;
	private final static int VALOR_MAX = 100;
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	// CONSTRUCTOR
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.nombre = nombre;
		this.fuerza = ValoresRango(fuerza);
		this.resistencia = ValoresRango(resistencia);
		this.superpoderes = ValoresRango(superpoderes);
	}

	private static int ValoresRango(int valor) {
		int valorCorrecto = valor;
		if (valor < SuperHeroe.VALOR_MIN) {
			valorCorrecto = SuperHeroe.VALOR_MIN;
		} else if (valor > SuperHeroe.VALOR_MAX) {
			valorCorrecto = SuperHeroe.VALOR_MAX;
		}
		return valorCorrecto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

	public Resultado Competir(SuperHeroe contrincante) {
		int puntos = 0;
		puntos += SuperHeroe.CompararAtributos(this.fuerza, contrincante.getFuerza());
		puntos += SuperHeroe.CompararAtributos(this.resistencia, contrincante.getResistencia());
		puntos += SuperHeroe.CompararAtributos(this.superpoderes, contrincante.getSuperpoderes());
		return SuperHeroe.ObtenerResultados(puntos);
	}

	private static int CompararAtributos(int atributo1, int atributo2) {
		int resultado = 0;
		if (atributo1 > atributo2) {
			resultado = 1;
		} else if (atributo1 < atributo2) {
			resultado = -1;
		}
		return resultado;
	}

	private static Resultado ObtenerResultados(int puntos) {
		Resultado resultado = Resultado.EMPATE;
		if (puntos >= 1) {
			resultado = Resultado.TRIUNFO;
		} else if (puntos <= -1) {
			resultado = Resultado.DERROTA;
		}
		return resultado;
	}

}
