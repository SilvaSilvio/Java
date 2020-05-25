package ExercicioFolhaPagamento;

public class EmpresarioAssalariado extends Empregado {
	private double salario;

	public EmpresarioAssalariado(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	@Override
	public double calcularRemuneracao() {
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
