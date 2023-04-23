package poo;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class V28_Uso_Coche {

	public static void main(String[] args) {

		// INSTANCIO UN EJEMPLAR DE LA CLASE (RENAULT)
		V28_Coche Renault = new V28_Coche();
		System.out.println(Renault.dimeLargo());
		System.out.println("Metodo getter automatico\n" + Renault.getLargo());

		// INSTANCIO UN EJEMPLAR DE LA CLASE (SEAT)
		V28_Coche Seat = new V28_Coche();// new Coche hace referencia ***al constructor***
		System.out.println(Seat.dimeDatosGenerales());
		Seat.estableceColor(JOptionPane.showInputDialog("Ingrese el color del coche"));
		System.out.println(Seat.dimeColor());
		Seat.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(Seat.dimeAsientos());
		Seat.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(Seat.dimeClimatizador());
		System.out.println(Seat.dimePesoCoche());

		NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale("ar", "AR"));
		// Si se desea forzar el formato español:
		// formatoImporte = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
		System.out.println("El precio final del coche es: " + formatoImporte.format(Seat.dimePrecioCoche()));

	}

}
