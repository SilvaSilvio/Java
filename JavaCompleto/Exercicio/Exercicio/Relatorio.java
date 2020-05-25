package Exercicio;

public class Relatorio {
	public void RelatorioGenerico(Produto produto) {
		System.out.println("------- Relatório de Produtos -------------");
		produto.valorTributavel();
		System.out.println("Nome: " + produto.nome);
		System.out.println("Preço: "+ produto.preco);
		System.out.println("Preço final: " + produto.precofinal);
	}
}
