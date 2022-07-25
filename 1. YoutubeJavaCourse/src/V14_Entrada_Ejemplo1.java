import java.util.Scanner;

public class V14_Entrada_Ejemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre por favor:");
		String nombreUsuario = entrada.nextLine();
		System.out.println("Introduce edad, por favor");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombreUsuario + " el anio que viene tendras " + (edad + 1) + " anios");
		entrada.close();
	}

}
