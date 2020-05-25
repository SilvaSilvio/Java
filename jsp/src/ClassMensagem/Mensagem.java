package ClassMensagem;

import java.util.Date;

public class Mensagem {
	private String usuario;
	private String ip;
	private Date data = new Date();
	private String descricao;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descrcao) {
		this.descricao = descrcao;
	}

}
