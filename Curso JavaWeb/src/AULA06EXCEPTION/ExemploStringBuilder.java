package AULA06EXCEPTION;

public class ExemploStringBuilder {
	public static void main(String[] args) {
		String s1 = "";
		StringBuilder sb1 = new StringBuilder();
		// Esse cria 100 objetos
		for (int i = 0; i < 100; i++) {
			s1 = s1 + "*";
		}
		// Esse cria apenas um objeto
		for (int i = 0; i < 100; i++) {
			sb1.append("*");
		}
		System.out.println(s1);
		System.out.println(sb1);

	}
}
