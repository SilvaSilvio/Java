package control;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.dao.PedidoDAO;
import model.entity.Cliente;
import model.entity.ItemPedido;
import model.entity.Livro;
import model.entity.Pedido;

@ManagedBean
@SessionScoped
public class PedidoController {
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private Pedido pedido = new Pedido();

	public void comprar(Livro livro) {
		ItemPedido itemPedido = new ItemPedido();
		itemPedido.setLivro(livro);
		pedido.adicionar(itemPedido);
		Util.adicionarMensagem(String.format("%s adicionado ao carrinho de compras", livro.getTitulo()));
	}

	public void excluirItem(ItemPedido item) {
		pedido.remover(item);
	}

	public String confirmar() {
		try {
			PedidoDAO.inserir(pedido);
			Util.adicionarMensagem("Pedido finalizado. Acompanhe o andamento pelo nosso site");
			Cliente c = pedido.getCliente();
			pedido = new Pedido();
			pedido.setCliente(c);
			return "livro";
		} catch (Exception e) {
			Util.adicionarMensagem("Erro ao inserir pedido. " + e.getMessage());
		}
		return null;
	}

	public String consultarPorCliente(Cliente cliente) {
		try {
			pedidos = PedidoDAO.consultar(cliente);
			return "pedido";
		} catch (Exception e) {
			Util.adicionarMensagem("Erro ao consultar pedidos. " + e.getMessage());
		}
		return null;
	}

// Getters e Setters
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
