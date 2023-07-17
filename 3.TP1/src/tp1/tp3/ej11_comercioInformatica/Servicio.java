package tp1.tp3.ej11_comercioInformatica;

public abstract class Servicio implements Facturable {

	private int cantHoras;

	public abstract double getValorHora();

	public double getPrecio() {
		return getValorHora() * getValorHora();
	}

	public double getMontoFacturacion() {
		return Matematica.sumarPorcentaje(getPrecio(), IVA / 2);
	}
}
