package Calculadora;

//import java.util.Scanner;

public class Calculadora {

	/*public void soma() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("O resultado é: " + resultado);
		
	}*/
	public void subtraiaDoisNumeros() {
		System.out.println(5-19);
	}
	
	public void multiplicacao(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divisao(double num1, double num2) {
		return num1 / num2;
	}

	public void somaArray(int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
					
		
		}
		System.out.println( "A Soma é: " + soma);
	}
	
	public void multiplicacaoArray(double[] multiplicacao) {
		double mult = 1;
		for (double aux : multiplicacao) {
			mult *= aux;
		}
		System.out.println("A multiplicação é: " + mult);
	}


public void divisaoArray(double[] divisao) {
	double div = 100;
for (double aux : divisao) {
	div /= aux;
	}
System.out.println("A Divisao é " + div );
}
}