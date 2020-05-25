package Calculadora;

public class teste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
	
		//calc.soma();
		calc.subtraiaDoisNumeros();
		int num1 = 4;
		//double num1 = 5;
		calc.multiplicacao(num1, 3);
		calc.divisao(28, 3);
		
	//int[] numeros = {2,4,6,3};
//	int [] numero = int [] numero[4];
	//numero[0] = 2;
	//calc.somaArray(numeros);
	
	double[] mult = {1,4,5,2};
	calc.multiplicacaoArray(mult);
	
	double[] div = {50, 2, 5};
	calc.divisaoArray(div);
		

	}

}
