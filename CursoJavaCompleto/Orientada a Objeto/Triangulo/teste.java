package Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Entre com os valores do triangulo X");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();

		System.out.println("Entre com os valore do Triangulo Y");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();

		double areax = x.area();
		System.out.println("Área de Tringulo A: " + areax);

	double areay = 	y.area();
		System.out.println("Area do tringulo Y: " + areay);

		}
}
