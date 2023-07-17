package tp1.tp3.ej11_comercioInformatica;

public class ServicioDeArmado extends Servicio {
	private double VALOR_HORA = 250;

	public ServicioDeArmado(double vALOR_HORA) {
		super();
		VALOR_HORA = vALOR_HORA;
	}

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}

}
