package Estudantes.estudante;

import java.util.Scanner;

public class Estudante {
	Scanner scan = new Scanner(System.in);
	double nota1;
	public String nome;
	public int idade;
	public double notas = 0;

	public void imprimir() {
		double nota1 = 0, nota2 = 0, nota3 = 0;
		System.out.println("Digite o nome do Aluno: ");
		nome = scan.nextLine();
		System.out.println("Dite a idade do Aluno: ");
		idade = scan.nextInt();
		System.out.println("Digite a nota do primeiro aluno: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		nota3 = scan.nextDouble();
		notas = nota1 + nota2 + nota3;
		double media = notas / 3;
		String resultado = "";

		if (media < 6) {
			resultado = "Aluno reprovado";
		} else {
			resultado = "Aluno Aprovado";
		}

		System.out.println("O nome do Aluno é : " + this.nome);
		System.out.println("Sua Idade é : " + this.idade);
		System.out.println("A Soma das notas é: " +this.notas);
		System.out.println("A media do aluno é : " + media);
		System.out.println("O Aluno está" + resultado);

	}
}
