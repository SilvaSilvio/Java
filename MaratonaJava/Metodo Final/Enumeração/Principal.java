package Enumeração;


public class Principal {

	public static void main(String... args) {
		Pessoa pessoa = new Pessoa("Beuga", TipoCliente.PESSOA_FISICA, Pessoa.TipoPagamento.AVISTA);
		System.out.println(pessoa);

	}

}
