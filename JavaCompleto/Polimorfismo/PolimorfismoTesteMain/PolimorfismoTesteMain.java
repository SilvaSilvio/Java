package PolimorfismoTesteMain;

import Polimorfismo.Funcionario;
import Polimorfismo.Gerente;
import Polimorfismo.RelatorioPagamento;
import Polimorfismo.Vendedor;

public class PolimorfismoTesteMain {

	public static void main(String[] args) {
		Gerente g = new Gerente("Silvio", 1500, 10);
		Vendedor v = new Vendedor("Nay", 2000, 20000.0);
		Funcionario f = new Vendedor("Silvano", 1200, 12000);
		Funcionario f1 = new Gerente("Aline", 5000, 3000);
		
		RelatorioPagamento relatorio = new RelatorioPagamento();
		
		relatorio.relatorioPagamentoGerente( g );
		relatorio.relatorioPagamentoVendedor(v);
		relatorio.relatorioPagamentoVendedor(v);
		relatorio.relatorioPagamentoGenerico(f);
		relatorio.relatorioPagamentoGenerico(f1);
	}

}
