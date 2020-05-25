public class Pessoas {
	private String nome;
	private int idade;
	private int cpf;
	private endereco endereco;
	
	
	{
		System.out.println("Bloco de inicialização 1");
	}
	
	static {
		System.out.println("Bloco de inicialização static");
	}
	public Pessoas(String nome) {
	this.nome = nome;
	System.out.println("Dentro do construtor Pessoa");
	}

	public void StatusPessoas() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("cpf: " + cpf);
		System.out.println("Endereço: " + this.endereco.getRua());
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}


	
	

}
