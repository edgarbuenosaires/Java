package tp1.tp3.ej11_comercioInformatica;

public class Insumo implements Facturable {
	private String nombre;
	private double porcGanancia;
	private double precioLista;
	private Tipo tipo;

	public Insumo(String nombre, double porcGanancia, double precioLista, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.porcGanancia = porcGanancia;
		this.precioLista = precioLista;
		this.tipo = tipo;
	}

	public double getMontoFacturacion() {
		double precio;

		precio = Matematica.sumarPorcentaje(this.precioLista, this.porcGanancia);
		return Matematica.sumarPorcentaje(precio, IVA);
	}
}
