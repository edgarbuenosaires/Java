package tp1.tp3.ej13_softwareTest;

public class Metodo implements Calificable {
	private String nombre;
	private int cantParametros;
	private int cantInstrucciones;
	private int cantRamificacionesFlujo;

	public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificacionesFlujo) {
		super();
		this.nombre = nombre;
		this.cantParametros = cantParametros;
		this.cantInstrucciones = cantInstrucciones;
		this.cantRamificacionesFlujo = cantRamificacionesFlujo;
	}

	public void mostrarDatos() {
		System.out.println(
				cantParametros + " | " + cantInstrucciones + " | " + cantRamificacionesFlujo + indiceCalidad());

	}

	@Override
	public double indiceCalidad() {
		return 5 / (cantParametros + 1) + 20 / cantInstrucciones + 3 / (cantRamificacionesFlujo + 1);
	}

	public String getNombre() {

		return this.nombre;
	}
}
