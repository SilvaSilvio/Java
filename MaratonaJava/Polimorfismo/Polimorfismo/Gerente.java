package Polimorfismo;

public class Gerente extends Funcionario{
	private double plr;
	
	
	public Gerente(String nome, double cpf, double salario, double plr) {
		super(nome, cpf, salario);
		this.plr = plr;
	}


	public void calcularSalario() {
		this.salario += plr;
	}


	public double getPlr() {
		return plr;
	}


	public void setPlr(double plr) {
		this.plr = plr;
	}

}
