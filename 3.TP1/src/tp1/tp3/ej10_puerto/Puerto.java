package tp1.tp3.ej10_puerto;

import java.util.ArrayList;
import java.util.Iterator;

public class Puerto {

	private ArrayList<Amarra> amarras;

	public Puerto() {
		super();
		this.amarras = new ArrayList<>();
	}

	public boolean amarrarEmbarcacion(Embarcacion emb) {
		boolean sePudo = false;
		Amarra amarraLibre;

		if (emb.sePuedeAmarrar()) {
			amarraLibre = buscarAmarreLibre();
			if (amarraLibre != null) {
				sePudo = amarraLibre.amarrar(emb);

			}
		}
		return sePudo;
	}

	private Amarra buscarAmarreLibre() {
		int i = 0;
		Amarra amarraLibre = null;

		while (i < this.amarras.size() && amarraLibre == null) {
			if (this.amarras.get(i).estaDisponible()) {
				amarraLibre = this.amarras.get(i);
			} else {
				i++;
			}
		}
		return amarraLibre;
	}

	public int barcosConAlquilerMayorA(double monto) {
		int cont = 0;

		for (Amarra a : amarras) {
			if (a.getnMontoAlquiler() > monto) {
				cont++;
			}
		}
		return cont;
	}

	public Deportivo barcoConMayorConsumo() {
		double mayorConsumo = 0;
		Deportivo deportivoMayorConsumo = null;

		for (Amarra a : amarras) {
			Embarcacion emb = a.getElBarco();
			if (!a.estaDisponible() && emb instanceof Deportivo) {
				Deportivo dep = (Deportivo) emb;
				if (dep.getConsumo() > mayorConsumo) {
					mayorConsumo = dep.getConsumo();
					deportivoMayorConsumo = dep;
				}
			}
		}
		return deportivoMayorConsumo;
	}

	public void mostrarListado() {
	for (Amarra a : amarras) {
		System.out.println(a);
	}
		
	}
}
