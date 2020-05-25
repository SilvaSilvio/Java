package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
	public static void main(String... args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de Alturas a serem ligas? :");
		int n = scan.nextInt();
		double[] vector = new double[n];
		double sum = 0.0;
		for (int i = 0; i < n; i++) {

			vector[i] = scan.nextDouble();
			sum += vector[i];
		}

		double avg = sum / n;

		System.out.printf("A média é: %.2f%n", avg);

		scan.close();
	}

}
