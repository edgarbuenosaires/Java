package ar.edu.ort.as.thp.tp2.ej09;

public class Test {

	public static void main(String[] args) {

		Domicilio domicilio1 = new Domicilio("Yatay", "240", "Almagro");
		Persona persona1 = new Persona("12345678", "Fulano", "Gomez", domicilio1);
		CuentaBancaria cta1 = new CuentaBancaria(Tipo.CAJA_DE_AHORRO, persona1);
		Persona persona2 = new Persona("9123456", "Mengana", "Torres", domicilio1);
		CuentaBancaria cta2 = new CuentaBancaria(Tipo.CUENTA_CORRIENTE, persona2);

		System.out.println("<<<<<<<<<<PRIMER TITULAR>>>>>>>>>>");
		System.out.println(persona1.toString());
		System.out.println(cta1.toString());
		
		// Se deposita 15.000
		System.out.println("El saldo inicial es: " + cta1.obtenerSaldo());
		cta1.depositar(15000);
		System.out.println("El nuevo saldo es: "+cta1.obtenerSaldo());
		
		// Se extrae 10.000
		cta1.extraer(10000);
		System.out.println("El nuevo saldo es: "+cta1.obtenerSaldo());
		
		// Se intenta extraer 10.000 nuevamente
		cta1.extraer(10000);
		System.out.println("El nuevo saldo es: "+cta1.obtenerSaldo());

		System.out.println("\n<<<<<<<<<<SEGUNDO TITULAR>>>>>>>>>>");
		System.out.println(persona2.toString());
		System.out.println(cta2.toString());
	}

}
