package tp1.tp5.ej05;

public class Ticket {
	private int id;
	private String fecha;
	private Sector sector;
	private Prioridad prioridad;

	public Ticket() {
	}

	public int getId() {
		return id;
	}

	public Sector getSector() {
		return sector;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}
	
	public void procesar() {
		System.out.println("Se soluciiono el problema");
	}

}
