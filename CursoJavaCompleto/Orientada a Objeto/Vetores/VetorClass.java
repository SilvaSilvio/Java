package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorClass {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n;
		double soma = 0.0;
		System.out.println("Numero");
		n = scan.nextInt();

		Produtos[] vect = new Produtos[n];

		for (int i = 0; i < vect.length; i++) {
			scan.nextLine();
			// System.out.println("Nome Produto: ");
			String nome = scan.nextLine();
			// System.out.println("Preço:");
			double preco = scan.nextDouble();

			vect[i] = new Produtos(nome, preco);
		}
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		System.out.println("A media total dos produtos é: " + media);

		scan.close();
	}
}
