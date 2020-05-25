package Classe_Abstrato;

public class Gerente extends Funcionario {

	public Gerente(String nome, int cpf, double salario) {
		super(nome, cpf, salario);
	}

	public void print() {
		System.out.println("teste");
	}
	
	public void calcularSalario() {
		this.salario += salario * 0.2;
		

	}

}
