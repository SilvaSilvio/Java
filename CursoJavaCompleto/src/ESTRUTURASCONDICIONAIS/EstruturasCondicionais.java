package ESTRUTURASCONDICIONAIS;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas Horas");
		int horas = scan.nextInt();

		if (horas < 12) {
			System.out.println("Bom dia ");
		} else {
			if (horas <= 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}

	}

}
