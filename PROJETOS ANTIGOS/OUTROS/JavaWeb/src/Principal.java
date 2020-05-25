
public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Maria",   1000000);
		Funcionario f2 = new Funcionario("Antonio", 1750000);
		Funcionario f3 = new Funcionario("Carlos",  1235000);
		Funcionario f4 = new Funcionario("Joaquim", 4521000);
		
		Funcionario[] funcionarios = {f1, f2, f3, f4};
		for (Funcionario funcionario : funcionarios) {
			funcionario.mostrarDados();
		}
	}

}
