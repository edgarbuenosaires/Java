package ar.edu.ort.as.thp.tp3.ej04;

public class Collar {
	private String chapita;

	public Collar(String chapita) {
		this.chapita = chapita;
	}

	public String getChapita() {
		return chapita;
	}

	@Override
	public String toString() {
		return "Collar [chapita=" + chapita + "]";
	}

}
