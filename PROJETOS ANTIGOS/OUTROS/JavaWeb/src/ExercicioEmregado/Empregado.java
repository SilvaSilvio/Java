package ExercicioEmregado;

public class Empregado {
private String nome;
private double salario;


public void imprimirDados() {
	System.out.println("O nome do fucion�rio �: " + nome);
	System.out.println("seu sal�rio �: " + this.getSalario());
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}



}
