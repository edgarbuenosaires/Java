import javax.swing.JOptionPane;

public class V21_Comprueba_Mail {

	public static void main(String[] args) {
		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("Introduzca su correo electronico:");

		for (int i = 0; i < mail.length(); i++) {
			// al evaluar un char se debe utilizar comillas simples ' '
			if (mail.charAt(i) == '@') {
				arroba = true;
			}
		}
		if (arroba == true) {
			System.out.println("El mail es correcto");

		} else {
			System.out.println("El mail es incorrecto");
		}

	}

}
