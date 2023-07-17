package tp1.tp3.ej13_softwareTest;

import java.util.ArrayList;

public class Programa implements Calificable {
	private String id;
	private String nombre;
	private String nomResponsable;
	private boolean pasoPruebasUnitarias;
	private ArrayList<Fuente> fuentes;

	public Programa(String id, String nombre, String nomResponsable, boolean pasoPruebasUnitarias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nomResponsable = nomResponsable;
		this.pasoPruebasUnitarias = pasoPruebasUnitarias;
		this.fuentes = new ArrayList<>();
	}

	public void mostrarDetalleDeMetodo(String nombreMetodo) {
		Metodo m;

		m = buscarMetodo(nombreMetodo);
		if (m != null) {
			m.mostrarDatos();
		} else {
			System.out.println("No existe el metodo " + nombreMetodo);
		}
	}

	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
		ArrayList<Fuente> lista = new ArrayList<>();
		double promCantidadFuentes = promedioIndiceCalidadFuentes();

		for (Fuente f : lista) {
			if (f.indiceCalidad() > promedioIndiceCalidadFuentes()) {
				lista.add(f);
			}
		}
		return lista;
	}

	private double promedioIndiceCalidadFuentes() {
		double acu = 0;
		int cantFuentes = this.fuentes.size();
		double promedio = 0;

		for (Fuente f : fuentes) {
			acu += f.indiceCalidad();
		}
		if (cantFuentes > 0) {
			promedio = acu / cantFuentes;
		}
		return promedio;
	}

	private Metodo buscarMetodo(String nombreMetodo) {
		int i = 0;
		Metodo metodoEncontrado = null;

		while (i < this.fuentes.size() && metodoEncontrado == null) {
			Fuente f = this.fuentes.get(i);
			if (f instanceof FuenteProgramacion) {
				metodoEncontrado = ((FuenteProgramacion) f).buscarMetodo(nombreMetodo);
			}
			i++;
		}
		return metodoEncontrado;
	}

	@Override
	public double indiceCalidad() {
		double promedio = 0;

		if (pasoPruebasUnitarias) {
			promedio = promedioIndiceCalidadFuentes();
		}
		return promedio;
	}

}
