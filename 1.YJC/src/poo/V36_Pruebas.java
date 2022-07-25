package poo;

public class V36_Pruebas {
	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Jose Francisco");
		Empleados trabajador2 = new Empleados("Rosa Gallito");
		Empleados trabajador3 = new Empleados("Antonio Fresco");

		System.out.println(trabajador1); // hay que poner el metodo tostring en la clase sino sale raro.
		System.out.println(trabajador2);
		System.out.println(trabajador3);

		trabajador1.cambiaSeccion("Recursos Humanos");
		/* trabajador1.cambiaNombre("Debora Encarnacion"); */ // no se puede cambiar porque es CONSTANTE

		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());

	}
}

class Empleados {

	private final String nombre; // Con FINAL una vez dado el valor a la variable no puede ser modificado.
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1; // al ser static se convierte en variable de clase y no de objeto como nombre o
	// seccion, por eso eclipse la pone en cursiva.

	public Empleados(String nom) { // CONSTRUCTOR
		nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
	}

	public void cambiaSeccion(String secc) { // METODO SETTER
		this.seccion = secc; // THIS LLEVA EL CAMPO DE CLASE
	}

	/*
	 * public void cambiaNombre(String nombre) { this.nombre = nombre; }
	 */

	public String devuelveDatos() { // METODO GETTER
		return "El nombre es: " + nombre + " la seccion es: " + seccion + "y la ID: " + Id;
	}

	public static String dameIdSiguiente() {
		return "El ID siguiente es: " + IdSiguiente;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", seccion=" + seccion + "]" + " ID: " + Id;
	}

}
