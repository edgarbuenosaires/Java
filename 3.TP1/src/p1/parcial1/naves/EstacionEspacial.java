package p1.parcial1.naves;

import java.util.ArrayList;

public class EstacionEspacial {
	private ArrayList<Atraque> atraques;

	public EstacionEspacial(ArrayList<Atraque> atraques) {
		super();
		this.atraques = new ArrayList<>();
	}

	public void imprimirManifiestos() {
		Nave nav = null;
		for (Atraque a : atraques) {
			if (a.naveAtracada()) {
				nav = a.getNave();
				nav.informarManifiesto();
			}
		}
	}

	public boolean estacionarNave(Nave nave) {
		boolean estacionada = false;

		if (estaEnCondiciones(nave)) {
			estacionada = agregarEnAtraqueLibre(nave);
		}
		return estacionada;
	}

	public boolean agregarEnAtraqueLibre(Nave nav) {
		int i = 0;
		Atraque aLibre = null;
		Atraque a = null;
		boolean estacionada = false;

		// REVISAR ESTE METODO
		while (aLibre == null && i < this.atraques.size()) {
			a = this.atraques.get(i);
			if (a == null) {
				aLibre = a;
				aLibre.agregarNave(nav);
				estacionada = true;
			} else {
				i++;
			}
		}
		return estacionada;
	}

	public boolean estaEnCondiciones(Nave nave) {
		return nave.estaEnCondiciones(nave);
	}

}
