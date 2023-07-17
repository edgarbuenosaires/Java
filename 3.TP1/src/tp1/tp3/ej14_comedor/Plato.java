package tp1.tp3.ej14_comedor;

public class Plato extends Producto {
	private final static double DCTO = 0.05;
	private final static double DCTO_ADIC_CELIACO = 0.02;
	private String descripcion;
	private boolean esVegano;
	private boolean aptoCeliaco;

	public Plato(String nombre, String precio, String descripcion, boolean esVegano, boolean aptoCeliaco) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.esVegano = esVegano;
		this.aptoCeliaco = aptoCeliaco;
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
