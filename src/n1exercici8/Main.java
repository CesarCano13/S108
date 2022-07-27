package n1exercici8;

public class Main {

	public static void main(String[] args) {

		Reverse re = frase -> new StringBuilder(frase).reverse().toString();

		System.out.println(re.reverse("estrellita"));
	}

}
