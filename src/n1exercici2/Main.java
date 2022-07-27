package n1exercici2;

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
		nombres.add("Mono");

		filtrar(nombres);
	}

	public static void filtrar(ArrayList<String> nombres) {
		// Versión lambdas
		List<String> letrasO = nombres.stream().filter(name -> name.contains("o") && name.length() > 5).collect(Collectors.toList());
		System.out.println("Los animales que tienen la letra O y tiene más de 5 carácteres son: " + letrasO);
				
		// Versión normal
		/*ArrayList<String> letrasO = new ArrayList<String>();
		for (String o : nombres) {
			if (o.contains("o") && o.length() > 5) {
				letrasO.add(o);
			}
		}
		System.out.println("Los animales que tienen la letra O y tiene más de 5 carácteres son: " + letrasO);*/

	}
}
