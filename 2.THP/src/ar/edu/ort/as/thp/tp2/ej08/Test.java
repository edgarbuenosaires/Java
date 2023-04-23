package ar.edu.ort.as.thp.tp2.ej08;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjeta1;

		// Instancio una tarjeta
		tarjeta1 = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez", 10000);
		
		// Se realiza compra por 4000
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1.toString());
		
		// Se actualiza el limite a 3000
		tarjeta1.actualizarLimite(3000);
		
		// Intento realizar compra por sobre el limite
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1.toString());
		
	}

}
