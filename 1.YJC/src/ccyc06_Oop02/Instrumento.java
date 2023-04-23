package ccyc06_Oop02;

public class Instrumento {
	private String ID;
	private double precio;
	private TipoInstrumento tipo;

	public Instrumento(String iD, double precio, TipoInstrumento tipo) {
		super();
		ID = iD;
		this.precio = precio;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Instrumento [ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + "]";
	}

	public TipoInstrumento getTipo() {
		return this.tipo;
	}

	public String getID() {

		return this.ID;
	}

}
