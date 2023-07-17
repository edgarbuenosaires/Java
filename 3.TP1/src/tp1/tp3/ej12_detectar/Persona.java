package tp1.tp3.ej12_detectar;

public class Persona implements Priorizable, Notificable {
	public final static int EDAD_MAX_PRI = 60;
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private MotivoTest motivo;

	public Persona(String dni, String nombre, String apellido, int edad, MotivoTest motivo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.motivo = motivo;
	}

	public int getPrioridad() {
		return Priorizable.PRIORIDAD_MAX;

	}

	public void notificar(String mensaje) {
		System.out.println(mensaje);
	}

	public int getEdad() {
		return this.edad;
	}

	public MotivoTest getMotivo() {
		return this.motivo;
	}

}
