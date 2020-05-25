package Eletrodomesticos;

public class Eletrodomestico {
	private String nome;
	private String modelo;
	private float valor;
	private int quantidade;
	private String descricao;

	public Eletrodomestico() {
		/*this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
		this.quantidade = quantidade*/	}

	public void imprimir(String nome, String modelo, float valor, int quantidade){
		
		this.nome = nome;
		this.modelo = modelo;
		this.valor = valor;
		this.quantidade = quantidade;
		
		
		System.out.println("__________________________________");
		System.out.println("Nome Produto: "+ this.nome );
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Valor: " + this.valor);
		System.out.println("Quantidade: " + this.quantidade);

	}
	
	public void imprimir(String nome, String modelo, float valor, int quantidade, String descricao) {
		imprimir(nome, modelo, valor, quantidade);
		this.descricao = descricao;
		System.out.println("Descrição: "+ this.descricao);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
