package Entity;

public class Usuario {
	private int idUsuario;
	private String nome;
	private String tipUsuario;
	private int cpf;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipUsuario() {
		return tipUsuario;
	}

	public void setTipUsuario(String tipUsuario) {
		this.tipUsuario = tipUsuario;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
