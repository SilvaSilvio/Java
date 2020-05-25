package IMC;

import java.util.Scanner;

public class Imc {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Calculo IMC");
		System.out.println("");
		System.out.println("Digite seu peso: ");
		float peso = scan.nextFloat();
		System.out.println("Digite sua altura: ");
		float altura = scan.nextFloat();

		float imc = peso / (altura * altura);

		System.out.println(imc);

		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso");
		} else if (imc < 24.9) {
			System.out.println("Parabéns, você está com seu peso normal!!");
		} else if (imc < 29.9) {
			System.out.println("Você está acima do peso");
		} else if (imc < 34.9) {
			System.out.println("Você está com obesidade grau I!!");
		} else if (imc < 39.9) {
			System.out.println("Você está com obesidade grau II");
		} else {
			System.out.println("Você está com obesidade grau III");
		}

	}
}
