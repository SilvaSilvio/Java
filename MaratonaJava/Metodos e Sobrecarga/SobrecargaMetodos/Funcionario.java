package SobrecargaMetodos;

public class Funcionario {
private String nome;
private String cpf;
private double salario;
private String rg;

public void init(String nome, String cpf, double salario) {
	this.nome = nome;
	this.cpf = cpf;
	this.salario = salario;
}

public Funcionario(String nome) {
	this.nome = nome;
}

public void init(String nome, String cpf, double salario, String rg) {
	init(nome, cpf, salario);
	this.rg = rg;
}

public void status() {
	System.out.println("Nome: " + this.nome);
	System.out.println("CPF: " + this.cpf);
	System.out.println("Salario: " + this.salario);
	System.out.println("RG: " + this.rg);
	
}


public void setNome(String nome) {
	this.nome = nome;
}
public void setCpf (String cpf) {
	this.cpf = cpf;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public void setRg(String rg) {
	this.rg = rg;
}


}
