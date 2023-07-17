package tp1.tp4.ej02_BarajaEspanola;

public class Test {

	public static void main(String[] args) {
		Baraja b = new Baraja();
		System.out.println("ESTA ORDENADA??? " + b.estaOrdenada());
		System.out.println("SE DESORDENA");
		b.desordenar();
		System.out.println("SE MUESTRAN");
		b.mostrarCartas();
		System.out.println("ESTA ORDENADA??? " + b.estaOrdenada());
	}

}
