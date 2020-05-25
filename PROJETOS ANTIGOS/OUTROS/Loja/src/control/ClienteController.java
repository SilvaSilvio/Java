package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.dao.ClienteDAO;
import model.entity.Cliente;
import model.entity.Pedido;

@ManagedBean
@SessionScoped
public class ClienteController {
	private Cliente cliente = new Cliente();
	private String login;
	private String senha;
	private String senha2;

	public String autenticar() {
		try {
			cliente = ClienteDAO.autenticar(login, senha);
			configurarCliente();
			return "finalizar";
		} catch (Exception e) {
			Util.adicionarMensagem("Erro ao efetuar autenticão: " + e.getMessage());
			return null;
		}
	}

	public String finalizar() {
		return cliente.getLogin() == null ? "cliente" : "finalizar";
	}

	public void sair() {
		cliente = new Cliente();
		Util.removerSessao("pedidoController");
	}

	public String confirmar() {
		try {
			if (cliente != null) {
				Cliente c = ClienteDAO.consultar(cliente.getLogin());
				if (c == null) {
					ClienteDAO.inserir(cliente);
					configurarCliente();
					return "finalizar";
				} else {
					throw new Exception(String.format("Cliente com login %s já foi cadastrado", cliente.getLogin()));
				}
			}
		} catch (Exception e) {
			Util.adicionarMensagem(e.getMessage());
		}
		return null;
	}

	private void configurarCliente() {
		Pedido pedido = (Pedido) Util.getObjetoManagedBean("#{pedidoController.pedido}");
		pedido.setCliente(cliente);
	}

// Getters e Setters
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
}