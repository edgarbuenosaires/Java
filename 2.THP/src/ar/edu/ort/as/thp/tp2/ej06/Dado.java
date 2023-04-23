package ar.edu.ort.as.thp.tp2.ej06;

public class Dado {
	private int cantidadCaras;

	public Dado() {
		this.setCaras(6);
	}

	private void setCaras(int caras) {
		this.cantidadCaras = caras;
	}

	public int getValor() {
		int valor;
		valor = (int) (Math.random() * this.cantidadCaras) + 1;
		return valor;
	}

	public ResultadoComparacion comparar(Dado dado) {
		ResultadoComparacion resultado = ResultadoComparacion.MAYOR;
		if (this.getValor() == dado.getValor()) {
			resultado = ResultadoComparacion.IGUAL;
		} else if (this.getValor() < dado.getValor()) {
			resultado = ResultadoComparacion.MENOR;
		}
		return resultado;

	}

	public void mostrarComparacion(Dado dado) {
		ResultadoComparacion resultado;
		resultado = this.comparar(dado);

		switch (resultado) {
		case MAYOR:
			System.out.println("Soy mayor");
			break;
		case IGUAL:
			System.out.println("Somos iguales");
			break;
		case MENOR:
			System.out.println("Soy menor");
			break;
		}
	}
}
