package AULA02;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int status;

		do {
			System.out.println("Digite um número inteiro:");
			int num1 = scan.nextInt();
			System.out.println("Digite outro numero: ");
			int num2 = scan.nextInt();
			System.out.printf("Soma: %d \n\n", num1 + num2);
			System.out.println("Digite 0 para sair ou outro número para continuar:");
			status = scan.nextInt();
		} while (status != 0);
		System.out.println("Obrigado por usar o programa");

	}

}
