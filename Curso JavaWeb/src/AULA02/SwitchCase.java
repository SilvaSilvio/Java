package AULA02;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		String dia = "";

		System.out.println("Digite o dia da semana");
		numero = scan.nextInt();

		switch (numero) {
		case 0:
			dia = "Domingo";
		case 1:
			dia = "Segunda";
			break;
		case 2:
			dia = "Terça";
			break;
		case 3:
			dia = "Quarta";
			break;
		case 4:
			dia = "Quinta";
			break;
		case 5:
			dia = "Sexta";
			break;
		case 6:
			dia = "Sábado";
			break;
		default:
			System.out.println("Dia da semana não existe");

		}
		System.out.println(dia);
	}

}
