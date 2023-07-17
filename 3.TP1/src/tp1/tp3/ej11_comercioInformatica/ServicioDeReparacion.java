package tp1.tp3.ej11_comercioInformatica;

public class ServicioDeReparacion extends Servicio {
	private final double VALOR_HORA = 180;
	private final int MIN_DIFIC = 3;
	private final double INCR_DIF = 25;
	private int dificultad;

	public ServicioDeReparacion(int dificultad) {
		super();
		this.dificultad = dificultad;
	}

	public double getPrecio() {
		double precio = super.getPrecio();

		if (this.dificultad > MIN_DIFIC) {
			precio = Matematica.sumarPorcentaje(precio, INCR_DIF);
		}
		return precio;
	}

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}

	public int getDificultad() {
		return dificultad;
	}

}
