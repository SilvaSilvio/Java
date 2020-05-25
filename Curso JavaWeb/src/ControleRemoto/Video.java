package ControleRemoto;

public class Video implements ControleRemoto {
	boolean ligado = true;

	@Override
	public void iniciar() {
		if (ligado == true) {
			System.out.println("Iniciar apresentação do filme (Fita HSV)");
		} else {
			System.out.println("Por favor, me ligue....");
		}
	}

	@Override
	public void pausar() {
		System.out.println("Pausar apresentação do filme (Fita HSV)");
	}

	@Override
	public void parar() {
		System.out.println("Parar apresentação do filme (Fita HSV)");


	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
