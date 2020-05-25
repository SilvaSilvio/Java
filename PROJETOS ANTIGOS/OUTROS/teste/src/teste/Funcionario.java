package teste;

public class Funcionario extends Pessoa{
	private double salario;

	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public void setPessoa(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	
}
