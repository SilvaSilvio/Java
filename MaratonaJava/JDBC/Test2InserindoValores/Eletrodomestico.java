package Test2InserindoValores;

public class Eletrodomestico {
	private String nome;
	private float valor;

	public Eletrodomestico() {
		super();
	}

	public Eletrodomestico(String nome, float valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
