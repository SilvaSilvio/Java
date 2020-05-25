package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enuns.OrdemStatus;

public class OrdemProduto {
	private Date momento;
	private OrdemStatus status;
	private List<OrdemItem> ordemItem = new ArrayList<>();
	private Cliente cliente;

	public OrdemProduto(/*Date momento*/OrdemStatus status, Cliente cliente) {
		//this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public OrdemProduto() {

	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public List<OrdemItem> getOrdemItem() {
		return ordemItem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(OrdemItem item) {
		ordemItem.add(item);
	}

	public void removerItem(OrdemItem item) {
		ordemItem.remove(item);
	}

	public double total() {
		double soma = 0;
		for(OrdemItem c : ordemItem) {
			soma += c.subTotal();
		}
		return soma;
	}

}
