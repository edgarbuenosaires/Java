package tp1.tp3.ej13_softwareTest;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente {
	private TipoProgramacion tipo;
	private ArrayList<Metodo> metodos;

	public FuenteProgramacion(TipoProgramacion tipo) {
		super();
		this.tipo = tipo;
		this.metodos = new ArrayList<>();
	}

	@Override
	public double indiceCalidad() {
		return promedioIndiceCalidadMetodos();
	}

	public Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;

		while (i < this.metodos.size() && metodoEncontrado == null) {
			Metodo m = this.metodos.get(i);
			if (m.getNombre().equals(nombreMetodo)) {
				metodoEncontrado = m;

			} else {
				i++;
			}
		}
		return metodoEncontrado;
	}

	public double promedioIndiceCalidadMetodos() {
		double acu = 0;
		int cantMetodos = this.metodos.size();
		double promedio = 0;

		for (Metodo m : metodos) {
			acu += m.indiceCalidad();
		}
		if (cantMetodos > 0) {
			promedio = acu / cantMetodos;
		}
		return promedio;
	}

}
