package ccyc06_Oop02;

import java.util.ArrayList;

public class Fabrica {
	private ArrayList<Sucursal> sucursales;

	public Fabrica() {
		super();
		this.sucursales = new ArrayList<>();
	}

	public void agregarSucursal(Sucursal suc) {
		this.sucursales.add(suc);
	}

	public void listarInstrumentos() {
		for (Sucursal sucursal : sucursales) {
			System.out.println(sucursal.getNombre());
			sucursal.listarInstrumentos();
		}
	}

	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
		ArrayList<Instrumento> instEncontrados = new ArrayList<>();

		for (Sucursal suc : sucursales) {
			// addAll agrega listas de objetos
			instEncontrados.addAll(suc.instrumentosPorTipo(tipo));
		}
		return instEncontrados;
	}

	public Instrumento borrarInstrumento(String ID) {
		Instrumento borrado = null;
		int i = 0;
		while (i < this.sucursales.size() && borrado == null) {
			borrado = sucursales.get(i).borrarInstrumento(ID);
			i++;
		}
		return borrado;
	}

	public double[] porcInstPorTipo(String nomSuc) {
		double[] porcentajes = null;
		Sucursal sucEncontrada = buscarSucursal(nomSuc);
		if (sucEncontrada != null) {
			porcentajes = sucEncontrada.porcInstPorTipo();

		}
		return porcentajes;
	}

	private Sucursal buscarSucursal(String nomSuc) {
		int i = 0;
		Sucursal sucEncontrada = null;
		while (i < this.sucursales.size() && sucEncontrada == null) {
			if (this.sucursales.get(i).getNombre().equalsIgnoreCase(nomSuc)) {
				sucEncontrada = sucursales.get(i);
			}
			i++;

		}
		return sucEncontrada;
	}

}
