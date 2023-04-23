package poo;
//La clase furgoneta a traves de la palabra extends, hereda de la clase coche (Ahora
//debenida en super clase) */
public class V40_Furgoneta extends V28_Coche {

	private int capacidadDeCarga;
	private int plazasExtra;

	public V40_Furgoneta(int capCar, int plaExt) { // El coonstructor de coche tambien se hereda.
		super(); // LLAMA AL CONSTRUCTOR DE LA CASE PADRE, en este caso "Coche"
		this.capacidadDeCarga = capCar;
		this.plazasExtra = plaExt;
	}

	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidadDeCarga + " y las plazas son: " + plazasExtra;
	}
}
