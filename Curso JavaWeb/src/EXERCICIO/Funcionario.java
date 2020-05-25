package EXERCICIO;

public class Funcionario {
	String nome;
	double valor;
	
	public Funcionario(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	/*public double CalcularSalario() {
		double valorTotal = 0;
		valorTotal = salario + vendasBrutas * 8 / 100;
		return valorTotal;
	}*/

	@Override
	public String toString() {
		double salario = 200 + valor * 0.08;
		return "Funcionario [nome=" + nome + ", vendasBrutas=" + valor + ", salario: " + salario + "]";
	}
	
	

}