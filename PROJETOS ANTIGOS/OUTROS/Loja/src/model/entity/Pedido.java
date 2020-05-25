package model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private int codigo;
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	@ManyToOne
	@JoinColumn(name = "cliente_codigo")
	private Cliente cliente;
	private Date dataPedido = new Date();

	public double getValor() {
		double valorTotal = 0;
		for (ItemPedido item : itens) {
			valorTotal += item.getValor();
		}
		return valorTotal;
	}

	public void adicionar(ItemPedido novoItem) {
		if (!itens.contains(novoItem)) {
			itens.add(novoItem);
		}
	}

	public void remover(ItemPedido item) {
		itens.remove(item);
	}

	public void alterar(ItemPedido itemModificado) {
		int indice = itens.indexOf(itemModificado);
		if (indice != -1) {
			ItemPedido item = itens.get(indice);
			item.setQuantidade(itemModificado.getQuantidade());
		}
	}

// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
}
