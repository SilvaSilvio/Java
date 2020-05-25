package EXERCICIOS;

import java.util.Scanner;

public class CalculoFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matricula;
		float horasTrabalhadas;
		float valorHora;

		System.out.print("Digite a matricula");
		matricula = sc.nextInt();
		System.out.print("Quantidade de Hora Trabalhada");
		horasTrabalhadas = sc.nextFloat();
		System.out.print("Valor Hora: ");
		valorHora = sc.nextFloat();
		float resultado = horasTrabalhadas * valorHora;
		System.out.println(resultado);

	}

}
