package Entities;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date Aniversario;

	public Cliente() {
	}

	public Cliente(String nome, String email, Date aniversario) {
		this.nome = nome;
		this.email = email;
		Aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return Aniversario;
	}

	public void setAniversario(Date aniversario) {
		Aniversario = aniversario;
	}

}
