package Construtor;

public class Construtor {
	public String nome;
	public double preco;
	public int quant;
	public double result;
	
	public Construtor(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public double calculoProduto() {
		return result = preco * quant;
		
	}

	public void EntradaProdutoEstoque(int quantidade) {
		this.quant += quantidade;
	}

	public void SaidaProdutoEstoque(int quantidade) {
		this.quant -= quantidade;
	}
	public void status() {
		System.out.println("nome " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade : " + this.quant);
		
	}

	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", preco=" + preco + ", valor: "+ calculoProduto() +"]";
	}
	
}
