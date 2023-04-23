package ccyc11_Interfaces_Default;

public interface Identificable {

	// al cambiar abstract por default, el metodo se hace concreto
	public default void mostrarIdentificacion() {
		System.out.println(hashCode());
	}
}
