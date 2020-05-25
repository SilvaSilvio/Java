package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue
	private int codigo;
	@ManyToOne
	@JoinColumn(name = "pedido_codigo_fk")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn(name = "livro_codigo_fk")
	private Livro livro;
	private int quantidade = 1;

	public double getValor() {
		return livro.getValor() * quantidade;
	}

	public boolean equals(Object obj) {
		ItemPedido outroItem = (ItemPedido) obj;
		return this.livro.getCodigo() == outroItem.livro.getCodigo();
	}

// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}