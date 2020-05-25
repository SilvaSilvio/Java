package FORNECEDOR;

public class Escola {

	public static void main(String[] args) {
		Pessoa[] p = new Aluno[4];
		p[0] = new Aluno("Ana", "98989898", 10.0);
		p[1] = new Aluno("José", "121212", 5.0);
		//p[1] = new Professor("Sergio", "123321", 40000.0);

		for (Pessoa pessoa : p) {
			System.out.println(pessoa);
		}
		
	}

}
