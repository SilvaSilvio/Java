package ControleFluxoWhile;

public class Exercicio {

	public static void main(String[] args) {
		int numeros = 0;
		int numero1 = 100;

		while (numeros < 100) {
			if (numeros % 10 == 0) {
				System.out.println("O valores pares são: " + numeros);
			}
			numeros++;
		}
		System.out.println("-------------------");

		for (int i = 0; i < numero1; i++) {
			if (i % 10 == 0) {
				System.out.println("Numeros pares: " + i);
			}
		}
	}

}
