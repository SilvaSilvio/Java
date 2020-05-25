package Entity;

import java.util.Date;

public class Estoque {
	private int id;
	private int quantidade;
	private Date data_Entrada;
	private Date data_Saida;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData_Entrada() {
		return data_Entrada;
	}

	public void setData_Entrada(Date data_Entrada) {
		this.data_Entrada = data_Entrada;
	}

	public Date getData_Saida() {
		return data_Saida;
	}

	public void setData_Saida(Date data_Saida) {
		this.data_Saida = data_Saida;
	}

}
