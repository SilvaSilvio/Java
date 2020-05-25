package Interface;

public class Produto implements Tributavel, Transportavel{
	private String nome;
	private float valor;
	private int preco;
	private double precoFinal;
	private double freteFinal;
	
	
	public void tributavel() {
		this.precoFinal += this.valor * IMPOSTO;
				
	}
	
	public void transportavel() {
		this.freteFinal += this.valor * 0.1;
	}
	
	

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", preco=" + preco + ", precoFinal=" + precoFinal
				+ ", freteFinal=" + freteFinal + "]";
	}
	
	public double getPrecoFinal() {
		return precoFinal;
	}
	public double getValorFinal() {
		return freteFinal;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getPreco() {
		return preco;
	}

	public void setQuantidade(int preco) {
		this.preco = preco;
	}

}
