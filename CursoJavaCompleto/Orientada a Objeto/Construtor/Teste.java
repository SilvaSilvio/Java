package Construtor;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner scan = new Scanner(System.in);

			Construtor p = new Construtor("Mulher", 100, 2);
			
			p.status();
			p.calculoProduto();
			p.EntradaProdutoEstoque(5);
			p.status();
			//p.SaidaProdutoEstoque(3);
			//p.totalProdutoEstoque();
			scan.close();

		}

	}
