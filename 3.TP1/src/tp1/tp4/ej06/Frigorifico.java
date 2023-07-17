package tp1.tp4.ej06;

import java.util.ArrayList;

public class Frigorifico {
	private String nombre;
	private String[] paises;
	private Vendedor[] vendedores;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Producto> productos;
	private ArrayList<Cliente> clientes;
	private final int CANT_VENDEDORES = 20;

	public Frigorifico(String nombre, String[] paises) {
		super();
		this.nombre = nombre;
		this.paises = paises; // RE VER ESTO PORQUE NO DEBERIA SER ASI.
		this.vendedores = new Vendedor[CANT_VENDEDORES];
		this.clientes = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		this.productos = new ArrayList<>();
		;
	}

	public void informarCantPedidos() {
		int[][] cantidades;
		int cantPaises = Pais.values().length;
		int v;
		int p;
		Cliente cli;

		cantidades = new int[this.vendedores.length][cantPaises];
		for (Pedido pedido : this.pedidos) {
			v = pedido.getIDVendedor();
			cli = buscarCliente(pedido.getCuitCliente());
			p = cli.getPais().ordinal();
			// cantidades [v][p] = cantidades [v][p] + 1
			cantidades[v][p]++;
		}
		mostrarCantPedidos(cantidades);
	}

	public int[] clientesPorPais() {
		int[] cantidades;
		int cantPaises = Pais.values().length;

		cantidades = new int[cantPaises];
		for (Cliente c : this.clientes) {
			cantidades[c.getPais().ordinal()]++;
		}
		return cantidades;
	}

	public String paisMasRentable() {
		double[] recaudaciones;
		int idxMax;

		recaudaciones = recaudacionesPorPais();
		idxMax = indexMaximo(recaudaciones);
		return Pais.values()[idxMax].name();
	}

	private Cliente buscarCliente(String CUITcliente) {
		Cliente cliEncontrado = null;
		int i = 0;

		while (i < this.clientes.size() && cliEncontrado == null) {
			if (this.clientes.get(i).equals(CUITcliente)) {
				cliEncontrado = this.clientes.get(i);
			} else {
				i++;
			}
		}
		return cliEncontrado;
	}

	private void mostrarCantPedidos(int[][] cants) {
		for (int v = 0; v < cants.length; v++) {
			System.out.println("Vendedor " + this.vendedores[v].getNombre() + "\t");
			for (int p = 0; p < cants[v].length; p++) {
				System.out.println(cants[v][p] + "\t");
			}
			System.out.println("\n");
		}
	}

	private double[] recaudacionesPorPais() {
		double[] recaudaciones;
		int cantPaises = Pais.values().length;
		Cliente cli;

		recaudaciones = new double[cantPaises];
		for (Pedido pedido : this.pedidos) {
			cli = buscarCliente(pedido.getCuitCliente());
			recaudaciones[cli.getPais().ordinal()] += pedido.costo();
		}
		return recaudaciones;
	}

	private int indexMaximo(double[] valores) {
		double max = -1;
		int idxMax = -1;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > max) {
				max = valores[i];
				idxMax = i;
			}
		}
		return idxMax;
	}

}
