package Produtos;

public class Produtos {
	public String nome;
	public double preco;
	public int quant;

	public double calculoProduto() {
		return preco * quant;
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
		return "Produtos [nome=" + nome + ", preco=" + preco + ", quant=" + quant + "]";
	}
	
}