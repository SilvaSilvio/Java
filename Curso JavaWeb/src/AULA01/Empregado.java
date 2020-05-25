package AULA01;

public class Empregado {
Integer matricula;
String nome;
double salario;

public Empregado(Integer matricula, String nome, double salario) {
	this.matricula = matricula;
	this.nome = nome;
	this.salario=salario;
}

public void fichaEmpregado() {
	System.out.println("Matricula: "+ matricula);
	System.out.println("Nome: " + nome);
	System.out.println("Salario: " + salario);
}

}
