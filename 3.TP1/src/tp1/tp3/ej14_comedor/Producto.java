package tp1.tp3.ej14_comedor;

public abstract class Producto {
	private String nombre;
	private String precio;

	public Producto(String nombre, String precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public abstract double getDescuento();

}
