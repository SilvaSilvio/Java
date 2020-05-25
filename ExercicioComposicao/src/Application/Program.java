package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Cliente;
import Entities.OrdemItem;
import Entities.OrdemProduto;
import Entities.Produto;
import Entities.enuns.OrdemStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Calendar cal = Calendar.getInstance();

		System.out.println("ENTRE COM O DADOS DO CLIENTE");
		System.out.print("Nome: ");
		String nomeCliente = scan.nextLine();
		System.out.print("E-mail: ");
		String emailCliente = scan.nextLine();
		System.out.print("Data Nascimento: ");
		Date AnversCliente = sdf.parse(scan.next());

		// Cliente cliente = new Cliente(nomeCliente, emailCliente, AnversCliente);

		System.out.println("STATUS DO PROCESSO");
		String status = scan.nextLine();

				System.out.print("Quantidade de Item: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Nome do Produto: ");
			String nomeProduto = scan.nextLine();
			System.out.println("Preço do produto:");
			double precoProduto = scan.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);
		}
		// String momento = "";
		OrdemProduto ordemProd = new OrdemProduto(OrdemStatus.valueOf(status),
				new Cliente(nomeCliente, emailCliente, AnversCliente));

		System.out.println("SUMARIO");
		// momento = cal.get(Calendar.DAY_OF_WEEK) + " " +
		// cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("STATUS: " + ordemProd.getStatus());
		System.out.println("Dados do Cliente");
		System.out.println("Nome: " + ordemProd.getCliente().getNome() + " email " + ordemProd.getCliente().getEmail()
				+ " Aniversário " + ordemProd.getCliente().getAniversario());

		System.out.println("INFORMAÇÕES DO ITEM");
		System.out.println();
	}
}
