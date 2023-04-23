package ccyc06_Oop02;

import java.util.ArrayList;

public class Sucursal {
	private ArrayList<Instrumento> instrumentos;
	private String nombre;

	public Sucursal(String nombre) {
		super();
		this.nombre = nombre;
		this.instrumentos = new ArrayList<>();
	}

	public void agregarInstrumento(Instrumento ins) {
		this.instrumentos.add(ins);
	}

	public void listarInstrumentos() {

		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento);
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {

		ArrayList<Instrumento> instEncontrados = new ArrayList<>();

		for (Instrumento inst : this.instrumentos) {
			if (inst.getTipo() == tipo) {
				instEncontrados.add(inst);
			}
		}

		return instEncontrados;
	}

	public Instrumento borrarInstrumento(String ID) {
		Instrumento instABorrar = this.buscarInstrumento(ID);
		this.instrumentos.remove(instABorrar);
		return instABorrar;
	}

	private Instrumento buscarInstrumento(String iD) {
		Instrumento encontrado = null;
		int i = 0;

		while (i < this.instrumentos.size() && encontrado == null) {
			if (instrumentos.get(i).getID().equalsIgnoreCase(iD)) {
				encontrado = instrumentos.get(i);
			}
			i++;

		}

		return encontrado;

	}

	public double[] porcInstPorTipo() {
		final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
		double[] porcentajes = new double[CANT_INSTRUMENTOS];
		for (Instrumento inst : this.instrumentos) {
			porcentajes[inst.getTipo().ordinal()]++;
		}
		this.absolutoAPorcentaje(porcentajes);
		return porcentajes;
	}

	private void absolutoAPorcentaje(double[] porcentajes) {
		for (int i = 0; i < porcentajes.length; i++) {
			porcentajes[i] = porcentajes[i] * 100 / this.instrumentos.size();
		}
	}

}
