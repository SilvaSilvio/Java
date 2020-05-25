package EXERCICIO;

public class principal {

	public static void main(String[] args) {

		Funcionario[] func = new Funcionario[3];
		func[0] = new Funcionario("Maria", 20000);
		func[1] = new Funcionario("Maria", 1000);
		func[2] = new Funcionario("Maria", 1500);
		
	
		for (Funcionario funcionario : func) {
	System.out.println(funcionario);
			
		}
		}
}
