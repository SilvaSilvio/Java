package Polimorfismo;

public class RelatoriaPagamento {

	/*
	public void RelatoriaPagamentoGerente(Gerente gerente) {
		System.out.println("RELATÓRIO PAGAMENTO GERENTE");
		gerente.calcularSalario();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario do Mês: "+ gerente.getSalario());
		System.out.println("----------------------------------------");
		
	}
	
	public void RelatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("RELATÓRIO PAGAMENTO VENDEDOR");
		vendedor.calcularSalario();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("CPF: " + vendedor.getCpf());
		System.out.println("Salário do Mês " + vendedor.getSalario());
		System.out.println("----------------------------------------");
	}*/
	
	public void RelatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("RELATÓRIO PAGAMENTO DE FUNCIONÁRIO");
		funcionario.calcularSalario();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário do Mês " + funcionario.getSalario());
		System.out.println("----------------------------------------");
	}
}
