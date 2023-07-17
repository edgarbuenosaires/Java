package tp1.tp4.ej06;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;

	public Producto(String codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

}
