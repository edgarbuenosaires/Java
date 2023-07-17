package tp1.tp3.ej13_softwareTest;

import java.util.ArrayList;

public class Sophie {
	private ArrayList<Programa> programas;

	public Sophie() {
		super();
		this.programas = new ArrayList<>();
	}

	public ArrayList<Programa> programasPorDebajoDe(double umbralMinimo) {

		ArrayList<Programa> lista = new ArrayList<>();

		for (Programa p : lista) {
			if (p.indiceCalidad() < umbralMinimo) {
				lista.add(p);
			}
		}
		return lista;
	}
}
