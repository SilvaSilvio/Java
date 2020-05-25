package Polimorfismo;

public class RelatoriaPagamento {

	/*
	public void RelatoriaPagamentoGerente(Gerente gerente) {
		System.out.println("RELAT�RIO PAGAMENTO GERENTE");
		gerente.calcularSalario();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario do M�s: "+ gerente.getSalario());
		System.out.println("----------------------------------------");
		
	}
	
	public void RelatorioPagamentoVendedor(Vendedor vendedor) {
		System.out.println("RELAT�RIO PAGAMENTO VENDEDOR");
		vendedor.calcularSalario();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("CPF: " + vendedor.getCpf());
		System.out.println("Sal�rio do M�s " + vendedor.getSalario());
		System.out.println("----------------------------------------");
	}*/
	
	public void RelatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("RELAT�RIO PAGAMENTO DE FUNCION�RIO");
		funcionario.calcularSalario();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Sal�rio do M�s " + funcionario.getSalario());
		System.out.println("----------------------------------------");
	}
}
