package tp1.tp4.ej06;

public class ItemPedido {
	private Producto producto;
	private int cantidad;

	public double costo() {
		return this.cantidad * this.producto.getPrecio();
	}
}
