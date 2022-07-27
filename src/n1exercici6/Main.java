package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Juan");
		palabras.add("Pedro");
		palabras.add("Ana");
		palabras.add("1");
		palabras.add("45");
		palabras.add("3");

		palabras.stream().sorted(Comparator.comparing((p) -> p.length())).forEach(System.out::println);

		/*
		 * String[] nombres = { "Juan", "Pedro", "Ana", "1", "45", "3" };
		 * 
		 * Arrays.sort(nombres);
		 * 
		 * for (String s : nombres) {
		 * 
		 * System.out.println(s); }
		 */
	}
}
