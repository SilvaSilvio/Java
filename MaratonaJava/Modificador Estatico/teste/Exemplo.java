package teste;

public class Exemplo {
private String nome;
private int idade;
private double salario;

public void status() {
	System.out.println("__________________________");
	System.out.println("Nome: " + this.nome);
	System.out.println("Idade: "+ this.idade);
	System.out.println("Salario: " + this.salario);
}

public void setNome(String nome) {
	this.nome = nome;
}
public String getNome() {
	return nome;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public int getIdade() {
	return idade;
}
public void setSalario(double salario) {
	this.salario= salario;
}
public double getSalario() {
	return salario;
}
}
