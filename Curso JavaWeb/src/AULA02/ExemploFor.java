package AULA02;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.println("Digite a Altura: ");
	double altura = scan.nextDouble();
	System.out.println("Digite a Largura: ");
	double largura = scan.nextDouble();
	for(int i =0; i < altura; i++) {
		for(int j =0; j < largura; j++ ) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
