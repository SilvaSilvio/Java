package FORNECEDOR;

public class Fornecedor extends Pessoa {
	private String produto;
	public Fornecedor(String nome, String telefone, String produto) {
		super(nome, telefone);
		this.produto = produto;
		
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return "Dados Pessoa Produto [nome=" + super.getNome() + ", telefone= " + super.getTelefone() + "produto " +this.produto + "]";
	
	}


}
