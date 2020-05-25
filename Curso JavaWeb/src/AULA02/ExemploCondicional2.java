package AULA02;

import java.util.Locale;
import java.util.Scanner;

public class ExemploCondicional2 {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner scan = new Scanner(System.in);
System.out.println("Digite o nome do aluno");
String nome = scan.nextLine();
System.out.println("Digite a nota do aluno: ");
double nota = scan.nextDouble();
System.out.printf("O Aluno %s foi ", nome);
System.out.println(nota > 5 ? "Aprovado" : "Preprovado");

	}

}
