package EstruturaRepeticao;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char repetir;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			float celsius = scan.nextFloat();
			float farh = 9 * celsius / 5 + 32;
			System.out.printf("O Valor é /n" + farh);
			System.out.println("Deseja repetir?(s/n)");
			repetir = scan.next().charAt(0);
		} while (repetir != 'n');
	}

}
