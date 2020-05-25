package Overrid;

public class Funcionario extends Pessoa{
	private double salario;

	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}

}
