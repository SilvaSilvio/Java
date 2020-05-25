package Herança;

public class Endereco extends Pessoa {
	private String rua;
	private String bairro;
	private Pessoa[] pessoas;

	public Endereco(String nome) {
		super(nome);
	}
	public void print() {
		System.out.println("Rua " + this.rua);
		System.out.println("Bairro: " + this.bairro);
	/*	if (pessoas != null && pessoas.length != 0)
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa + " ");
			}
		else
			System.out.println("Pessoa sem endere�o");*/

	}
	
	public void teste() {
		System.out.println(super.nome);
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

}
