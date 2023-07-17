package tp1.parcial1.naves;

import java.util.ArrayList;

public class EstacionEspacial {

	private final static int CANTIDAD_ATRAQUES = 3;

	private ArrayList<PuntoDeAtraque> atraques;

	public EstacionEspacial() {
		inicializarPuntosDeAtraque();

	}

	private void inicializarPuntosDeAtraque() {
		atraques = new ArrayList<>();
		for (int i = 0; i < CANTIDAD_ATRAQUES; i++) {
			atraques.add(new PuntoDeAtraque());
		}
	}

	public void imprimirManifiestos() {
		int i = 1;
		for (PuntoDeAtraque puntoDeAtraque : atraques) {
			System.out.print("Atraque #" + i++ + ": ");
			puntoDeAtraque.imprimirManifiesto();
		}
	}

	// TODO Refactorear según lo pedido
	public boolean estacionarNave(Nave nave) {
		boolean sePudoEstacionar = false;
		if (nave.sePuedeEstacionar()) {
			PuntoDeAtraque pda = buscarAtraqueLibre();
			if (pda != null) {
				sePudoEstacionar = pda.estacionarNave(nave);
			}
		}
		return sePudoEstacionar;
	}

	private PuntoDeAtraque buscarAtraqueLibre() {
		PuntoDeAtraque pda = null;
		int i = 0;
		while (pda == null && i < this.atraques.size()) {
			if (atraques.get(i).estaDisponible()) {
				pda = atraques.get(i);
			}
			i++;
		}

		return pda;
	}

	public Nave desatracar(String matricula) {
		PuntoDeAtraque pda = null;
		Nave naveEncontrada = null;

		int i = 0;
		while (pda == null && i < this.atraques.size()) {
			if (atraques.get(i).noHayOtraMatriculaIgual(matricula)) {
				pda = atraques.get(i);
				naveEncontrada = pda.getNaveEnganchada();
				pda = null;
			}
			i++;
		}
		return naveEncontrada;

	}

	public boolean buscarNavePorMatricula(String matricula) {
		boolean naveRepetida = false;
		int i = 0;
		while (naveRepetida == false && i < this.atraques.size()) {
			if (atraques.get(i).noHayOtraMatriculaIgual(matricula)) {
				naveRepetida = true;
			}
			i++;
		}
		return naveRepetida;
	}
}
