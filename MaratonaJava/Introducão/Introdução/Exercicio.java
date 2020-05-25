package Introdução;

public class Exercicio {

	public static void main(String[] args) {
		double salario = 3000;
		double salarioImposto = 0;
		if (salario < 1000)
			salarioImposto = salario * 0.05;
		else if (salario >= 1000 && salario <= 2000)
			salarioImposto = salario * 0.10;
		else if (salario >= 2000 && salario <= 4000)
			salarioImposto = salario * 0.15;
		System.out.println("O total de imposto � " + salarioImposto);

	}

}
