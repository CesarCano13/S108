package n1exercici7;

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

		palabras.stream().sorted(Comparator.comparingInt((p) -> ((String) p).length()).reversed())
				.forEach(System.out::println);

	}

}
