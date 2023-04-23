package tp1.tp3.ej05._archivos;

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
		for (Archivo archivo : archivos) {
			if (archivo.estaAbierto()) {
				archivo.cerrar();
			}
		}
	}

	public int cantidadArchivosDeTexto() {
		int cont = 0;
		for (Archivo a : archivos) {
			if (a instanceof ArchivoTexto) {
				cont++;
			}
		}
		return cont;
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
				ArchivoTexto archTexto = (ArchivoTexto) a;
				if (archTexto.esUTF8()) {
					archTexto.cifrar();
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