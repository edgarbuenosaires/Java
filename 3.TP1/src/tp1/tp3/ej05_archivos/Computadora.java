package tp1.tp3.ej05_archivos;

import java.util.ArrayList;

public class Computadora {
	private ArrayList<Archivo> archivos;

	public Computadora() {
		super();
		this.archivos = new ArrayList<>();
	}

	public void agregarArchivo(Archivo a) {
		this.archivos.add(a);
	}

	public void mostrarArchivos() {
		for (Archivo archivo : archivos) {
			System.out.println(archivo);
		}
	}

	public void cerrarTodos() {
		for (Archivo a : archivos) {
			if (a.estaAbierto()) {
				a.cerrar();
			}
		}
	}

	public int cantidadArchivosDeTexto() {
		int cant = 0;
		for (Archivo a : archivos) {
			if (a instanceof ArchivoTexto) {
				cant++;
			}
		}
		return cant;
	}

	public void cifrarArchivos() {

//		// Forma 1
//		for (Archivo a : archivos) {
//			if (a instanceof ArchivoTexto && ((ArchivoTexto) a).esUTF8()) {
//				((ArchivoTexto) a).cifrar();
//			}
//
//		}

		// Forma 2
		for (Archivo a : archivos) {
			if (a instanceof ArchivoTexto) {
				ArchivoTexto at = (ArchivoTexto) a;
				if (at.esUTF8()) {
					at.cifrar();
				}
			}
		}

	}

	public double duracionPromedio() {
		int cant = 0;
		int acuSegundos = 0;
		double prom = 0;

		for (Archivo a : archivos) {
			if (a instanceof ArchivoMultimedia) {
				cant++;
				acuSegundos += ((ArchivoMultimedia) a).getDuracion();
			}
		}
		if (cant > 0) {
			prom = acuSegundos * 1.0 / cant;
		}
		return prom;
	}

	public ArrayList<ArchivoVideo> videosFullHD() {
		ArrayList<ArchivoVideo> listaVideos = new ArrayList<>();

		for (Archivo a : this.archivos) {
			if (a instanceof ArchivoVideo && ((ArchivoVideo) a).esFullHD()) {
				listaVideos.add((ArchivoVideo) a);
			}
		}
		return listaVideos;
	}
}
