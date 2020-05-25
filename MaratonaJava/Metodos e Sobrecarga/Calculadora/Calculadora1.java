package Calculadora;

public class Calculadora1 {

	public void arraySoma(int... numero) {
		int soma = 0;
		for(int aux : numero) {
			soma += aux;
		}
		System.out.println("A soma dos Array é: " + soma);
	}

	public void somavarArgs(int... numeros) {
		int soma = 0;
		for(int aux : numeros) {
			soma += aux;
		}
		System.out.println(soma);
	}


}
