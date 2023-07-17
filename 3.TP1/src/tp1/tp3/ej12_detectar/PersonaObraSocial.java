package tp1.tp3.ej12_detectar;

public class PersonaObraSocial extends Persona {
	private String nombrePrestador;
	private int numeroAfiliado;

	public PersonaObraSocial(String dni, String nombre, String apellido, int edad, MotivoTest motivo,
			String nombrePrestador, int numeroAfiliado) {
		super(dni, nombre, apellido, edad, motivo);
		this.nombrePrestador = nombrePrestador;
		this.numeroAfiliado = numeroAfiliado;
	}

	public int getPrioridad() {
		int prioridad;
		if (getEdad() >= EDAD_MAX_PRI || getMotivo() == MotivoTest.CONTACTO_ESTRECHO) {
			prioridad = PRIORIDAD_MAX;
		} else {
			prioridad = PRIORIDAD_MIN;
		}
		return prioridad;
	}
}
