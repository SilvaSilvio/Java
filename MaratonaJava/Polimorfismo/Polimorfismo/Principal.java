package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Gerente g = new Gerente("Antonio", 022002020, 10000, 3000);
		Vendedor v = new Vendedor("Marcio", 020202202, 5000, 12000);
		RelatoriaPagamento relatorio = new RelatoriaPagamento();
		//relatorio.RelatoriaPagamentoGerente(g);
		//relatorio.RelatorioPagamentoVendedor(v);
		//Vendedor v2 = new Vendedor("Beuga", 02002020202, 6000, 20000);
	//	relatorio.RelatorioPagamentoVendedor(v2);
		/*
		 * Vendedor[] vendedor = new Vendedor[2]; vendedor[0].nome = "Vladimir";
		 * vendedor[0].cpf = 020202; vendedor[0].salario = 1000;
		 * 
		 * vendedor[1].nome = "Sergio"; vendedor[1].cpf = 010121201; vendedor[1].salario
		 * = 1500;
		 * 
		 * for (Vendedor vend : vendedor) { System.out.println(vend); }
		 */ 
		
		relatorio.RelatorioPagamentoGenerico(g);
		System.out.println("-------------------------------------");
		relatorio.RelatorioPagamentoGenerico(g);
		System.out.println(g);
		System.out.println(v);
	}

}
