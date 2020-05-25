package REGRADE3;

import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de cana de açucar: ");
		float quantAcucar = scan.nextFloat();

		float resultado = 500 * quantAcucar / 6000;

		System.out.println("A quantidade de alcool produzido com " + quantAcucar + " é:  " + resultado);
	}

}
