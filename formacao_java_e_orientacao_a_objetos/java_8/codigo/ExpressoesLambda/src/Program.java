import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Program {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");

		// Impressão padrão
		System.out.println(palavras);
		System.out.println();

		// Ordenando com método estatico "sort" de Collections
		// Collections.sort(palavras);
		// System.out.println(palavras);

		// Ordenando com método estatico "sort" de Collections mas com objeto Comparator
		// Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		// Collections.sort(palavras, comparador);
		// System.out.println(palavras);

		// Ordenando com método "sort" da instancia mas com objeto Comparator
		// Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		// palavras.sort(comparador);
		// System.out.println(palavras);

		// Iterando com for normal
		// for (int i = 0; i < palavras.size(); i++) {
		// System.out.println(palavras.get(i));
		// }
		// System.out.println();

		// Iterando com enhanced for
		// for (String palavra : palavras) {
		// System.out.println(palavra);
		// }
		// System.out.println();

		// Iterando com método foreach da instancia utilizando um Consumer de classe
		// isolada
		Consumer<String> consumer = new ConsumerString();
		palavras.forEach(consumer);
		System.out.println();

		// Iterando com método foreach da instancia utilizando um Consumer de classe
		// anonima em variavel
		Consumer<String> consumerNovo = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};

		palavras.forEach(consumerNovo);
		System.out.println();

		// Iterando com método foreach da instancia utilizando um Consumer de classe
		// anonima direto no metodo
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		System.out.println();

		// Iterando com método foreach da instancia utilizando uma expressão lambda
		// normal
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		System.out.println();

		// Iterando com método foreach da instancia utilizando uma expressão lambda mais
		// enxuta
		palavras.forEach(s -> System.out.println(s));
		System.out.println();

		// Testando o Comparator com expressao sem lambda
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return 0;
			}
		});
		System.out.println();

		// Testando o Comparator com expressao com lambda
		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println();

	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}

class ConsumerString implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}