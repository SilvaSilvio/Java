package ExercicioEmregado;

//import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do Capital intelectual ");
		String nome = scan.next();
		System.out.println("Digite seu salário: ");
		double salario = scan.nextdouble();
	*/	
		Empregado empregados = new Empregado();
		empregados.setNome("Silvio");
		empregados.setSalario(1200);
	
		empregados.imprimirDados();
	}

}
