package tp1.parcial1.naves;

public class PuntoDeAtraque implements Manifestable {

	private Nave naveEnganchada;

	public void imprimirManifiesto() {
		if (!estaDisponible()) {
			this.naveEnganchada.imprimirManifiesto();
		} else {
			System.out.println("<Ninguna nave>");
		}
	}

	public boolean estaDisponible() {
		return this.naveEnganchada == null;
	}

	public boolean estacionarNave(Nave nave) {
		boolean pudo = false;
		String matricula = nave.getMatricula();
		if (estaDisponible() && noHayOtraMatriculaIgual(matricula)) {
			this.naveEnganchada = nave;
			pudo = true;
		}
		return pudo;
	}

	public boolean noHayOtraMatriculaIgual(String matricula) {
		boolean hayDosIguales = true;
		if (naveEnganchada != null) {
			naveEnganchada.getMatricula().equals(matricula);
			hayDosIguales = false;
		}

		return hayDosIguales;

	}

	public Nave getNaveEnganchada() {
		return naveEnganchada;
	}

}
