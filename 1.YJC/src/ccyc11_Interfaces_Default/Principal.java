package ccyc11_Interfaces_Default;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("1234");
		Reserva r = new Reserva();
		Automovil a = new Automovil();

		p.mostrarIdentificacion();
		r.mostrarIdentificacion();
		a.mostrarIdentificacion();
	}
}
