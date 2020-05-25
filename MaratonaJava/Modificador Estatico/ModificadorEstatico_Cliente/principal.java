package ModificadorEstatico_Cliente;

public class principal {

	public static void main(String[] args) {
			//Cliente c = new Cliente();
			for(int parcela : Cliente.getParcela()) {
				System.out.print(parcela + " | ");
			}
	}

}
