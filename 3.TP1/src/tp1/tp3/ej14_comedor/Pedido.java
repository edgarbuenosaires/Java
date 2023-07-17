package tp1.tp3.ej14_comedor;

import java.util.ArrayList;

public class Pedido {
	private Mesa mesa;
	private Mozo mozo;
	private Cocinero cocinero;
	private FormaPago formaPago;
	private ArrayList<ItemPedido> items;

	public boolean aCargoDeCocinero(String nom) {
		return false;
	}

	public boolean tieneFormaDePago() {
		return false;
	}

	public int cantBebidas() {
		return 0;
	}

	public void liberarMesa() {

	}

}
