package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double xa, xb, xc, ya, yb, yc;
		double aux;

		System.out.println("Entre com os valores do triangulo X");
		xa = scan.nextDouble();
		xb = scan.nextDouble();
		xc = scan.nextDouble();

		System.out.println("Entre com os valore do Triangulo Y");
		ya = scan.nextDouble();
		yb = scan.nextDouble();
		yc = scan.nextDouble();

		double px = (xa + xb + xc) / 2;
		double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
		System.out.println("Área de Tringulo A: " + areax);
		
		double py = (ya + yb + yc) / 2;
		double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));
		System.out.println("Area do tringulo Y: " + areay);

		if (areax > areay) {
			aux = areax;
		} else {
			aux = areay;
		}
		System.out.println("O maior é " + aux);
	}

}
