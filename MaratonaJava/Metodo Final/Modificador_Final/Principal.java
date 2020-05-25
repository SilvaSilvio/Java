package Modificador_Final;

public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Comprador comprador = new Comprador();
		
		carro.setNome("Fiorino");
		carro.setMarca("Gol");
		Carro.getVelocidadeFinal();
		//comprador.setNome("Sílvio");
		carro.getComprador().setNome("Beuga");
		//carro.getComprador(comprador);
		//System.out.println(carro);
		
		System.out.println(comprador);
		System.out.println(carro.toString());
		

	}

}
