package ccyc10_Interface_AveTelMovil;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {
	private ArrayList<EnviadorDeMensaje> mensajeros;

	public PartidoDelBuenCodigo() {
		super();
		this.mensajeros = new ArrayList<>();
	}

	public void agregarMensajero(EnviadorDeMensaje mensajero) {
		this.mensajeros.add(mensajero);
	}

	public void hacerCampania() {
		for (EnviadorDeMensaje mensajero : mensajeros) {
			mensajero.enviarMensaje("Vote por el Partido del Buen Codigo");
		}

	}
}
