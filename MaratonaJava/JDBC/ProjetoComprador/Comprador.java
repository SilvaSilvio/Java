package ProjetoComprador;

public class Comprador {
	private int id_comprador;
	private String cpf;
	private String nome;
	
	public Comprador(int id_comprador, String cpf, String nome) {
		super();
		this.id_comprador = id_comprador;
		this.cpf = cpf;
		this.nome = nome;
	}
	

	
	public Comprador(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}



	public Comprador() {
		
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(int id_comprador) {
		this.id_comprador = id_comprador;
	}
}
