package Enumeração;

public class Pessoa {
	enum TipoPagamento {
		AVISTA, APRAZO;
	}

	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipoPagamento;

	public Pessoa(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipo = tipo;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return " NOME: " + this.nome + "\n TIPO: " + this.tipo + "\n PAGAMENTO " + this.tipoPagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public void setTipoPagamento(TipoPagamento pagamento) {
		this.tipoPagamento = pagamento;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

}