package Herança;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	public void test() {
		
	}

	static {
		System.out.println("Bloco de inicializaçao Static de funcionários");
	}
	{
		System.out.println("Bloco de inicializaçao de funcionários 1");
	}
	{
		System.out.println("Bloco de inicializaçao de funcionários 2");
	}

	public void print() {
		super.print();
		System.out.println("Salario: " + this.salario);

	}

	public void imprimirSalario() {
		System.out.println("Eu " + nome + " Recebi o Sálario de " + this.salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
}
