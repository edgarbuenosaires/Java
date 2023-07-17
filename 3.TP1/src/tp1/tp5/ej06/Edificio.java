package tp1.tp5.ej06;

public class Edificio {

	public static final int CANT_COLAS = 4;
	private ColaDeFacturas[] colasDeFacturas;

	public void catalogar(PilaDeFacturas piladefacturas) {
		while (!piladefacturas.isEmpty()) {
			Factura f = piladefacturas.pop();
			colasDeFacturas[f.getTipo().ordinal()].add(f);
			// TIENE QUE QUEDAR ORDENADA POR MES ASCENDENTE
			// EN UDS. CONFÍO ;)
		}
	}

	public double[] montoAAbonarPorTipo() {
		double[] totales = new double[TipoFactura.values().length];
		for (int i = 0; i < colasDeFacturas.length; i++) {
			ColaDeFacturas colaActual = colasDeFacturas[i];
			acumularEnCola(colaActual, totales);
		}
		return totales;
	}

	private void acumularEnCola(ColaDeFacturas cf, double[] totales) {
		Factura fCentinela = new Factura();
		cf.add(fCentinela);
		Factura fActual = cf.remove();
		while (fActual != fCentinela) {
			// Proceso...
			totales[fActual.getTipo().ordinal()] += fActual.getMonto();

			// esto es como el i++ del while.
			cf.add(fActual);
			fActual = cf.remove();
		}
	}

}