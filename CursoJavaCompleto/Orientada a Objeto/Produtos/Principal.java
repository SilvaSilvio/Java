package Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Produtos p = new Produtos();
		System.out.println("DADOS DO PRODUTO");
		System.out.print("Nome: ");
		p.nome = scan.nextLine();
		System.out.print("Preço: ");
		p.preco = scan.nextDouble();
		System.out.println("Quantidade: ");
		p.quant = scan.nextInt();
		
		p.status();
		p.EntradaProdutoEstoque(5);
		p.status();
		//p.SaidaProdutoEstoque(3);
		//p.totalProdutoEstoque();

		scan.close();
	}

}
