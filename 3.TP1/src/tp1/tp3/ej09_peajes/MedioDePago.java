package tp1.tp3.ej09_peajes;

public abstract class MedioDePago {
	private String descripcion;

	public abstract double getDescuento();

	public String getDescripcion() {
		return descripcion;
	}

}
