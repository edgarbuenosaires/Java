package tp1.tp4.ej06;

import java.util.ArrayList;

public class Pedido {
	private int IDVendedor;
	private String CUITCliente;
	private ArrayList<ItemPedido> items;

	public Pedido(int iDVendedor, String cUITCliente) {
		super();
		IDVendedor = iDVendedor;
		CUITCliente = cUITCliente;
		this.items = new ArrayList<>();
	}

	public double costo() {
		double acu = 0;
		for (ItemPedido item : this.items) {
			acu += item.costo();
		}
		return acu;
	}

	public int getIDVendedor() {
		return this.IDVendedor;
	}

	public String getCuitCliente() {
		return this.CUITCliente;
	}
}
