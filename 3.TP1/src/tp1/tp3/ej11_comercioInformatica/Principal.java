package tp1.tp3.ej11_comercioInformatica;

public class Principal {
	public static void main(String[] args) {

		Historial h = new Historial();

		Insumo ins1 = new Insumo("Mouse", 30, 150, Tipo.PERIFERICO);
		Insumo ins2 = new Insumo("CPU", 43, 300, Tipo.HARDWARE);

		ServicioDeArmado sa3 = new ServicioDeArmado(200);
		ServicioDeArmado sa4 = new ServicioDeArmado(150);

		ServicioDeReparacion sr5 = new ServicioDeReparacion(2);
		ServicioDeReparacion sr6 = new ServicioDeReparacion(5);

		h.agregarFacturable(ins1);
		h.agregarFacturable(ins2);
		h.agregarFacturable(sa3);
		h.agregarFacturable(sa4);
		h.agregarFacturable(sr5);
		h.agregarFacturable(sr6);

		System.out.println("El monto total facturado es " + h.montoTotalFacturado());
		System.out.println("La cantidad de servicios simples es " + h.cantServiciosSimples());
	}

}
