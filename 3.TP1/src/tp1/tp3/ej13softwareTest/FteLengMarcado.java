package tp1.tp3.ej13softwareTest;

public class FteLengMarcado extends Fuente {
	private int tamanioArchEnKb;
	private FuentesLengMarcado fuente;

	public FteLengMarcado(String nombre, String ubicacion, int tamanioArchEnKb, FuentesLengMarcado fuente) {
		super(nombre, ubicacion);
		this.tamanioArchEnKb = tamanioArchEnKb;
		this.fuente = fuente;
	}

	@Override
	public void indiceDeCalidad() {
		// TODO Auto-generated method stub

	}

}
