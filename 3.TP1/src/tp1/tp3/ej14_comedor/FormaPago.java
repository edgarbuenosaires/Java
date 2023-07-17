package tp1.tp3.ej14_comedor;

public interface FormaPago {

	public FormaPago EFECTIVO = new Efectivo();
	public FormaPago DEBITO = new Debito();
	public FormaPago CREDITO = new Credito();

	public abstract boolean tieneDescuento();
}
