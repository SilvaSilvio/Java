package ModificadorEstatico_Cliente;
//1 - O bloco de inicialização estático é executado quando a JVM carrega a página (é executado apenas uma vez)
//2 - Alocado um espaço na memória para o objeto que será criado
//3 - cada atributo de classe é criado com seus valores default ou valores explicitos.
//4 -O bloc de inicialização é executado
//5 -O construtor é executado.
public class Cliente {

	private static int[] parcela;

	{
		parcela = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcela[i - 1] = i;
		}
	}

	public Cliente() {

	}

	public static void setParcela(int[] parcela) {
		Cliente.parcela = parcela;
	}

	public static int[] getParcela() {
		return parcela;
	}
}
