import javax.swing.JOptionPane;

public class V22_Comprueba_Mail {

	public static void main(String[] args) {

		int arroba = 0;
		boolean punto = false;
		String mail = JOptionPane.showInputDialog("Introduzca su correo electronico:");

		for (int i = 0; i < mail.length(); i++) {
			// al evaluar un char se debe utilizar comillas simples ' '
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;

			}
		}
		if (arroba == 1 && punto == true) {
			System.out.println("El mail es correcto");

		} else {
			System.out.println("El mail es incorrecto");
		}

	}

}