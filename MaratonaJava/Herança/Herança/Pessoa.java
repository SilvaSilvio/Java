package Herança;

public class Pessoa extends Object {
	public String nome;
	protected int cpf;
	protected int idade;
	protected Endereco endereco;
	
	
	
	public Pessoa(String nome) {
	System.out.println("Dentro do construtor Pessoa");
		this.nome = nome;
	}
	static
	{
		System.out.println("Bloco de inicializa��o estatico de Pessoa");
	}
	
	{
		System.out.println("Bloco de inicializa��o de Pessoa 1");
	}
	
	{
		System.out.println("Bloco de inicializa�o  de Pessoa 2");
	}
	
	
	public void print() {
		System.out.println("--------------DADOS PESSOA----------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("cpf: "  + this.cpf);
		System.out.println("Idade: " + this.idade);
		if(endereco != null)
			System.out.println("Endere�o: " +endereco.getRua() + " Bairro " + endereco.getBairro());
		else
			System.out.println(" Endere�o n�o cadastrado ");
	
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
