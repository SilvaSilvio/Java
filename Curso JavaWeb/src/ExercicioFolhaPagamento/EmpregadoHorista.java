package ExercicioFolhaPagamento;

public class EmpregadoHorista extends Empregado {
	private int quantHora;
	private double valorHora;

	public EmpregadoHorista(String nome, int quantHora, double valorHora) {
		super(nome);
		this.quantHora = quantHora;
		this.valorHora = valorHora;
	}

	@Override
	public double calcularRemuneracao() {
		return quantHora * valorHora;
	}

	public int getQuantHora() {
		return quantHora;
	}

	public void setQuantHora(int quantHora) {
		this.quantHora = quantHora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
