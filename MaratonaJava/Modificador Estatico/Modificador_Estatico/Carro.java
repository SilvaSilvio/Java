package Modificador_Estatico;
/*Velocidade Limite deve ser de 240*/
public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private int[] parcela;
	private static double velocidadeMinima = 210;
	

		public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
			
	}
	
	public void imprimir() {
		System.out.println("___________________________________________");
		System.out.println("Nome Veículo: " + this.nome);
		System.out.println("Velocidade Maxima: " +this.velocidadeMaxima);
		System.out.println("Velocidade Limite " + velocidadeMinima);
	}
	
	public Carro() {
		
	}
	
	/*public static void setVelocidadeMinima(double velocidadeMinima) {
		Carro.velocidadeMinima = velocidadeMinima;
	}*/
	
	public static double getVelocidadeMinima() {
		return velocidadeMinima;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void setParcela(int[] parcela) {
		this.parcela = parcela;
	}
	
	public int[] getParcela() {
		return parcela;
	}
	/*public double getVelocidadeMinina() {
		return velocidadeMinima;
	}
	
	public void setVelocidadeMinina(double velocidadeMinima) {
		this.velocidadeMinima = velocidadeMinima;
	}*/

}
