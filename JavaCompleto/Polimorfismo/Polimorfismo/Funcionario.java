package Polimorfismo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	
	
	
	public Funcionario(String nome,  Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public abstract void  calcularSalario();


	public abstract void imprime();


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", Salario=" + salario + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
		
	

}
