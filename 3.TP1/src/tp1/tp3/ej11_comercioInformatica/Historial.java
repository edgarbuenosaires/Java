package tp1.tp3.ej11_comercioInformatica;

import java.util.ArrayList;

public class Historial {
	private ArrayList<Facturable> facturables;

	public Historial() {
		super();
		this.facturables = new ArrayList<>();
	}

	public void agregarFacturable(Facturable f) {
		this.facturables.add(f);
	}

	public double montoTotalFacturado() {
		double total = 0;

		for (Facturable f : facturables) {
			total += f.getMontoFacturacion();
		}
		return total;

	}

	public int cantServiciosSimples() {

		final int DIF = 2;
		int cont = 0;

		for (Facturable f : facturables) {
			if (f instanceof ServicioDeReparacion) {
				ServicioDeReparacion sdr = (ServicioDeReparacion) f;
				if (sdr.getDificultad() <= DIF) {
					cont++;
				}
			}

		}
		return cont;
	}
}
