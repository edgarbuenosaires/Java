import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {

		String clave = "Edgardo";

		String pass = "";

		while (clave.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contrasenia por favor");

			if (clave.equals(pass) == false) {

				System.out.println("Contrasenia Incorrecta");

			}

		}
		System.out.println("Contrasenia correcta. Acceso permitido");

	}

}
