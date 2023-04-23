package ccyc01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cuanto vale cada articulo?");
		double valorUnitario = input.nextDouble();
		System.out.println("Cuantos articulos se vendieron en el mes?");
		int cantVendida = input.nextInt();
		Vendedor v = new Vendedor(valorUnitario, cantVendida);
		System.out.println(v.obtenerSueldo());
		input.close();
		;
	}

}
