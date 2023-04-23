package ccyc11_Interfaces_Default;

public class Persona implements Identificable {

	private String dni;

	public Persona(String dni) {
		super();
		this.dni = dni;
	}

	public void mostrarIdentificacion() {
		System.out.println(this.dni);
	}

}
