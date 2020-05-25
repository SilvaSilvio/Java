package Classe_Abstrato;

public class Vendedor extends Funcionario{
	
	private int totalVendas;

	public Vendedor(String nome, int cpf, double salario, int  totalVendas) {
		super(nome, cpf, salario);
		this.totalVendas = totalVendas;
	}
	
	
	public void calcularSalario() {
		this.salario += salario * 0.1;

		{
			System.out.println("hello, my name is Sílvio");
		}
	}
	public void print() {
		System.out.println("teste2");
	}
	

	
	@Override
	public String toString() {
		return "Vendedor " + nome + " cpf " +cpf + " Salario " + salario + " total de Vendas " + totalVendas;
	}


	public void setCargo(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

}


