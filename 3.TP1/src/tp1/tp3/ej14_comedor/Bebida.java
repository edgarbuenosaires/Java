package tp1.tp3.ej14_comedor;

public class Bebida extends Producto {
	private final static double DCTO_CON_ALCOHOL = 0.03;
	private final static double DCTO_SIN_ALCOHOL = 0.1;
	private int tamanio;
	private boolean tieneAlcohol;

	public Bebida(String nombre, String precio, int tamanio, boolean tieneAlcohol) {
		super(nombre, precio);
		this.tamanio = tamanio;
		this.tieneAlcohol = tieneAlcohol;
	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
