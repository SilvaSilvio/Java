package Overrid;

public class Pessoa extends Object {
	private String nome;
	private int idade;

	static {
		System.out.println("Esse será o primeiro metodo a aparecer no print");
	}

	{
		System.out.println("Esse será o terceiro " + this.nome);
	}

	public void print() {
		System.out.println("Teste");
	}

	static {
		System.out.println("2");
	}

	public Pessoa() {

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "nome " + nome + " idade " + idade;
		
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}


}
