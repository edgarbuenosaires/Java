package tp1.tp5.ej05;

public class SuppOrt {

	private ColaDeTickets colaDeTickets;

	public Ticket eliminarTicket(int id) {
		Ticket ticketBorrado = null;
		Ticket ticketCent = new Ticket();
		Ticket ticketActual;

		colaDeTickets.add(ticketCent);
		ticketActual = colaDeTickets.remove();
		while (ticketActual != ticketCent) {
			if (ticketActual.getId() == id) {
				ticketBorrado = ticketActual;
			} else {
				colaDeTickets.add(ticketActual);
			}
			ticketActual = colaDeTickets.remove();
		}
		return ticketBorrado;
	}

	public int[][] cantTicketsXSectorPrioridad() {
		Ticket ticketCentinela;
		Ticket ticketActual;
		int[][] cants;

		cants = new int[Sector.values().length][Prioridad.values().length];
		ticketCentinela = new Ticket();
		colaDeTickets.add(ticketCentinela);
		ticketActual = colaDeTickets.remove();

		while (ticketActual != ticketCentinela) {
			int fila = ticketActual.getSector().ordinal();
			int columna = ticketActual.getPrioridad().ordinal();
			cants[fila][columna]++;
			colaDeTickets.add(ticketActual);
			ticketActual = colaDeTickets.remove();
		}

		return cants;
	}

	public void procesarTickets() {
		// Una vez que el ticket es procesado, se quita de la cola.
		Ticket ticketActual;

		while (!colaDeTickets.isEmpty()) {
			ticketActual = colaDeTickets.remove();
			ticketActual.procesar();

		}
	}

}
