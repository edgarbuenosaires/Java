package tp1.tp3.ej05._archivos;

public class Principal {

	public static void main(String[] args) {
		Computadora c = new Computadora();
		c.agregarArchivo(new ArchivoTexto("Libro de Java", 200, "C/", true, "UTF-8"));
		c.agregarArchivo(new ArchivoTexto("Lista de Compras", 100, "D:/", true, "UTF-8"));

		c.mostrarArchivos();
		System.out.println("Archivos de texto: " + c.cantidadArchivosDeTexto());
		c.cifrarArchivos();
	}

}
