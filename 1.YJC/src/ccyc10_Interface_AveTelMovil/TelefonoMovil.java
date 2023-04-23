package ccyc10_Interface_AveTelMovil;

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {
	public void llamar() {
		System.out.print("Llamando....");
	}

	@Override
	public void enviarMensaje(String mensaje) {
		encender();
		System.out.println("Conectando con la API de Whatsapp para enviar un mensaje que dice " + mensaje);

	}
}