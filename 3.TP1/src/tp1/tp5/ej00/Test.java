package tp1.tp5.ej00;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class Test {

	public static void main(String[] args) {
		System.out.println("SACO LOS ELEMENTOS DEL ULTIMO AL PRIMERO");
		PilaNodos<Integer> pilaEnteros = new PilaNodos<>();
		pilaEnteros.push(new Integer(1));
		pilaEnteros.push(new Integer(2));
		pilaEnteros.push(new Integer(3));
		pilaEnteros.push(new Integer(4));
		pilaEnteros.push(new Integer(5));
		while (!pilaEnteros.isEmpty()) {
			System.out.println(pilaEnteros.pop()); // pop saca el ultimo elemento de la pila. LIFO
			// Se muestran del ultimo al primero: 5 4 3 2 1
		}

		// SE GENERA NUEVAMENTE Y SE TRANSPASA A PILA AUXILIAR PARA MOSTRAR AL REVES
		System.out.println("UTILIZANDO UNA PILA AUXILIAR, VUELCO Y MUESTRO NUEVAMENTE");
		pilaEnteros.push(new Integer(1));
		pilaEnteros.push(new Integer(2));
		pilaEnteros.push(new Integer(3));
		pilaEnteros.push(new Integer(4));
		pilaEnteros.push(new Integer(5));
		PilaNodos<Integer> pilaAuxilar = new PilaNodos<>();
		while (!pilaEnteros.isEmpty()) {
			pilaAuxilar.push(pilaEnteros.pop()); // se agrega a la auxiliar cada elemento que se saca de la pila enteros.
		}
		while (!pilaAuxilar.isEmpty()) {
			System.out.println(pilaAuxilar.peek()); // muestra un elemento pero no lo saca.
			pilaEnteros.push(pilaAuxilar.pop()); // vuelvo a componer la pila enteros, con lo sacado de la auxiliar.
		}
	}
}
