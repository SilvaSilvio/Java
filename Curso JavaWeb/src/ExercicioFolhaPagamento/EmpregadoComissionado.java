package ExercicioFolhaPagamento;

public class EmpregadoComissionado extends Empregado {
	private double vendasBrutas;
	private double comissao;

	public EmpregadoComissionado(String nome, double vendasB, double comissao) {
		super(nome);
		this.vendasBrutas = vendasB;
		this.comissao = comissao;
	}

	@Override
	public double calcularRemuneracao() {
		return vendasBrutas * comissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
