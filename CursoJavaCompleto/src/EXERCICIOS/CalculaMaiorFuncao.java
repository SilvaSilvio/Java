package EXERCICIOS;

import java.util.Scanner;

public class CalculaMaiorFuncao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three number");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int higher = max(a, b, c);
		showResult(higher);

		scan.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("O maior valor é: " + value);
	}

}