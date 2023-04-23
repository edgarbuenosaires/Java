package ar.edu.ort.as.thp.tp3.ej02;

public class Test {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("La Empresa");

		empresa.agregarEmpleado("Contable", 1, "Edgardo", "Aguirre");
		empresa.agregarEmpleado("Contable", 1, "Juan", "Perez");
		empresa.agregarEmpleado("Ventas", 1, "Maria", "Nela");
		empresa.agregarEmpleado("Ventas", 2, "Ricardo", "Iglesa");
		empresa.agregarEmpleado("Produccion", 1, "Pedro", "Revollo");
		empresa.agregarEmpleado("Produccion", 1, "Hanibal", "Lecter");
		empresa.agregarEmpleado("Produccion", 2, "Angel", "Roman");
		empresa.agregarEmpleado("Sistemas", 1, "Raul", "Napo");
		
		empresa.listarEmpleados();

	}

}
