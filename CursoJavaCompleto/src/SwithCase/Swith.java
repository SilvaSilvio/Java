package SwithCase;

import java.util.Scanner;

public class Swith {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Digite o dia da Semana");
		x = scan.nextInt();

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		default:
			dia = "Valor Inválido";
		}
		System.out.println(dia);
		scan.close();
	}
}
