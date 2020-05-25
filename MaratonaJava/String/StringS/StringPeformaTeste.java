package StringS;

public class StringPeformaTeste {
	public static void main(String... args) {
		long inicio = System.currentTimeMillis();
		stringContatenar(50);
		long fim = System.currentTimeMillis();
		System.out.println("O tempo é de " + (fim - inicio) + " ms");

		inicio = System.currentTimeMillis();
		stringContatenarBuilder(500);
		fim = System.currentTimeMillis();
		System.out.println("O tempo em String Builder é de " + (fim - inicio) + " ms");

	}

	public static void stringContatenar(int tam) {
		String string = "";
		for (int i = 0; i < tam; i++) {
			string += i;
		}

	}

	public static void stringContatenarBuilder(int tam) {
		StringBuilder ab = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			ab.append(i);
		}

	}

}
