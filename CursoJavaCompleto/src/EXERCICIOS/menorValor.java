package EXERCICIOS;

import java.util.Locale;
import java.util.Scanner;

public class menorValor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite 3 numeros: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int menor = minimo(a, b, c);
		mostraMenor(menor);

		scan.close();
	}

	public static int minimo(int x, int y, int z) {
		int aux;
		if (x < y && x < z) {
			aux = x;
		} else if (y < z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void mostraMenor(int value) {
		System.out.println("O menor Valor é: " + value);
	}

}
