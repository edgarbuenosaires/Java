package tp1.tp3.ej05_archivos;

public class ArchivoTexto extends Archivo {

	private String codificacion;

	public ArchivoTexto(String nom, double pes, String loc, boolean abi, String cod) {
		super(nom, pes, loc, abi);
		this.codificacion = cod;
	}

	public void cifrar() {
		System.out.println("Archivo cifrado");
	}

	public boolean esUTF8() {
		return this.codificacion.equalsIgnoreCase("UTF-8");
	}

}
