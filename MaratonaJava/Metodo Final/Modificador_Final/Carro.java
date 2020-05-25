package Modificador_Final;

public class Carro {
	private String nome;
	private String marca;
	private static final double VELOCIDADE_FINAL;
	private final Comprador comprador = new Comprador();

	public String toString() {
		return "Nome do Veículo " + this.nome + " Marca " + this.marca + "\n Velocidade Final "
	+ VELOCIDADE_FINAL + "\n Nome do Comprador " + comprador;
	}

	static {
		VELOCIDADE_FINAL = 250; 
	}

	
	

	public Comprador getComprador() {
		return comprador;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarcar() {
		return marca;
	}

	public static double getVelocidadeFinal() {
		return VELOCIDADE_FINAL;
	}

	
	
}
