package Metodos;

public class Caculadora {
	int num1, num2;

	public void somar(int num, int num1) {
		System.out.println(num + num1);
	}

	public int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 25;
		System.out.println("-----------------");
		System.out.println("num1: " + num1);
		System.out.println("num1: " + num2);
	}
}
