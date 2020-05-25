package ModificadorEstatico_Cliente;
//1 - O bloco de inicializa��o est�tico � executado quando a JVM carrega a p�gina (� executado apenas uma vez)
//2 - Alocado um espa�o na mem�ria para o objeto que ser� criado
//3 - cada atributo de classe � criado com seus valores default ou valores explicitos.
//4 -O bloc de inicializa��o � executado
//5 -O construtor � executado.
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
