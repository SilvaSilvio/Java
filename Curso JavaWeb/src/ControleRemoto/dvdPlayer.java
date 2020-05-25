package ControleRemoto;

public class dvdPlayer implements ControleRemoto {

	@Override
	public void iniciar() {
		System.out.println("Iniciar apresentação do DVD PLAYER");

	}

	@Override
	public void pausar() {
		System.out.println("Pausar apresentação do DVD PLAYER");

	}

	@Override
	public void parar() {
		System.out.println("Parar apresentação do DVD PLAYER");

	}

	@Override
	public String getNome() {
	
	return null;
	}

}
