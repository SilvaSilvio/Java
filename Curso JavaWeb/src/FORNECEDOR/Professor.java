package FORNECEDOR;

public class Professor extends Pessoa{
private Double salario;

	public Professor(String nome, String telefone, double salario) {
		super(nome, telefone);
		this.salario = salario;
		
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Professor Nome:" + getNome() + " Telefone " + getTelefone() + " Salario= " + salario;
	}
	
	
	

}
