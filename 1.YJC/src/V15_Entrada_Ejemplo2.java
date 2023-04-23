import javax.swing.JOptionPane;

public class V15_Entrada_Ejemplo2 {
	public static void main(String[] args) {

		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad = JOptionPane.showInputDialog("Introduce la edad"); // Se usa String porque ShowInputDialog devuelve
																		// String.
		int edadUsuario = Integer.parseInt(edad); // Se usa el metodo parseInt de la clase Integer para pasar de String
													// a int.
		edadUsuario++;
		System.out.println("Hola " + nombreUsuario + " tienes " + edad + " anios de edad y el anio que viene tendras "
				+ edadUsuario);

	}

}
