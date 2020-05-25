package Exercicio2;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int x = scan.nextInt();
		
		Switch(x > 5){
			case 1:
				System.out.println("o numero é maior que 5");
				break;
			case 2:
				System.out.println("O numero é menor que 5");
				break;
		}

	}

}
