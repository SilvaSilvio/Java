package Modificador_Estatico;

public class teste{

	public static void main(String... args) {
	Carro c1 = new Carro();
	c1.setNome("BMW");
	c1.setVelocidadeMaxima(250);
	
	Carro c2 = new Carro();
	c2.setNome("Mercedes");
	c2.setVelocidadeMaxima(280);
		
	Carro c3 = new Carro();
	c3.setNome("Fiat Uno");
	c3.setVelocidadeMaxima(240);
	
	
	Carro.getVelocidadeMinima();
	c1.imprimir();
	c2.imprimir();
	c3.imprimir();
	}

}
