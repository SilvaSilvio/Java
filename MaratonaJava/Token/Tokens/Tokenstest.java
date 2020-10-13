package Tokens;

import java.util.Scanner;

public class Tokenstest {
	//AULA 95

	public static void main(String[] args) {
		String nomes = "Ramalho, marco, picachu, goku, gohan";
		String[] tokens = nomes.split(",");
		for (String arrayNome : tokens)
			System.out.println(arrayNome.trim());

		Scanner scanner = new Scanner("1, true, 100, café");
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				System.out.println("int " + i);
			} else if (scanner.hasNextBoolean()) {
				boolean b = scanner.hasNextBoolean();
				System.out.println("Valos Verdadeiro: " + b);
			} else {
				System.out.println(scanner.next().trim());
			}
		}
	}
}