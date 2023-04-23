package tp1.tp1.ej10;

import java.util.ArrayList;

public class OrtLand {

	private ArrayList<Juego> juegos;

	public OrtLand() {
		super();
		this.juegos = new ArrayList<>();
	}

	public ArrayList<InformeJuegos> obtenerDisponibilidadJuegos() {
		ArrayList<InformeJuegos> lista = new ArrayList<>();

		for (Juego j : this.juegos) {
			InformeJuegos inf = new InformeJuegos(j.getNombre(), j.dameLugaresDisp());
			lista.add(inf);
		}
		return lista;

	}

	public Resultado acomodarJugador(String nomJug, int edad, String nomJue) {
		Resultado res = Resultado.JUEGO_NO_ENCONTRADO;
		Juego ju;
		ju = buscarJuego(nomJue);

		if (ju != null) {
			res = ju.acomodarJugador(nomJue, edad);

		}

		return res;
	}

	private Juego buscarJuego(String nomJue) {
		// TODO Auto-generated method stub
		return null;
	}
}
