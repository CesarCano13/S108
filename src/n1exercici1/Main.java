package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Caracol");
		nombres.add("Elefante");
		nombres.add("Gaviota");
		nombres.add("Delfin");
		nombres.add("Hormiga");
		nombres.add("Gallina");

		filtrar(nombres);
	}

	public static void filtrar(ArrayList<String> nombres) {
		// Versión lambdas
		List<String> letrasO = nombres.stream().filter(name -> name.contains("o")).collect(Collectors.toList());
		System.out.println("Los animales que tienen la letra O son: " + letrasO);

		// Versión normal
		/*ArrayList<String> letrasO = new ArrayList<String>();
		for (String o : nombres) {
			if (o.contains("o")) {
				letrasO.add(o);
			}
		}
		System.out.println("Los animales que tienen la letra O son: " + letrasO);*/

	}
}
