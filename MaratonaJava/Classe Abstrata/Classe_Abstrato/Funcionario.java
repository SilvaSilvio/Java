package Classe_Abstrato;

public abstract class Funcionario extends Pessoa{
	
	protected int cpf;
	protected double salario;
	
	public Funcionario(String nome, int cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}

	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario +"]";
	}

	public abstract void calcularSalario();
	


	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
