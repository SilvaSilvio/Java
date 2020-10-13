package Interfaces;

import InterfacesTeste.Transportavel;
import InterfacesTeste.Tributavel;

public class Produto implements Tributavel, Transportavel {

	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double precoFrete;
	

	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	@Override
	public void calcularImposto() {
		precoFinal = this.preco + this.preco * IMPOSTO;
	}

	@Override
	public void calcularFrete() {
		precoFrete = this.preco / this.peso * 0.2;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco + ", precoFinal=" + precoFinal
				+ ", precoFrete=" + precoFrete + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public double getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(double precoFrete) {
		this.precoFrete = precoFrete;
	}

}