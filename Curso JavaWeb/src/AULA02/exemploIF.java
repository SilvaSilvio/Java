package AULA02;

import java.util.Locale;
import java.util.Scanner;

public class exemploIF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a idade do abençoado");
		int idade = scan.nextInt();
		String vota;
		System.out.println(idade > 18 && idade < 65 ? "Abençoado vota" : "Abençoado não vota");
	}
}