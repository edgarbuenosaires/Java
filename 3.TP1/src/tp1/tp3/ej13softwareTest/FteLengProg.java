package tp1.tp3.ej13softwareTest;

import java.util.ArrayList;

public class FteLengProg extends Fuente {
	private FuentesLengProgram fuente;
	private ArrayList<Metodo> metodos;

	public FteLengProg(String nombre, String ubicacion, FuentesLengProgram fuente) {
		super(nombre, ubicacion);
		this.fuente = fuente;
		this.metodos = new ArrayList<>();
	}

	@Override
	public double indiceDeCalidad() {
		double indice = this.promedioDeLosMetodos();
		return indice;
	}

	private double promedioDeLosMetodos() {
		// TODO Auto-generated method stub
		return 0;
	}

}