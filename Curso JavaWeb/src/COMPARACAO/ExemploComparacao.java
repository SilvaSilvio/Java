package COMPARACAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploComparacao {

	private static void imprimeAlunos(List<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int i = 0; i < 5; i++) {
			int idade = (int) (Math.random() * 100);
			double nota = Math.random() * 10;
			Aluno a = new Aluno("Aluno " + i, idade, nota);
			alunos.add(a);
		}
		System.out.println("Não ordenado: ");
		imprimeAlunos(alunos);
		System.out.println("Ordenada por idade:");
		Collections.sort(alunos, new ComparadorIdade());
		imprimeAlunos(alunos);
		System.out.println("Ordenar por notas");
		Collections.sort(alunos, new ComparadorNota());
		imprimeAlunos(alunos);

	}

}
