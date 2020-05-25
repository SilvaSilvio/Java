package Polimorfismo;

public class Vendedor extends Funcionario {
	private double totalVendas;
	
	
	

	public Vendedor(String nome, double cpf, double salario, double totalVendas) {
		super(nome, cpf, salario);
		this.totalVendas = totalVendas;
	}

	public void calcularSalario() {
		this.salario += this.totalVendas * 0.05;
	}
	
	/*public String toString() {
		return "Salario: " + this.getSalario();
	}*/

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}



}



